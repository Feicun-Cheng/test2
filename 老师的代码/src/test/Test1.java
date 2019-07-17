package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pojo.Student;

/**
* @类名  Test1.java
* @作者  lisir
* @版本  V1.0
* @日期  2019年7月2日-下午4:15:54
* @描述  
*
*/
public class Test1 {
	public static void main(String[] args) throws IOException {
	   // int i=1/0;
		//加载核心配置文件
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
		//sqlsession 
		//SqlSession session =sf.openSession();
		//开启自动提交
		SqlSession session =sf.openSession(true);  //Setting autocommit to false on JDBC Connection
		//增删改查
//		Student s = (Student)session.selectOne("test.selectStu", 100);
//		System.out.println(s);
		
//		List<Student> list = session.selectList("test.selectStuByName", "s");
//		System.out.println(list.size());  //2
		
		
//		List<Student> list = session.selectList("test.selall");
//		System.out.println(list.size());
		Student stu = new Student();
		stu.setStuid(100);
		stu.setName("ls1");
		stu.setAge(23);
		
		int num = session.update("test.updateStu",stu);
		System.out.println(num);   //1
		//session.commit();  //提交
		is.close();
	}
}
