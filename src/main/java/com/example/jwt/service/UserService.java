package com.example.jwt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.jwt.core.User;
import com.example.jwt.dao.MUserMapper;
import com.example.jwt.dao.RUserRepository;
import com.example.jwt.dto.UserDTOV;
import com.example.jwt.util.exception.RepositoryException;

@Service
public class UserService {

    @Autowired
    private MUserMapper mapper;

    @Autowired
    private RUserRepository repository;

    public Optional<User> findById(Long id) throws RepositoryException {
        return repository.findById(id);
    }

    public Page<UserDTOV> findAll(Pageable pageable) throws RepositoryException {
        return repository.findAll(pageable).map(mapper::toDTO);
    }

    public User save(User obj) {
        return repository.save(obj);
    }

    public User update(User obj) {
        return repository.save(obj);
    }

    public User delete(User obj) {
        obj.setStatus(ClassStatusEnum.DISABLE.getCode());
        return repository.save(obj);
    }
}
