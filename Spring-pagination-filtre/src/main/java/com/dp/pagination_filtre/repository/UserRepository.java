package com.dp.pagination_filtre.repository;

import com.dp.pagination_filtre.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

    // Filtrage simple
    Page<User> findByNameContaining(String name, Pageable pageable);

    // Filtrage multiple
    Page<User> findByNameContainingAndEmailContaining (String name, String email, Pageable pageable);
}
