package helper;

public class User {
	
	private String name;
	private String surname;
	private String city;
	private String phone;
	
	public User() {}
	
	public User(String name, String surname, String city, String phone) {
		this.name = name;
		this.surname = surname;
		this.city = city;
		this.phone = phone;
	}
	
	public User(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + "]";
	}

	
	
	
}
