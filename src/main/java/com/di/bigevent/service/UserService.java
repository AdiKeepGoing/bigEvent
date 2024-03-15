package com.di.bigevent.service;

import com.di.bigevent.pojo.User;

public interface UserService {
    void register(String username, String password);

    User findByUserName(String username);

    void update(User user);

    //更新头像
    void updateAvatar(String avatarUrl);

    //更新密码
    void updatePwd(String newPwd);
}
