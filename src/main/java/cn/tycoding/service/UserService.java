package cn.tycoding.service;

import cn.tycoding.entity.User;

/**
 * @auther TyCoding
 * @date 2018/9/28
 */
public interface UserService extends BaseService<User> {

    /**
     * 通过用户名查询用户
     *
     * @param name 用户名
     * @return User
     */
    User findByName(String name);
}
