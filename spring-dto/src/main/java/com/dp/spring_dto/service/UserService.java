package com.dp.spring_dto.service;

import com.dp.spring_dto.dto.UserDTO;
import com.dp.spring_dto.entity.User;
import com.dp.spring_dto.mapper.UserMapper;
import com.dp.spring_dto.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
private final UserMapper userMapper;
//    public List<User> getAll(){
//        return userRepository.findAll();
//    }

    public List<UserDTO> getAll(){
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDTO)
                .toList();
    }
//    public User save(User user){
//        return userRepository.save(user);
//    }
    public UserDTO save(User user){
        User saved = userRepository.save(user);
        return userMapper.toDTO(saved);
    }

}
