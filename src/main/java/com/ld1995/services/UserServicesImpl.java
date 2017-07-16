package com.ld1995.services;


import com.ld1995.models.User;
import com.ld1995.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServicesImpl implements IUserServices {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User findByNickname(String nickname) {
        return userRepository.findByNickname(nickname);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

}
