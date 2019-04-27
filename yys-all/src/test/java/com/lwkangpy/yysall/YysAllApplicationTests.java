package com.lwkangpy.yysall;

import com.lwkangpy.yysall.beans.Fragment;
import com.lwkangpy.yysall.beans.Hellspawn;
import com.lwkangpy.yysall.beans.User;
import com.lwkangpy.yysall.beans.YYS_Society;
import com.lwkangpy.yysall.dao.IFragmentDao;
import com.lwkangpy.yysall.dao.IUserDao;
import com.lwkangpy.yysall.services.IFragmentService;
import com.lwkangpy.yysall.services.IHellspawnService;
import com.lwkangpy.yysall.services.ISocietyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YysAllApplicationTests {

    @Autowired
    IUserDao dao;


    @Autowired
    private IFragmentService iFragmentService;
    @Autowired
    private IHellspawnService iHellspawnService;

    @Autowired
    private ISocietyService iUserService;
    @Test
    public void contextLoads() {


    }

}
