package com.example.dyupdate.dto.response;

import com.example.dyupdate.exception.ErrorCode;

public class ResultBuilder {

    public static <T> Result<T> onError(int code, String message) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static <T> Result<T> onSuc(T data) {
        Result<T> result = new Result<>();
        result.setCode(ErrorCode.SUCCESS.getCode());
        result.setMessage("成功");
        result.setData(data);
        return result;
    }

    public static <T> Result<T> onError(T data, int code, String message) {
        Result<T> result = new Result<>();
        result.setData(data);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }


}
