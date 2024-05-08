package com.practise.jwt.jwtauthentication.repositary;

import com.practise.jwt.jwtauthentication.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepositary extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String username);
}
