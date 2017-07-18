package com.ld1995.services;


import com.ld1995.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserServices extends UserDetailsService {
    public void saveUser(User user);
}
