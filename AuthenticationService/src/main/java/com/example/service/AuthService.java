package com.example.service;

import com.example.matedata.rsp.AuthRsp;

public interface AuthService {
    AuthRsp login(String userName, String password);
}
