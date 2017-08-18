package com.ld1995.services;

public interface ISecurityServices {

    String findLoggedInUsername();

    void autologin(String username, String password);
}
