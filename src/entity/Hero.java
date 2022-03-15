package entity;

public class Hero {
	private Long id;
	private String name;
	private String phone;
	private String address;
	private double latitude;
	private double longitude;
	
	
	public Hero(String name, String phone, String address, double latitude, double longitude) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
	}


	public Hero() {
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
