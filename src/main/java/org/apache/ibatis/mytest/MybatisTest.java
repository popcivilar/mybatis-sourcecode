package org.apache.ibatis.mytest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mytest.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {


    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("myabtis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSessionFactory.getConfiguration().addMapper(UserDao.class);
        SqlSession session = sqlSessionFactory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        System.out.println(userDao.getUsers());
        session.close();
    }
}
