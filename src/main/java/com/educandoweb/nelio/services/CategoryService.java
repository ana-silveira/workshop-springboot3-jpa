package com.educandoweb.nelio.services;

import com.educandoweb.nelio.entities.Category;
import com.educandoweb.nelio.entities.User;
import com.educandoweb.nelio.repositories.CategoryRepository;
import com.educandoweb.nelio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {

        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
