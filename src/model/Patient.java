package model;

public class Patient extends Person {
	private String dateOfRegistration;
	
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	
	public Patient(String name, String surname, String personalNumber, String dateOfBirth, String countryOfBirth, String city,
			String postalCode, String streetAndHouseNumber, String phone, String sex, String dateOfRegistration) {
		super(name, surname, personalNumber, dateOfBirth, countryOfBirth, city, postalCode, streetAndHouseNumber, phone, sex);
		this.dateOfRegistration = dateOfRegistration;
	}

}
