package com.dp.spring_dto.service;

import com.dp.spring_dto.entity.User;
import com.dp.spring_dto.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }
    public User save(User user){
        return userRepository.save(user);
    }
}
