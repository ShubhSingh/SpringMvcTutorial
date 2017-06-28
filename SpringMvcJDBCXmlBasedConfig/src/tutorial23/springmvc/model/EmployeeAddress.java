package tutorial23.springmvc.model;

public class EmployeeAddress {
	private String cityName, stateName, streetName;
	private int empId, pinCode;
	
	public EmployeeAddress(String cityName, String stateName, String streetName, int empId, int pinCode) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
		this.streetName = streetName;
		this.empId = empId;
		this.pinCode = pinCode;
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [cityName=" + cityName + ", stateName=" + stateName + ", streetName=" + streetName
				+ ", empId=" + empId + ", pinCode=" + pinCode + "]";
	}
	
}
