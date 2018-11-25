package com.sun.zq.exception;

import com.google.common.collect.Maps;
import java.util.Map;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CommonException {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> handlerException(Exception e){
        Map<String, Object> result = Maps.newHashMap();
        result.put("resCode","999");
        result.put("resMessage", e.getMessage());
        //正常开发中，可创建一个统一响应实体，如CommonResp
        return result;
    }
}
