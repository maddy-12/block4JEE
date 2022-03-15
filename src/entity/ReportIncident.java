package entity;

public class ReportIncident {
	private String address;
	private Double latitude;
	private Double longitude;
	private int type_incident;
	
	public ReportIncident(String address, Double latitude, Double longitude, int type_incident){
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.type_incident = type_incident;
	}

	public ReportIncident() {
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public int getType_incident() {
		return type_incident;
	}

	public void setType_incident(int type_incident) {
		this.type_incident = type_incident;
	}
	
	
	
}
