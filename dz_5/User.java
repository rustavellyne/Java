package dz_5;

public class User {

	public String name;
	public String position;
	
	public User(String name, String position) {
		this.name = name;
		this.position=position;
	}

	@Override
	public String toString() {
		return "User name=" + name + ", position=" + position;
	}
	
	
	
	
}
