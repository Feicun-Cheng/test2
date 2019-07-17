package pojo;
/**
* @类名  User.java
* @作者  songmj
* @版本  V1.0
* @日期  2019年7月2日-下午7:18:11
* @描述  
*/
public class User {
	private Integer id;
	private String name;
	private String pwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
}
