package com.example.controller;

import com.example.matedata.rsp.AuthRsp;
import com.example.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Resource
    private AuthService authService;

    @PostMapping("/login")
    public AuthRsp login(String userName, String password) {
        return authService.login(userName, password);
    }
}
