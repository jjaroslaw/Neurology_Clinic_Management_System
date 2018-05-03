package clinic;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Clinic {
	public static final String DB_URL = "jdbc:mysql://localhost:3306/neurology_clinic";
	public static final String ROOT = "root";
	public static final String PASSWORD = "password";
	
	private Connection conn;
	private Statement stat;
	
	public Clinic() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC driver necessary!");
            e.printStackTrace();
        }
		try {
			conn = (Connection) DriverManager.getConnection(DB_URL, ROOT, PASSWORD);
			stat = (Statement) conn.createStatement();
		}
		catch(SQLException e) {
			System.err.println("Database connection problem.");
		}
	}
	
	public boolean insertDoctor(String name, String surname, String personalNumber, String dateOfBirth, String countryOfBirth, String city,
			String postalCode, String streetAndHouseNumber, String phone, String sex, String licenceNumber,
			String specialty, String dateOfEmployment) {
		try {
			CallableStatement prepStmt = (CallableStatement) conn.prepareCall(
					"call insert_doctor(NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
			prepStmt.setString(1, name);
			prepStmt.setString(2, surname);
			prepStmt.setString(3, personalNumber);
			prepStmt.setString(4, dateOfBirth);
			prepStmt.setString(5, countryOfBirth);
			prepStmt.setString(6, city);
			prepStmt.setString(7, postalCode);
			prepStmt.setString(8, streetAndHouseNumber);
			prepStmt.setString(9, phone);
			prepStmt.setString(10, sex);
			prepStmt.setString(11, licenceNumber);
			prepStmt.setString(12, specialty);
			prepStmt.setString(13, dateOfEmployment);
			prepStmt.execute();
		}
		catch(SQLException e) {
			System.err.println("Doctor insertion problem.");
			return false;
		}
		return true;
	}
	
	public boolean insertPatient(String name, String surname, String personalNumber, String dateOfBirth, String countryOfBirth, String city,
			String postalCode, String streetAndHouseNumber, String phone, String sex, String dateOfRegistration) {
		try {
			CallableStatement prepStmt = (CallableStatement) conn.prepareCall(
					"call insert_patient(NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NULL, ?);");
			prepStmt.setString(1, name);
			prepStmt.setString(2, surname);
			prepStmt.setString(3, personalNumber);
			prepStmt.setString(4, dateOfBirth);
			prepStmt.setString(5, countryOfBirth);
			prepStmt.setString(6, city);
			prepStmt.setString(7, postalCode);
			prepStmt.setString(8, streetAndHouseNumber);
			prepStmt.setString(9, phone);
			prepStmt.setString(10, sex);
			prepStmt.setString(11, dateOfRegistration);
			prepStmt.execute();
		}
		catch(SQLException e) {
			System.err.println("Patient insertion problem.");
			return false;
		}
		return true;
	}
	
	public boolean insertSupportStaff(String name, String surname, String personalNumber, String dateOfBirth, String countryOfBirth, String city,
			String postalCode, String streetAndHouseNumber, String phone, String sex, String profession, String dateOfEmployment) {
		try {
			CallableStatement prepStmt = (CallableStatement) conn.prepareCall(
					"call insert_support_staff(NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NULL, ?, ?);");
			prepStmt.setString(1, name);
			prepStmt.setString(2, surname);
			prepStmt.setString(3, personalNumber);
			prepStmt.setString(4, dateOfBirth);
			prepStmt.setString(5, countryOfBirth);
			prepStmt.setString(6, city);
			prepStmt.setString(7, postalCode);
			prepStmt.setString(8, streetAndHouseNumber);
			prepStmt.setString(9, phone);
			prepStmt.setString(10, sex);
			prepStmt.setString(11, profession);
			prepStmt.setString(12, dateOfEmployment);
			prepStmt.execute();
		}
		catch(SQLException e) {
			System.err.println("Support Staff insertion problem.");
			return false;
		}
		return true;
	}
	
	public void closeConnection() {
		try {
			conn.close();
		}
		catch(SQLException e) {
			System.err.println("Connection close problem.");
			e.printStackTrace();
		}
	}
	// Countries list
	public List<String> selectCountries(){
		List<String> countries = new ArrayList<String>();
		try {
			ResultSet result = stat.executeQuery("SELECT country_code FROM country_of_birth;");
			String code;
			while(result.next()) {
				code = result.getString("country_code");
				countries.add(code);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return countries;
	}
	// Sex list
	public List<String> selectSex(){
		List<String> sexList = new ArrayList<String>();
		try {
			ResultSet result = stat.executeQuery("SELECT sex FROM sex;");
			String sex;
			while(result.next()) {
				sex = result.getString("sex");
				sexList.add(sex);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return sexList;
	}
	// Specialty list
		public List<String> selectSpecialty(){
			List<String> specialtyList = new ArrayList<String>();
			try {
				ResultSet result = stat.executeQuery("SELECT specialty FROM specialty_table;");
				String specialty;
				while(result.next()) {
					specialty = result.getString("specialty");
					specialtyList.add(specialty);
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
			return specialtyList;
		}
	// Specialty list
		public List<String> selectProfession(){
			List<String> professionList = new ArrayList<String>();
			try {
				ResultSet result = stat.executeQuery("SELECT profession FROM profession_table;");
				String profession;
				while(result.next()) {
					profession = result.getString("profession");
					professionList.add(profession);
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
			return professionList;
		}	
		
		// Specialty list
		public List<Object[]> selectDoctors(){
			List<Object[]> doctorsList = new ArrayList<Object[]>();
			try {
				ResultSet result = stat.executeQuery("select surname, name, personal_number, date_of_birth, city, postal_code, street_and_house_number, phone, sex, licence_number, specialty, date_of_doctor_employment from employees_list where licence_number IS NOT NULL order by surname;");
				String surname;
				String name;
				String personal_number;
				String date_of_birth;
				String city;
				String postal_code;
				String street_and_house_number;
				String phone;
				String sex;
				String licence_number;
				String specialty;
				String date_of_doctor_employment;
				while(result.next()) {
					surname = result.getString("surname");
					name = result.getString("name");
					personal_number = result.getString("personal_number");
					date_of_birth = result.getString("date_of_birth");
					city = result.getString("city");
					postal_code = result.getString("postal_code");
					street_and_house_number = result.getString("street_and_house_number");
					phone = result.getString("phone");
					sex = result.getString("sex");
					licence_number = result.getString("licence_number");
					specialty = result.getString("specialty");
					date_of_doctor_employment = result.getString("date_of_doctor_employment");
					
					doctorsList.add(new Object[]{surname, name, personal_number, date_of_birth, city, postal_code, street_and_house_number, phone, sex, licence_number, specialty, date_of_doctor_employment});
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
			return doctorsList;
		}	
}
