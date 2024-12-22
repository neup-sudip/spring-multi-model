package org.example.service;

import org.example.dto.UserDetail;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService {

    public UserDetail getAuthUser(){
        return UserDetail.builder()
                .userId("12345")
                .username("username")
                .authorities("USER")
                .build();
    }
}
