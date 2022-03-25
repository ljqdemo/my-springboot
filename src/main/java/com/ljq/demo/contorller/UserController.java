package com.ljq.demo.contorller;

import com.ljq.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 罗集强
 * @Date 2022/3/25 16:42
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Resource
    private IUserService userService;


    @GetMapping("/all")
    public String getAllUser(){
        log.error("=================");
        String s = userService.getAll().toString();
        log.error(s);
        return s;
    }
    @GetMapping
    public String getById(@RequestParam("id") Long id ){
        log.error("=================");
        String s = userService.getById(id).toString();
        log.error(s);
        return s;
    }
}
