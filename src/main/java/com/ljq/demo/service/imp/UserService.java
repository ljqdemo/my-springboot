package com.ljq.demo.service.imp;

import com.ljq.demo.entity.User;
import com.ljq.demo.repository.IUserRepository;
import com.ljq.demo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 罗集强
 * @Date 2022/3/25 16:31
 */
@Service
public class UserService implements IUserService {
    @Resource
    private IUserRepository repository;
    @Override
    public List<User> getAll() {
        return repository.getAll();
    }

    @Override
    public User getById(Long id) {
        return repository.getById(id);
    }
}
