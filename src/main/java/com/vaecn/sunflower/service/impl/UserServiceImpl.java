package com.vaecn.sunflower.service.impl;

import com.vaecn.sunflower.entity.User;
import com.vaecn.sunflower.mapper.UserMapper;
import com.vaecn.sunflower.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *   服务实现类
 * </p>
 *
 * @author sifan
 * @since 2017-09-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
