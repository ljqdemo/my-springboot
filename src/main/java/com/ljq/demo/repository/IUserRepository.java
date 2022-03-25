package com.ljq.demo.repository;

import com.ljq.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 罗集强
 * @Date 2022/3/25 16:32
 */
@Repository
public interface IUserRepository {


    List<User> getAll();

    User getById(@Param("id") Long id);
}
