package org.example.bdccspringmvc;

import org.example.bdccspringmvc.entities.Product;
import org.example.bdccspringmvc.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
//import org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BdccSpringMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(BdccSpringMvcApplication.class, args);
    }
    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                            .name("Computer")
                            .price(5400)
                            .quantity(12)
                    .build());
            productRepository.save(Product.builder()
                    .name("printer")
                    .price(5400)
                    .quantity(11)
                    .build());
            productRepository.save(Product.builder()
                    .name("Smartphone")
                    .price(12000)
                    .quantity(33)
                    .build());
            productRepository.findAll().forEach(p-> {
                System.out.println(p.toString());
            });
        };
    }

}
