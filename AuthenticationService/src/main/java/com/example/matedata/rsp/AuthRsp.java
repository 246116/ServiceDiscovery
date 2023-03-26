package com.example.matedata.rsp;

import lombok.Data;

@Data
public class AuthRsp {

    boolean authResult;

    String authToken;
}
