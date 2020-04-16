package com.soft1851.springboot.jwt.exception;

import com.soft1851.springboot.jwt.common.ResultCode;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/15
 */
public class JwtException extends RuntimeException {

    protected ResultCode resultCode;

    public JwtException(String msg, ResultCode resultCode) {
        super(msg);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}