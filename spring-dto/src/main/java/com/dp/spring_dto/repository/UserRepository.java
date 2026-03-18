package com.dp.spring_dto.repository;

import com.dp.spring_dto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
