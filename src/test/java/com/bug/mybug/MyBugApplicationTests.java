package com.bug.mybug;

import com.bug.mybug.entity.UserEntity;
import com.bug.mybug.repository.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class MyBugApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void saveUser() {
        UserEntity user = new UserEntity().setAddress(UUID.randomUUID().toString())
                .setUsername("ssss")
                .setPasswordHash(UUID.randomUUID().toString())
                .setEmail(UUID.randomUUID().toString())
                ;
        userService.save(user);
    }


}
