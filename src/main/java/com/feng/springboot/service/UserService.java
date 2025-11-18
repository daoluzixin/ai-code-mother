package com.feng.springboot.service;

import java.util.List;

import com.feng.springboot.model.dto.user.UserQueryRequest;
import com.feng.springboot.model.entity.User;
import com.feng.springboot.model.vo.LoginUserVO;
import com.feng.springboot.model.vo.UserVO;
import com.mybatisflex.core.service.IService;
import com.mybatisflex.core.query.QueryWrapper;
import jakarta.servlet.http.HttpServletRequest;

/**
 * 用户服务
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

//    /**
//     * 获取当前登录用户（允许未登录）
//     *
//     * @param request
//     * @return
//     */
//    User getLoginUserPermitNull(HttpServletRequest request);
//
//    /**
//     * 是否为管理员
//     *
//     * @param request
//     * @return
//     */
//    boolean isAdmin(HttpServletRequest request);
//
//    /**
//     * 是否为管理员
//     *
//     * @param user
//     * @return
//     */
//    boolean isAdmin(User user);

    /**
     * 获取脱敏的用户信息
     *
     * @param userList
     * @return
     */
//    List<UserVO> getUserVO(List<User> userList);

    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取脱敏的已登录用户信息
     *
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取脱敏的用户信息
     *
     * @param user
     * @return
     */
    UserVO getUserVO(User user);



    /**
     * 获取查询条件
     *
     * @param userQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);
    /**
     * 加密
     *
     * @param userPassword 用户密码
     * @return 加密后的用户密码
     */
    String getEncryptPassword(String userPassword);
}
