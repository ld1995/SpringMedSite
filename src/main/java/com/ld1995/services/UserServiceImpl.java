package com.ld1995.services;

import com.ld1995.models.Role;
import com.ld1995.models.User;
import com.ld1995.repository.IUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements IUserServices, UserDetailsService {

    @Autowired
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void saveUser(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public User loadUserByUsername(@NotNull String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
        //return userRepository.findAll().stream().filter(user -> user.getUsername().equals(username)).findAny()
          //      .orElseThrow( () -> new UsernameNotFoundException("user" + username + " waw not found!"));
    }

//    @PostConstruct
//    public void init () {
//        userRepository.findByUsername("ld1995").ifPresent(user -> {
//            user.setAuthorities(Arrays.asList(new Role("user")));
//            userRepository.save(user);
//        });
//    }

}
