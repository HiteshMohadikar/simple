package hitesh.mvc.modal;

public class User {
	 int uid;
	 @Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", userid=" + userid + ", password=" + password + "]";
	}
	String name;
	 String userid;
	 String password;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
