package org.example.bdccensetspringmvc;

import org.example.bdccensetspringmvc.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BdccEnsetSpringMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(BdccEnsetSpringMvcApplication.class, args);
    }
    @Bean
    public CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()

                    .build());
        };

    }

}
