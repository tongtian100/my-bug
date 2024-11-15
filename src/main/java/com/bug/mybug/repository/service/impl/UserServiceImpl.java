package com.bug.mybug.repository.service.impl;

import com.bug.mybug.entity.UserEntity;
import com.bug.mybug.repository.mapper.UserMapper;
import com.bug.mybug.repository.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author codeGen
 * @since 2024-11-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

}
