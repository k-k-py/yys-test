package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lwkangpy.yys_all.MyBatiesUtils.MyBatisUtils;
import com.lwkangpy.yys_all.beans.Fragment;
import com.lwkangpy.yys_all.beans.Hellspawn;
import com.lwkangpy.yys_all.beans.Master;
import com.lwkangpy.yys_all.beans.User;
import com.lwkangpy.yys_all.beans.YYS_Society;
import com.lwkangpy.yys_all.dao.IFragmentDao;
import com.lwkangpy.yys_all.dao.IHellspawnDao;
import com.lwkangpy.yys_all.dao.IMasterDao;
import com.lwkangpy.yys_all.dao.IUserDao;
import com.lwkangpy.yys_all.dao.IYYS_SocietyDao;

import net.sf.json.JSONArray;



public class MyTest {
	
	private IUserDao dao1;
	private IFragmentDao dao2;
	private IHellspawnDao dao3;
	private IMasterDao dao4;
	private IYYS_SocietyDao dao5;
	
	private SqlSession sqlSession;
	@Before
	public void before(){
		//获取sqlsession
		sqlSession = MyBatisUtils.getSqlSession();
		dao1 = sqlSession.getMapper(IUserDao.class);
		dao2 = sqlSession.getMapper(IFragmentDao.class);
		dao3 = sqlSession.getMapper(IHellspawnDao.class);
		dao4 = sqlSession.getMapper(IMasterDao.class);
		dao5 = sqlSession.getMapper(IYYS_SocietyDao.class);
		
	}
	@After
	public void after(){
		//关闭sqlsession
		if(sqlSession != null){
			sqlSession.close();
		}
		
	}	
	@Test
	public void test01(){
		User user = new User("13939393611", "123456");
		System.out.println("插入前:user =" + user );
		dao1.insertUser(user);
		sqlSession.commit();
		System.out.println("插入后:user =" + user);
	}
	@Test
	public void test02(){
		//user测试
		List<User> allUsers = dao1.selectAllUsers();
		for (User user : allUsers) {
			System.out.println("User = " + user);
		}
		
		User user1 = dao1.selectUserById(1);
		System.out.println("user1 = " +  user1);
		
		User user2 = dao1.selectUserByName("18814664479");
		System.out.println("user2 =" + user2);
	}
	@Test
	public void test03(){
		//hellspawn测试 
		//添加
	/*	Hellspawn hs = new Hellspawn("犬神","sr");
		System.out.println("插入前 hs = " + hs);
		dao3.insertHellspawn(hs);
		sqlSession.commit();
		System.out.println("插入后 hs = " + hs);*/
		//修改
		Hellspawn hs = new Hellspawn("姑获鸟","sr");
		hs.setId(34);
		dao3.updateHellspawn(hs);
		sqlSession.commit();
		System.out.println("修改后 hs = " + hs);
		//删除测试
		//dao3.deleteHellspawnById(33);
		//sqlSession.commit();
		
	}
	@Test
	public void test04(){
		//hellspawn测试 

		List<Hellspawn> sah = dao3.selectAllHellspawn();
		for (Hellspawn hellspawn : sah) {
			System.out.println("Hellspawn = " + hellspawn);
		}
		
		System.out.println("=============================================" );
		Hellspawn shbi = dao3.selectHellspawnById(2);
		System.out.println("HellspawnById = " + shbi);
		
		System.out.println("=============================================" );
		Hellspawn shbi1 = dao3.selectHellspawnByName("大天狗");
		System.out.println("HellspawnByName = " + shbi1);
		
		System.out.println("=============================================" );
		List<Hellspawn> sah1 = dao3.selectHellspawnByType("ssr");
		for (Hellspawn hellspawn : sah1) {
			System.out.println("Hellspawn1 = " + hellspawn);
		}
		
	}
	@Test
	public void test05(){
		//YYS_Society测试 
		
		//添加
		/*YYS_Society ys = new YYS_Society("犬神");
		System.out.println("插入前 ys = " + ys);
		dao5.insertYYS_Society(ys);
		sqlSession.commit();
		System.out.println("插入后 ys = " + ys);*/
		
		//修改
		/*YYS_Society ys = new YYS_Society("姑获鸟");
		ys.setId(2);
		sqlSession.commit();
		System.out.println("修改后 ys = " + ys);*/
		
		//删除测试
		dao5.deleteYYS_SocietyById(2);
		sqlSession.commit();
		
	}
	@Test
	public void test06(){
		//YYS_Society测试 
		List<YYS_Society> selectAllYYS_Society = dao5.selectAllYYS_Society();
		for (YYS_Society yys_Society : selectAllYYS_Society) {
			System.out.println("yys_Society = " + yys_Society);
		}
		System.out.println("=============================================" );
		
		YYS_Society selectYYS_SocietyById = dao5.selectYYS_SocietyById(1);
		System.out.println("selectYYS_SocietyById = " + selectYYS_SocietyById);
		System.out.println("=============================================" );
		
		YYS_Society selectYYS_SocietyByName = dao5.selectYYS_SocietyByName("有关部门");
		System.out.println("selectYYS_SocietyByName = " + selectYYS_SocietyByName);
		System.out.println("=============================================" );
	}
	@Test
	public void test07(){
		//Master测试
		
		//insert测试
		User user = new User();
		user.setId(2);
		
		YYS_Society yys = new YYS_Society();
		yys.setId(2);
		
		Master ma = new Master("戮神", 1417, user, yys);
		System.out.println("插入前ma = " + ma);
		dao4.insertMaster(ma);
		sqlSession.commit();
		System.out.println("插入后ma = " + ma);
	}
	
	@Test
	public void test08(){
		//Master测试 查询测试
		/*Master selectMasterById = dao4.selectMasterById(1);
		System.out.println(selectMasterById);
		System.out.println("=====================");
		Master selectMasterByName = dao4.selectMasterByName("咸鱼已自闭");
		System.out.println(selectMasterByName);*/
		System.out.println("=====================");
		List<Master> selectMasterByUser_Id = dao4.selectMasterByUser_Id(1);
		for (Master master : selectMasterByUser_Id) {
			
			System.out.println( master);
		}
		JSONArray JSON = new JSONArray().fromObject(selectMasterByUser_Id);
		System.out.println("=====================" + JSON);
		/*Master selectMasterByYys_Id = dao4.selectMasterByYys_Id(4519372);
		System.out.println(selectMasterByYys_Id);
		System.out.println("=====================");
		List<Master> selectMasterByYys_SocietyId = dao4.selectMasterByYys_SocietyId(1);
		for (Master master : selectMasterByYys_SocietyId) {
			
			System.out.println(master);
		}
		System.out.println("=====================");
		*/
		//Fragment查询测试
		/*Fragment selectFragmentById = dao2.selectFragmentById(2);
		System.out.println(selectFragmentById);
		
		List<Fragment> selectFragmentByYys_Id = dao2.selectFragmentByYys_Id(4519372);
		for (Fragment fragment : selectFragmentByYys_Id) {
			System.out.println("4519372 :" + fragment);
		}*/
	}
	@Test
	public void test09(){
		Master master = new Master();
		master.setYys_Id(12314);
		Hellspawn hellspawn = new Hellspawn();
		hellspawn.setId(2);
		Fragment f = new Fragment(hellspawn , 16, master);
		f.setId(5);
		//System.out.println(f);
		dao2.updateFragment(f);
		//dao2.insertFragment(f);
		sqlSession.commit();
		
		System.out.println("知后" + f);
	}
	
}
