package com.example.demo.service;

import com.example.demo.entity.UserSecurity;

public interface UserSecurityService {
    UserSecurity getUser(String name);

    boolean oldPasswordIsValid(UserSecurity userSecurity,String oldPassword);
    void changePassword(UserSecurity userSecurity, String newPassword);
}
