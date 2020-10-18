package com.chenys.designpatterns.exception.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>描述: [异常信息容器] </p>
 * <p>创建时间: 2020/10/18 </p>
 *
 * @author <a href="mailto:chenys@highzap.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorBody {
    @JsonProperty("error_code")
    private Integer errCode;
    @JsonProperty("error_msg")
    private String errMsg;
}
