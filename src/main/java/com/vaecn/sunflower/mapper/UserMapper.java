package com.vaecn.sunflower.mapper;

import com.vaecn.sunflower.entity.User;
import com.vaecn.sunflower.provider.UserSQLProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * Created by sifan on 2017/8/30.
 */
public interface UserMapper {

    @UpdateProvider(type = UserSQLProvider.class, method = "dynamicCreateUserTableDDL")
    void dynamicCreateTable(String tableName);

    @Update("CREATE TABLE `user` (\n" +
            "  `id` bigint(20) NOT NULL AUTO_INCREMENT,\n" +
            "  `name` varchar(64) DEFAULT NULL,\n" +
            "  `age` int(11) DEFAULT NULL,\n" +
            "  PRIMARY KEY (`id`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8;")
    void createTable();

    @Select("select * from user where name = #{name}")
    User findByName(@Param("name") String name);

    @Insert("insert into user(name, age) values(#{name}, #{age})")
    void insert(@Param("name") String name, @Param("age") Integer age);
}
