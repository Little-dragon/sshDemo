package com.entity;

public class Member {
	private int id;
	private String username;
    private String password;
    private String address;
    private String email;
    private int level;
    
    public Member() {
    }
    
    public Member(String username,String password,String address,String email,int level){
        this.username = username;
        this.password = password;
        this.address = address;
        this.email = email;
        this.level = level;
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Member [username=" + username + ", password=" + password + ", address=" + address
				+ ", email=" + email + ", level=" + level + "]";
	}
}
