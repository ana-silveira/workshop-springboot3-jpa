package com.educandoweb.nelio.repositories;

import com.educandoweb.nelio.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
