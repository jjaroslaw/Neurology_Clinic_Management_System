package model;

public class Doctor extends Person {
	private String licenceNumber;
	private String specialty;
	private String dateOfEmployment;
	
	public String getLicenceNumber() {
		return licenceNumber;
	}
	public void setLincenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getDateOfEmployment() {
		return dateOfEmployment;
	}
	public void setDateOfEmployment(String dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}
	
	public Doctor(String name, String surname, String personalNumber, String dateOfBirth, String countryOfBirth, String city,
			String postalCode, String streetAndHouseNumber, String phone, String sex, String licenceNumber,
			String specialty, String dateOfEmployment) {
		super(name, surname, personalNumber, dateOfBirth, countryOfBirth, city, postalCode, streetAndHouseNumber, phone, sex);
		this.licenceNumber = licenceNumber;
		this.specialty = specialty;
		this.dateOfEmployment = dateOfEmployment;
	}

}
