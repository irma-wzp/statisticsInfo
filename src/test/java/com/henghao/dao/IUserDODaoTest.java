package com.henghao.dao;

import com.henghao.common.domain.entity.UserDO;
import com.henghao.common.vo.UsrLongAndLatVo;
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

public class IUserDODaoTest extends TestCase {



    @Autowired
    private IUserDao userDao;

    @Test
    public void testFindByUid() throws Exception {
        UserDO userDO = userDao.selectByPrimaryKey("HZ8bb0c95caaecd4015caf6b39ad3243");
        System.out.println(userDO);

    }


    @Test
    public void testSelectUserTitudesDao() throws Exception {

        List<UsrLongAndLatVo> list = userDao.selectUserTitudesDao();
        System.out.println(list.size());

    }
}