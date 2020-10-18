package com.chenys.designpatterns.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * <p>描述: [业务类异常] </p>
 * <p>创建时间: 2020/10/18 </p>
 *
 * @author <a href="mailto:chenys@highzap.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Getter
public class BusinessException extends RuntimeException {
    private Integer errCode;
    private String errMsg;
    private HttpStatus httpStatus;

    public BusinessException(Integer errCode, String errMsg, HttpStatus httpStatus) {
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.httpStatus = httpStatus;
    }
}
