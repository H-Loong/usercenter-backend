package com.hloong.usercenter.service;

import com.hloong.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import jakarta.servlet.http.HttpServletRequest;


/**
*
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-04-17 16:11:22
*/
    public interface UserService extends IService<User> {


    /**
     * 用户注册
     *
     * @param userAccount       用户账号
     * @param userPassword      用户密码
     * @param checkPassword     校验密码
     * @return                  新用户id
     */
        long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount       用户账号
     * @param userPassword      用户密码
     * @return                  脱敏后的用户信息
     */
        User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户信息脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

}
