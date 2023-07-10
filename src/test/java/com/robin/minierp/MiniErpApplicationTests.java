package com.robin.minierp;

import com.robin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MiniErpApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Spring Loaded");
    }

    @Test
    void mybatisLoaded() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        System.out.println("Mybatis Loaded");
    }

}
