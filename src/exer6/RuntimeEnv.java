package exer6;

public class RuntimeEnv {
	private static RuntimeEnv uniqueInstance;
	
	private String username;
	private String password;
	private String level;
	
	private RuntimeEnv() {}
	
	public synchronized static RuntimeEnv getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new RuntimeEnv();
		}
		return uniqueInstance;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	
	
	
	
}
