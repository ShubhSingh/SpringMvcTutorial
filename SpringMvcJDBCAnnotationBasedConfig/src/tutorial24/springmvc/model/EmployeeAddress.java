package tutorial24.springmvc.model;

import org.hibernate.validator.constraints.Length;

public class EmployeeAddress {
	@Length(min=3,max=30)
	private String cityName;
	@Length(min=3,max=30)
	private String stateName;
	private String streetName;
	private int empId;
	private String pinCode;
	
	public EmployeeAddress() {
	}
	
	public EmployeeAddress(String cityName, String stateName, String streetName, int empId, String pinCode) {
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
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [cityName=" + cityName + ", stateName=" + stateName + ", streetName=" + streetName
				+ ", empId=" + empId + ", pinCode=" + pinCode + "]";
	}
	
}
