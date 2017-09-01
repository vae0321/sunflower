package com.vaecn.sunflower;

import com.vaecn.sunflower.entity.Group;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sifan on 2017/8/31.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class GroupMapperTest {

//    @Autowired
//    private GroupMapper groupMapper;

    @Test
    public void testInsert() {
        Group group = new Group();
        group.setId(1);
//        group.setGroupName("admin");
//        groupMapper.insertSelective(group);
    }

    @Test
    public void testDumpStack() {
        Thread.dumpStack();
    }
}
