package com.vaecn.sunflower;

import com.vaecn.sunflower.entity.User;
import com.vaecn.sunflower.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sifan on 2017/8/30.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testCreate() {
        userMapper.dynamicCreateTable("user_2");
    }

    @Test
    public void testInsert() {
        userMapper.insert("zhangsan", 18);
        userMapper.insert("lisi", 20);
    }

    @Test
    public void testFind() {
        User lisi = userMapper.findByName("lisi");
        Assert.assertEquals(20, lisi.getAge().intValue());
    }
}
