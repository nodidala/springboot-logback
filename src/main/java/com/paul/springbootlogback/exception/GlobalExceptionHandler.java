package com.paul.springbootlogback.exception;

import com.paul.springbootlogback.model.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author paul
 * @Description
 * @date 2019/8/1 17:18
 */
public class GlobalExceptionHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    public ResponseResult processException(Exception ex, HttpServletRequest request, HttpServletResponse response){
        ex.printStackTrace();

        if(ex instanceof MissingServletRequestParameterException){
            return new ResponseResult(400, ex.getMessage(), null);
        }
        if(ex instanceof NoFoundExcepiton){

            LOGGER.error("======="+ex.getMessage()+"=======");
            return new ResponseResult(401, "无法找到相应数据！", null);

        }

        return new ResponseResult(500, ex.getMessage(), null);

    }
}
