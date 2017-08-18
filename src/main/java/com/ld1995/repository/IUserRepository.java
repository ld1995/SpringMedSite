package com.ld1995.repository;

import com.ld1995.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("userRepository")
public interface IUserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);

}
