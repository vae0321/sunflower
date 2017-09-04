package com.vaecn.sunflower;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.vaecn.sunflower.entity.Role;
import com.vaecn.sunflower.mapper.RoleMapper;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sifan on 2017/8/31.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RoleMapperTest {

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void testInsert() {
        Role role = new Role();
        role.setName("admin");
        roleMapper.insert(role);
    }

    @Test
    public void testActiveRecord() {
        Role role = new Role();
        role.setName("user");
        role.insert();
    }

    @Test
    public void testFind() {
        Role role = roleMapper.selectById(2);
        Assertions.assertThat(role.getId()).isEqualTo(2);

        List<Role> roles = roleMapper.selectList(new EntityWrapper<Role>().eq("name", "user"));
        Assertions.assertThat(roles.size()).isEqualTo(1);
    }
}
