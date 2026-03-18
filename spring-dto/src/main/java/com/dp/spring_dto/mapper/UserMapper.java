package com.dp.spring_dto.mapper;


import com.dp.spring_dto.dto.UserDTO;
import com.dp.spring_dto.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {


    public UserDTO toDTO(User user){
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        return dto;
    }

    public User toEntity (UserDTO dto){
        User user = new User();
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        return user;
    }
}
