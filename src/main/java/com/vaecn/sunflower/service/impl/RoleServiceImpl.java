package com.vaecn.sunflower.service.impl;

import com.vaecn.sunflower.entity.Role;
import com.vaecn.sunflower.mapper.RoleMapper;
import com.vaecn.sunflower.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
	
}
