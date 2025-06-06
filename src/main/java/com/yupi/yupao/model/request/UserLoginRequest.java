package com.yupi.yupao.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    // [加入编程导航](https://yupi.icu) 入门捷径+交流答疑+项目实战+求职指导，帮你自学编程不走弯路

    private String userPassword;
}
