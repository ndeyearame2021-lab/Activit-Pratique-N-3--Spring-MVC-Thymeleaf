package org.example.bdccensetspringmvc.repository;

import org.example.bdccensetspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicRepository extends JpaRepository<Product, Long > {

}
