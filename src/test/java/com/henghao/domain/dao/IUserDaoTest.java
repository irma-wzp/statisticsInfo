package com.henghao.domain.dao;

import com.henghao.domain.entity.User;
import com.henghao.vo.user.UsrLongAndLatVo;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//配置spring和junit整合，这样junit在启动时就会加载spring容器
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-orm.xml"})

public class IUserDaoTest extends TestCase {



    @Autowired
    private IUserDao userDao;

    @Test
    public void testFindByUid() throws Exception {
        User user = userDao.selectByPrimaryKey("HZ8bb0c95caaecd4015caf6b39ad3243");
        System.out.println(user);

    }


    @Test
    public void testSelectUserTitudesDao() throws Exception {

        List<UsrLongAndLatVo> list = userDao.selectUserTitudesDao();
        System.out.println(list.size());

    }
}