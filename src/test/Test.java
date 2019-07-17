package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pojo.User;

/**
* @类名  Test.java
* @作者  songmj
* @版本  V1.0
* @日期  2019年7月2日-下午7:41:07
* @描述  测试测试
*/
public class Test {

	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sf.openSession(true);
		
		User u1 = new User();
		u1.setName("张明");
		u1.setPwd("123");
		User u2 = new User();
		u2.setId(2);
		u2.setName("小红");
		u2.setPwd("234");
		User u3 = new User();
		u3.setId(3);
		u3.setName("张石");
		u3.setPwd("345");
		int insert = session.insert("test.insertUser", u1);
//		int insert2 = session.insert("test.insertUser2", u1);
//		Integer id2 = u1.getId();
//		Integer id = u1.getId();
//		System.out.println(insert2+":"+id2);
//		session.insert("test.insertUser", u2);
//		session.insert("test.insertUser", u3);
		
//		User u4 = (User)session.selectOne("test.selectUser", 2);
//		System.out.println(u4);
		
//		session.delete("test.delUser", 2);
		
//		List<User> list = new ArrayList<User>();
//		list = session.selectList("test.selectName", "张");
//		System.out.println(list);
		
//		User u5 = new User();
//		u5.setId(1);
//		u5.setName("刘翔");
//		u5.setPwd("234");
//		session.update("test.updateUser", u5);
//		is.close();
	}

}
