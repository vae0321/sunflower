package com.vaecn.sunflower.provider;

/**
 * Created by sifan on 2017/8/30.
 */
public class UserSQLProvider {

    public String dynamicCreateUserTableDDL(String tableName) {
        return String.format("CREATE TABLE `%s` (" +
                " `id` bigint(20) NOT NULL AUTO_INCREMENT," +
                " `name` varchar(64) DEFAULT NULL," +
                " `age` int(11) DEFAULT NULL," +
                "  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;", tableName);
    }
}
