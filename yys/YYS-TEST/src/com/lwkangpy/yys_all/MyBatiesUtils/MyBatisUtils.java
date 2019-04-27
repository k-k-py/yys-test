package com.lwkangpy.yys_all.MyBatiesUtils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//工具类得到sqlSession对象
public class MyBatisUtils {
	private static SqlSessionFactory sqlSessionFactory;
	public static SqlSession getSqlSession(){
		try {
			InputStream is = Resources.getResourceAsStream("mybatis.xml");
			if (sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			}
			return sqlSessionFactory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
