package com.guigu.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.reggie.entity.User;
import com.guigu.reggie.mapper.UserMapoer;
import com.guigu.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapoer, User> implements UserService {
}
