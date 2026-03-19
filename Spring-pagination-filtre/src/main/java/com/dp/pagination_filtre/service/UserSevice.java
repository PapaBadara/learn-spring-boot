package com.dp.pagination_filtre.service;

import com.dp.pagination_filtre.entity.User;
import com.dp.pagination_filtre.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserSevice {

    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Page<User> getUsers(int page, int size){
//        return userRepository.findAll(PageRequest.of(page, size));
//        BONUS : TRI
        return userRepository.findAll(PageRequest.of(page, size, Sort.by("name").ascending()));

    }

    public Page<User> searchUsers (String name, int page, int size){
        return userRepository.findByNameContaining(name, PageRequest.of(page, size));
    }

    public Page<User> filterUsers(String name, String email, int page, int size){
        return userRepository.findByNameContainingAndEmailContaining(name, email, PageRequest.of(page,size));
    }
}
