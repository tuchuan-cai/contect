package application;

public class User extends Person {
	private String username = null;
	private String password = null;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		this.username= null;
		this.password = null;
	}
}
