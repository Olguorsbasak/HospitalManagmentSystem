package Model;

public class User {
	
	private int id;
	String tcnum,name,password,type;
	
	public User(int id, String tcnum, String name, String password, String type) {
		super();
		this.id = id;
		this.tcnum = tcnum;
		this.name = name;
		this.password = password;
		this.type = type;
	}
	public User() {}
	
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTcnum() {
		return this.tcnum;
	}
	public void setTcnum(String tcnum) {
		this.tcnum = tcnum;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
