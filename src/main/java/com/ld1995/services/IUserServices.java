package com.ld1995.services;


import com.ld1995.models.User;

public interface IUserServices {

    public User findByNickname(String nickname);
    public void saveUser(User user);
}
