package com.dp.pagination_filtre.service;

import com.dp.pagination_filtre.entity.User;
import com.dp.pagination_filtre.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserSevice userService;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void shouldReturnUsersPage() {

        // Arrange
        List<User> users = List.of(
                new User(1L, "Diop", "diop@gmail.com", 25)
        );
        Page<User> page = new PageImpl<>(users);

        when(userRepository.findAll(any(Pageable.class))).thenReturn(page);

        // Act
        Page<User> result = userService.getUsers(0, 5);

        // Assert
        assertEquals(1, result.getContent().size());
        verify(userRepository).findAll(any(Pageable.class));
    }
}

