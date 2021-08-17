package com.example.jwt.dao;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.jwt.core.User;
import com.example.jwt.dto.UserDTOV;

@Component
public class MUserMapper {

    @Autowired
    private ModelMapper mapper;

    public UserDTOV toDTO(User obj) {
        return mapper.map(obj, UserDTOV.class);
    }
}
