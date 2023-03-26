package com.example.service.impl;

import com.example.matedata.rsp.AuthRsp;
import com.example.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private static Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);

    @Override
    public AuthRsp login(String userName, String password) {
        logger.info("user start to login, userName is " + userName);
        AuthRsp rsp = new AuthRsp();

        // todo auth relative operate
        rsp.setAuthResult(true);
        return rsp;
    }
}
