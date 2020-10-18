package com.chenys.designpatterns.exception;

import com.chenys.designpatterns.exception.model.ErrorBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <p>描述: [全局异常处理器] </p>
 * <p>创建时间: 2020/10/18 </p>
 *
 * @author <a href="mailto:chenys@highzap.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorBody> handlerBusinessException(BusinessException ex) {
        ErrorBody errorBody = new ErrorBody(ex.getErrCode(), ex.getErrMsg());
        return new ResponseEntity(errorBody, ex.getHttpStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorBody> handlerBusinessException(Exception ex) {
        ErrorBody errorBody = new ErrorBody(500500, "服务内部错误");
        return new ResponseEntity(errorBody, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
