package com.eq1;

import mapper.QqMemberMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.QqMember;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/23 21:01
 * @Description: 沈泽鹏写点注释吧
 */
public class Test1 {
//    public static void main(String[] args) {
//        System.out.println(1);
//    }
    @Test
    public void  selectAll() throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();

        //4.使用SqlSession创建Dao接口的代理对象
        QqMemberMapper mapper = session.getMapper(QqMemberMapper.class);
        //5.使用代理对象执行方法
        List<QqMember> all = mapper.findAll();
        for(QqMember user : all){
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
    }

    @Test
    public void add() throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();

        //4.使用SqlSession创建Dao接口的代理对象
        QqMemberMapper mapper = session.getMapper(QqMemberMapper.class);
        //5.使用代理对象执行方法
        QqMember qqMember=new QqMember();
        qqMember.setImgUrl("asdasdasda");
        qqMember.setNickName("asdasdasdasda");
        qqMember.setPassword("sdagasfgajsnfogi");
        qqMember.setSex("男");

        Integer result = mapper.add(qqMember);
        System.out.println("添加结果："+result);
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }

    @Test
    public void delete() throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();

        //4.使用SqlSession创建Dao接口的代理对象
        QqMemberMapper mapper = session.getMapper(QqMemberMapper.class);
        //5.使用代理对象执行方法

        Integer result = mapper.delete(3);
        System.out.println("删除结果："+result);
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }

    @Test
    public void update() throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();

        //4.使用SqlSession创建Dao接口的代理对象
        QqMemberMapper mapper = session.getMapper(QqMemberMapper.class);
        //5.使用代理对象执行方法
        QqMember qqMember=new QqMember();
        qqMember.setId(9);
        qqMember.setQqNumber("12312312");
        Integer result = mapper.update(qqMember);
        System.out.println("修改结果："+result);
        //session.commit();
        //6.释放资源
        session.close();
        in.close();
    }
}
