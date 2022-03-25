package com.ljq.demo.service;


import com.ljq.demo.entity.User;

import java.util.List;

/**
 * @Author 罗集强
 * @Date 2022/3/25 16:31
 */
public interface IUserService {
    List<User> getAll();

    User getById(Long id);
}
