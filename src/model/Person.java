package model;

public class Person {
	private int id;
	private String name;
	private String surname;
	private String personalNumber;
	private String dateOfBirth;
	private String countryOfBirth;
	private String city;
	private String postalCode;
	private String streetAndHouseNumber;
	private String phone;
	private String sex;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCountryOfBirth() {
		return countryOfBirth;
	}
	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getStreetAndHouseNumber() {
		return streetAndHouseNumber;
	}
	public void setStreetAndHouseNumber(String streetAndHouseNumber) {
		this.streetAndHouseNumber = streetAndHouseNumber;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Person(String name, String surname, String personalNumber, String dateOfBirth, String countryOfBirth, String city,
			String postalCode, String streetAndHouseNumber, String phone, String sex) {
		this.name = name;
		this.surname = surname;
		this.personalNumber = personalNumber;
		this.dateOfBirth = dateOfBirth;
		this.countryOfBirth = countryOfBirth;
		this.city = city;
		this.postalCode = postalCode;
		this.streetAndHouseNumber = streetAndHouseNumber;
		this.phone = phone;
		this.sex = sex;
	}
}
