package com.educandoweb.nelio.repositories;

import com.educandoweb.nelio.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
