package model;

public class SupportStaff extends Person{
	private String profession;
	private String dateOfEmployment;
	
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getDateOfEmployment() {
		return dateOfEmployment;
	}
	public void setDateOfEmployment(String dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}
	
	public SupportStaff(String name, String surname, String personalNumber, String dateOfBirth, String countryOfBirth, String city,
			String postalCode, String streetAndHouseNumber, String phone, String sex, String profession, String dateOfEmployment) {
		super(name, surname, personalNumber, dateOfBirth, countryOfBirth, city, postalCode, streetAndHouseNumber, phone, sex);
		this.profession = profession;
		this.dateOfEmployment = dateOfEmployment;
	}

}
