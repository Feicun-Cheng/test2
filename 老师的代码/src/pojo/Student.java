package pojo;
/**
* @类名  Student.java
* @作者  lisir
* @版本  V1.0
* @日期  2019年7月2日-下午4:02:55
* @描述  
*
*/
public class Student {
	private Integer stuid;
	private String name;
	private String pwd;
	private Integer age;
	private String gender;
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", name=" + name + ", pwd=" + pwd + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	

}
