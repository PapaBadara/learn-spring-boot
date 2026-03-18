package com.dp.spring_dto.controller;

import com.dp.spring_dto.dto.UserDTO;
import com.dp.spring_dto.entity.User;
import com.dp.spring_dto.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserDTO> getAll(){
        return userService.getAll();
    }

    @PostMapping
    public UserDTO create(@RequestBody User user){
        return userService.save(user);
    }
}
