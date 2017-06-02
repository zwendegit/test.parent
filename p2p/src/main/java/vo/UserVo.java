package vo;

public class UserVo {

	private String username;
	
	private int id;
	
	private char sex;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "UserVo [username=" + username + ", id=" + id + ", sex=" + sex
				+ "]";
	}
	
	
}
