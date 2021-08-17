package com.example.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jwt.core.User;

@Repository
public interface RUserRepository extends JpaRepository<User, Long>{

}
