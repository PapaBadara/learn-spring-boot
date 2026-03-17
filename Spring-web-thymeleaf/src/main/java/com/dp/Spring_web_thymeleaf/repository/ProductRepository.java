package com.dp.Spring_web_thymeleaf.repository;

import com.dp.Spring_web_thymeleaf.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
