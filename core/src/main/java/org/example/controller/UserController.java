package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.ApiResponse;
import org.example.dto.UserDetail;
import org.example.service.UserDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserDetailService userDetailService;

    @GetMapping("/profile")
    public ResponseEntity<ApiResponse<?>> getProfile(){
        ApiResponse<UserDetail> response = ApiResponse.<UserDetail>builder()
                .data(userDetailService.getAuthUser())
                .code("000")
                .message("Details")
                .build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
