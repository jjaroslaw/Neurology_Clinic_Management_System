import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import clinic.Clinic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NeurologyClinic extends Clinic{
	
	Clinic clinic = new Clinic();
	
	JFrame frame = new JFrame("Neurology Clinic");
	
	JPanel panel = new JPanel();
	JPanel signInPanel = new JPanel();
	JPanel adminMainPanel = new JPanel();
	JPanel supportStaffMainPanel = new JPanel();
	JPanel doctorPanel = new JPanel();
	JPanel patientPanel = new JPanel();
	JPanel supportStaffPanel = new JPanel();
	JPanel showDoctorsPanel = new JPanel();
	
	JButton signInButton = new JButton("Sign in");
	JButton signOutButton = new JButton("Sign out");
	JButton addDoctorButton = new JButton("Add doctor to Database");
	JButton addDoctor = new JButton("Add doctor");
	JButton addPatientButton = new JButton("Add patient to Database");
	JButton addPatient = new JButton("Add patient");
	JButton addSupportStaffButton = new JButton("Add health staff to Database");
	JButton addSupportStaff = new JButton("Add health staff");
	
	// Health Staff Main Menu
	JButton showDoctors = new JButton("Show doctors");
	
	JLabel signInTitle;
	JLabel login;
	JTextField loginField;
	JLabel password;
	JTextField passwordField;
	
	JLabel adminTitle;
	JLabel supportStaffTitle;
	JLabel showDoctorsTitle;
	
	JLabel addDoctorTitle;
	JLabel addName;
	JTextField nameField;
	JLabel addSurname;
	JTextField surnameField;
	JLabel addPersonalNumber;
	JTextField personalNumberField;
	JLabel addDateOfBirth;
	JTextField dateOfBirthField;
	JLabel addCountryOfBirth;
	JComboBox<Object> countryOfBirthCB;
	JLabel addCity;
	JTextField cityField;
	JLabel addPostalCode;
	JTextField postalCodeField;
	JLabel addStreetAndHouseNumber;
	JTextField streetAndHouseNumberField;
	JLabel addPhone;
	JTextField phoneField;
	JLabel addSex;
	JComboBox<Object> sexCB;
	JLabel addLicenceNumber;
	JTextField licenceNumberField;
	JLabel addSpecialty;
	JComboBox<Object> specialtyCB;
	JLabel addDateOfEmployment;
	JTextField dateOfEmploymentField;
	JLabel wrongData;
	
	
	JLabel addPatientTitle;
	JLabel addDateOfRegistration;
	JTextField dateOfRegistrationField;
	
	JLabel addSupportStaffTitle;
	JLabel addProfession;
	JComboBox<Object> professionCB;
	
	JButton adminMainMenuButton = new JButton("Main Menu");
	JButton supportStaffMainMenuButton = new JButton("Main Menu");
	
	CardLayout cl = new CardLayout();
	
	JTable doctorsTable;
	String[] doctorsTableColumnNames = {"Surname", "Name", "Date of birth", "Country of birth", "City", "Postal code", "Address", "Phone", "Sex", "Licence number", "Specialty", "Date of employment"};
	DefaultTableModel model;
	JScrollPane doctorTableScroll;
	
	public NeurologyClinic() {
		panel.setLayout(cl);
		//doctorPanel.add(adminMainMenuButton);
		
		panel.add(signInPanel, "Sign in Panel");
		panel.add(adminMainPanel, "Admin Main Panel");
		panel.add(supportStaffMainPanel, "Support Staff Main Panel");
		panel.add(doctorPanel, "Adding Doctor Panel");
		panel.add(patientPanel, "Adding Patient Panel");
		panel.add(supportStaffPanel, "Adding Health Staff Panel");
		panel.add(showDoctorsPanel, "Show doctors Panel");
		cl.show(panel, "Sign in Panel");
		
		wrongData = new JLabel("Wrong data! Check everything.");
		wrongData.setForeground(Color.RED);
		wrongData.setVisible(false);
		
		signInButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 String login = loginField.getText();
	             String password = passwordField.getText();
	                if(login.equals("admin") && password.equals("admin")) {
	                	paintAdminMainPanel();
	                	cl.show(panel, "Admin Main Panel");
	                	wrongData.setVisible(false);
	                }
	                else if(login.equals("12345") && password.equals("12345")) {
	                	paintSupportStaffMainPanel();
	                	cl.show(panel, "Support Staff Main Panel");
	                	wrongData.setVisible(false);
	                }
	                else {
	                    wrongData.setVisible(true);
	                }
			}
			
		});
		
		signOutButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(panel, "Sign in Panel");
				loginField.setText("");
				passwordField.setText("");
			}
			
		});
		
		
		addDoctorButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panel, "Adding Doctor Panel");
				GroupLayout doctorPanelLayout = new GroupLayout(doctorPanel);
				doctorPanel.setLayout(doctorPanelLayout);
				doctorPanelLayout.setAutoCreateGaps(true);
				doctorPanelLayout.setAutoCreateContainerGaps(true);
				doctorPanel.setBackground(new Color(228, 228, 228));
				
				doctorPanelLayout.setHorizontalGroup(doctorPanelLayout.createParallelGroup()
						.addComponent(addDoctorTitle)
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(doctorPanelLayout.createParallelGroup()
								.addGroup(doctorPanelLayout.createSequentialGroup()
									.addComponent(addName, 10, 10, Short.MAX_VALUE).addComponent(nameField, 10, 10, Short.MAX_VALUE).addComponent(addSurname, 10, 10, Short.MAX_VALUE).addComponent(surnameField, 10, 10, Short.MAX_VALUE))
								.addGroup(doctorPanelLayout.createSequentialGroup()
									.addComponent(addPersonalNumber, 10, 10, Short.MAX_VALUE).addComponent(personalNumberField, 10, 10, Short.MAX_VALUE).addComponent(addDateOfBirth, 10, 10, Short.MAX_VALUE).addComponent(dateOfBirthField, 10, 10, Short.MAX_VALUE))
								.addGroup(doctorPanelLayout.createSequentialGroup()
									.addComponent(addCountryOfBirth, 10, 10, Short.MAX_VALUE).addComponent(countryOfBirthCB, 10, 10, Short.MAX_VALUE).addComponent(addCity, 10, 10, Short.MAX_VALUE).addComponent(cityField, 10, 10, Short.MAX_VALUE))
								.addGroup(doctorPanelLayout.createSequentialGroup()
										.addComponent(addPostalCode, 10, 10, Short.MAX_VALUE).addComponent(postalCodeField, 10, 10, Short.MAX_VALUE).addComponent(addStreetAndHouseNumber, 10, 10, Short.MAX_VALUE).addComponent(streetAndHouseNumberField, 10, 10, Short.MAX_VALUE))
								.addGroup(doctorPanelLayout.createSequentialGroup()
										.addComponent(addPhone, 10, 10, Short.MAX_VALUE).addComponent(phoneField, 10, 10, Short.MAX_VALUE).addComponent(addSex, 10, 10, Short.MAX_VALUE).addComponent(sexCB, 10, 10, Short.MAX_VALUE))
								.addGroup(doctorPanelLayout.createSequentialGroup()
										.addComponent(addLicenceNumber, 10, 10, Short.MAX_VALUE).addComponent(licenceNumberField, 10, 10, Short.MAX_VALUE).addComponent(addSpecialty, 10, 10, Short.MAX_VALUE).addComponent(specialtyCB, 10, 10, Short.MAX_VALUE)))
						.addGroup(doctorPanelLayout.createSequentialGroup()
								.addComponent(addDateOfEmployment, 10, 10, Short.MAX_VALUE).addGap(10,10,10).addComponent(dateOfEmploymentField, 10, 10, Short.MAX_VALUE).addGap(247, 247, Short.MAX_VALUE))
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(doctorPanelLayout.createSequentialGroup()
								.addComponent(wrongData).addGap(100, 100, Short.MAX_VALUE).addComponent(addDoctor).addComponent(adminMainMenuButton))
						);
				
				doctorPanelLayout.setVerticalGroup(doctorPanelLayout.createSequentialGroup()
						.addComponent(addDoctorTitle)
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(doctorPanelLayout.createParallelGroup()
								.addGroup(doctorPanelLayout.createSequentialGroup()
									.addComponent(addName, 20, 20, Short.MAX_VALUE).addComponent(addPersonalNumber, 20, 20, Short.MAX_VALUE).addComponent(addCountryOfBirth, 20, 20, Short.MAX_VALUE).addComponent(addPostalCode, 20, 20, Short.MAX_VALUE).addComponent(addPhone, 20, 20, Short.MAX_VALUE).addComponent(addLicenceNumber, 20, 20, Short.MAX_VALUE))
								.addGroup(doctorPanelLayout.createSequentialGroup()
									.addComponent(nameField, 20, 20, Short.MAX_VALUE).addComponent(personalNumberField, 20, 20, Short.MAX_VALUE).addComponent(countryOfBirthCB, 20, 20, Short.MAX_VALUE).addComponent(postalCodeField, 20, 20, Short.MAX_VALUE).addComponent(phoneField, 20, 20, Short.MAX_VALUE).addComponent(licenceNumberField, 20, 20, Short.MAX_VALUE))
								.addGroup(doctorPanelLayout.createSequentialGroup()
										.addComponent(addSurname, 20, 20, Short.MAX_VALUE).addComponent(addDateOfBirth, 20, 20, Short.MAX_VALUE).addComponent(addCity, 20, 20, Short.MAX_VALUE).addComponent(addStreetAndHouseNumber, 20, 20, Short.MAX_VALUE).addComponent(addSex, 20, 20, Short.MAX_VALUE).addComponent(addSpecialty, 20, 20, Short.MAX_VALUE))
								.addGroup(doctorPanelLayout.createSequentialGroup()
										.addComponent(surnameField, 20, 20, Short.MAX_VALUE).addComponent(dateOfBirthField, 20, 20, Short.MAX_VALUE).addComponent(cityField, 20, 20, Short.MAX_VALUE).addComponent(streetAndHouseNumberField, 20, 20, Short.MAX_VALUE).addComponent(sexCB, 20, 20, Short.MAX_VALUE).addComponent(specialtyCB, 20, 20, Short.MAX_VALUE)))
						.addGroup(doctorPanelLayout.createParallelGroup()
								.addComponent(addDateOfEmployment, 20, 20, 23).addComponent(dateOfEmploymentField, 10, 10, 23))
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(doctorPanelLayout.createParallelGroup()
								.addComponent(wrongData).addComponent(addDoctor).addComponent(adminMainMenuButton))
						);
			}
		});
		
		addPatientButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(panel, "Adding Patient Panel");
				
				GroupLayout patientPanelLayout = new GroupLayout(patientPanel);
				patientPanel.setLayout(patientPanelLayout);
				patientPanelLayout.setAutoCreateGaps(true);
				patientPanelLayout.setAutoCreateContainerGaps(true);
				patientPanel.setBackground(new Color(228, 228, 228));
				
				patientPanelLayout.setHorizontalGroup(patientPanelLayout.createParallelGroup()
						.addComponent(addPatientTitle)
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(patientPanelLayout.createParallelGroup()
								.addGroup(patientPanelLayout.createSequentialGroup()
									.addComponent(addName, 10, 10, Short.MAX_VALUE).addComponent(nameField, 10, 10, Short.MAX_VALUE).addComponent(addSurname, 10, 10, Short.MAX_VALUE).addComponent(surnameField, 10, 10, Short.MAX_VALUE))
								.addGroup(patientPanelLayout.createSequentialGroup()
									.addComponent(addPersonalNumber, 10, 10, Short.MAX_VALUE).addComponent(personalNumberField, 10, 10, Short.MAX_VALUE).addComponent(addDateOfBirth, 10, 10, Short.MAX_VALUE).addComponent(dateOfBirthField, 10, 10, Short.MAX_VALUE))
								.addGroup(patientPanelLayout.createSequentialGroup()
									.addComponent(addCountryOfBirth, 10, 10, Short.MAX_VALUE).addComponent(countryOfBirthCB, 10, 10, Short.MAX_VALUE).addComponent(addCity, 10, 10, Short.MAX_VALUE).addComponent(cityField, 10, 10, Short.MAX_VALUE))
								.addGroup(patientPanelLayout.createSequentialGroup()
										.addComponent(addPostalCode, 10, 10, Short.MAX_VALUE).addComponent(postalCodeField, 10, 10, Short.MAX_VALUE).addComponent(addStreetAndHouseNumber, 10, 10, Short.MAX_VALUE).addComponent(streetAndHouseNumberField, 10, 10, Short.MAX_VALUE))
								.addGroup(patientPanelLayout.createSequentialGroup()
										.addComponent(addPhone, 10, 10, Short.MAX_VALUE).addComponent(phoneField, 10, 10, Short.MAX_VALUE).addComponent(addSex, 10, 10, Short.MAX_VALUE).addComponent(sexCB, 10, 10, Short.MAX_VALUE)))
						.addGroup(patientPanelLayout.createSequentialGroup()
								.addComponent(addDateOfRegistration, 10, 10, Short.MAX_VALUE).addGap(10,10,10).addComponent(dateOfRegistrationField, 10, 10, Short.MAX_VALUE).addGap(247, 247, Short.MAX_VALUE))
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(patientPanelLayout.createSequentialGroup()
								.addComponent(wrongData).addGap(100, 100, Short.MAX_VALUE).addComponent(addPatient).addComponent(supportStaffMainMenuButton))
						);
				
				patientPanelLayout.setVerticalGroup(patientPanelLayout.createSequentialGroup()
						.addComponent(addPatientTitle)
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(patientPanelLayout.createParallelGroup()
								.addGroup(patientPanelLayout.createSequentialGroup()
									.addComponent(addName, 20, 20, Short.MAX_VALUE).addComponent(addPersonalNumber, 20, 20, Short.MAX_VALUE).addComponent(addCountryOfBirth, 20, 20, Short.MAX_VALUE).addComponent(addPostalCode, 20, 20, Short.MAX_VALUE).addComponent(addPhone, 20, 20, Short.MAX_VALUE))
								.addGroup(patientPanelLayout.createSequentialGroup()
									.addComponent(nameField, 20, 20, Short.MAX_VALUE).addComponent(personalNumberField, 20, 20, Short.MAX_VALUE).addComponent(countryOfBirthCB, 20, 20, Short.MAX_VALUE).addComponent(postalCodeField, 20, 20, Short.MAX_VALUE).addComponent(phoneField, 20, 20, Short.MAX_VALUE))
								.addGroup(patientPanelLayout.createSequentialGroup()
										.addComponent(addSurname, 20, 20, Short.MAX_VALUE).addComponent(addDateOfBirth, 20, 20, Short.MAX_VALUE).addComponent(addCity, 20, 20, Short.MAX_VALUE).addComponent(addStreetAndHouseNumber, 20, 20, Short.MAX_VALUE).addComponent(addSex, 20, 20, Short.MAX_VALUE))
								.addGroup(patientPanelLayout.createSequentialGroup()
										.addComponent(surnameField, 20, 20, Short.MAX_VALUE).addComponent(dateOfBirthField, 20, 20, Short.MAX_VALUE).addComponent(cityField, 20, 20, Short.MAX_VALUE).addComponent(streetAndHouseNumberField, 20, 20, Short.MAX_VALUE).addComponent(sexCB, 20, 20, Short.MAX_VALUE)))
						.addGroup(patientPanelLayout.createParallelGroup()
								.addComponent(addDateOfRegistration, 20, 20, 23).addComponent(dateOfRegistrationField, 10, 10, 23))
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(patientPanelLayout.createParallelGroup()
								.addComponent(wrongData).addComponent(addPatient).addComponent(supportStaffMainMenuButton))
						);
			}
			
		});
		
		addSupportStaffButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(panel, "Adding Health Staff Panel");
				GroupLayout supportStaffPanelLayout = new GroupLayout(supportStaffPanel);
				supportStaffPanel.setLayout(supportStaffPanelLayout);
				supportStaffPanelLayout.setAutoCreateGaps(true);
				supportStaffPanelLayout.setAutoCreateContainerGaps(true);
				supportStaffPanel.setBackground(new Color(228, 228, 228));
				
				supportStaffPanelLayout.setHorizontalGroup(supportStaffPanelLayout.createParallelGroup()
						.addComponent(addSupportStaffTitle)
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(supportStaffPanelLayout.createParallelGroup()
								.addGroup(supportStaffPanelLayout.createSequentialGroup()
									.addComponent(addName, 10, 10, Short.MAX_VALUE).addComponent(nameField, 10, 10, Short.MAX_VALUE).addComponent(addSurname, 10, 10, Short.MAX_VALUE).addComponent(surnameField, 10, 10, Short.MAX_VALUE))
								.addGroup(supportStaffPanelLayout.createSequentialGroup()
									.addComponent(addPersonalNumber, 10, 10, Short.MAX_VALUE).addComponent(personalNumberField, 10, 10, Short.MAX_VALUE).addComponent(addDateOfBirth, 10, 10, Short.MAX_VALUE).addComponent(dateOfBirthField, 10, 10, Short.MAX_VALUE))
								.addGroup(supportStaffPanelLayout.createSequentialGroup()
									.addComponent(addCountryOfBirth, 10, 10, Short.MAX_VALUE).addComponent(countryOfBirthCB, 10, 10, Short.MAX_VALUE).addComponent(addCity, 10, 10, Short.MAX_VALUE).addComponent(cityField, 10, 10, Short.MAX_VALUE))
								.addGroup(supportStaffPanelLayout.createSequentialGroup()
										.addComponent(addPostalCode, 10, 10, Short.MAX_VALUE).addComponent(postalCodeField, 10, 10, Short.MAX_VALUE).addComponent(addStreetAndHouseNumber, 10, 10, Short.MAX_VALUE).addComponent(streetAndHouseNumberField, 10, 10, Short.MAX_VALUE))
								.addGroup(supportStaffPanelLayout.createSequentialGroup()
										.addComponent(addPhone, 10, 10, Short.MAX_VALUE).addComponent(phoneField, 10, 10, Short.MAX_VALUE).addComponent(addSex, 10, 10, Short.MAX_VALUE).addComponent(sexCB, 10, 10, Short.MAX_VALUE))
								.addGroup(supportStaffPanelLayout.createSequentialGroup()
										.addComponent(addProfession, 10, 10, Short.MAX_VALUE).addComponent(professionCB, 10, 10, Short.MAX_VALUE).addComponent(addDateOfEmployment, 10, 10, Short.MAX_VALUE).addComponent(dateOfEmploymentField, 10, 10, Short.MAX_VALUE)))
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(supportStaffPanelLayout.createSequentialGroup()
								.addComponent(wrongData).addGap(100, 100, Short.MAX_VALUE).addComponent(addSupportStaff).addComponent(adminMainMenuButton))
						);
				
				supportStaffPanelLayout.setVerticalGroup(supportStaffPanelLayout.createSequentialGroup()
						.addComponent(addSupportStaffTitle)
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(supportStaffPanelLayout.createParallelGroup()
								.addGroup(supportStaffPanelLayout.createSequentialGroup()
									.addComponent(addName, 20, 20, Short.MAX_VALUE).addComponent(addPersonalNumber, 20, 20, Short.MAX_VALUE).addComponent(addCountryOfBirth, 20, 20, Short.MAX_VALUE).addComponent(addPostalCode, 20, 20, Short.MAX_VALUE).addComponent(addPhone, 20, 20, Short.MAX_VALUE).addComponent(addProfession, 20, 20, Short.MAX_VALUE))
								.addGroup(supportStaffPanelLayout.createSequentialGroup()
									.addComponent(nameField, 20, 20, Short.MAX_VALUE).addComponent(personalNumberField, 20, 20, Short.MAX_VALUE).addComponent(countryOfBirthCB, 20, 20, Short.MAX_VALUE).addComponent(postalCodeField, 20, 20, Short.MAX_VALUE).addComponent(phoneField, 20, 20, Short.MAX_VALUE).addComponent(professionCB, 20, 20, Short.MAX_VALUE))
								.addGroup(supportStaffPanelLayout.createSequentialGroup()
										.addComponent(addSurname, 20, 20, Short.MAX_VALUE).addComponent(addDateOfBirth, 20, 20, Short.MAX_VALUE).addComponent(addCity, 20, 20, Short.MAX_VALUE).addComponent(addStreetAndHouseNumber, 20, 20, Short.MAX_VALUE).addComponent(addSex, 20, 20, Short.MAX_VALUE).addComponent(addDateOfEmployment, 20, 20, Short.MAX_VALUE))
								.addGroup(supportStaffPanelLayout.createSequentialGroup()
										.addComponent(surnameField, 20, 20, Short.MAX_VALUE).addComponent(dateOfBirthField, 20, 20, Short.MAX_VALUE).addComponent(cityField, 20, 20, Short.MAX_VALUE).addComponent(streetAndHouseNumberField, 20, 20, Short.MAX_VALUE).addComponent(sexCB, 20, 20, Short.MAX_VALUE).addComponent(dateOfEmploymentField, 20, 20, Short.MAX_VALUE)))
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(supportStaffPanelLayout.createParallelGroup()
								.addComponent(wrongData).addComponent(addSupportStaff).addComponent(adminMainMenuButton))
						);
				
			}
			
		});
		
		adminMainMenuButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panel, "Admin Main Panel");
				clearTextFields();
				wrongData.setVisible(false);
			}
		});
		
		supportStaffMainMenuButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(panel, "Support Staff Main Panel");
				clearTextFields();
				wrongData.setVisible(false);
			}
			
		});
		
		
		// Sign in panel
		signInTitle = new JLabel("Sign in");
		signInTitle.setFont(new Font("Arial", Font.BOLD, 37));
		login = new JLabel("Login:");
		loginField = new JTextField();
		password = new JLabel("Password:");
		passwordField = new JTextField();
		
		GroupLayout signInPanelLayout = new GroupLayout(signInPanel);
		signInPanel.setLayout(signInPanelLayout);
		signInPanelLayout.setAutoCreateGaps(true);
		signInPanelLayout.setAutoCreateContainerGaps(true);
		signInPanel.setBackground(new Color(228, 228, 228));
		
		signInPanelLayout.setHorizontalGroup(signInPanelLayout.createParallelGroup()
				.addComponent(signInTitle)
				.addGap(30, 30, Short.MAX_VALUE)
				.addGroup(signInPanelLayout.createParallelGroup()
						.addGroup(signInPanelLayout.createSequentialGroup()
								.addGap(10, 10, Short.MAX_VALUE).addComponent(login, 10, 10, 80).addComponent(loginField, 10, 10, Short.MAX_VALUE).addGap(10, 10, Short.MAX_VALUE))
						.addGroup(signInPanelLayout.createSequentialGroup()
								.addGap(10, 10, Short.MAX_VALUE).addComponent(password, 10, 10, 80).addComponent(passwordField, 10, 10, Short.MAX_VALUE).addGap(10, 10, Short.MAX_VALUE)))
				.addGap(30, 30, Short.MAX_VALUE)
				.addGroup(signInPanelLayout.createSequentialGroup()
						.addGap(30, 30, Short.MAX_VALUE).addComponent(wrongData).addComponent(signInButton))
				);
		
		signInPanelLayout.setVerticalGroup(signInPanelLayout.createSequentialGroup()
				.addComponent(signInTitle)
				.addGap(30, 30, Short.MAX_VALUE)
				.addGroup(signInPanelLayout.createParallelGroup()
						.addGroup(signInPanelLayout.createSequentialGroup()
							.addComponent(login, 10, 10, 25).addComponent(password, 10, 10, 25))
						.addGroup(signInPanelLayout.createSequentialGroup()
							.addComponent(loginField, 10, 10, 25).addComponent(passwordField, 10, 10, 25)))
				.addGap(30, 30, Short.MAX_VALUE)
				.addGroup(signInPanelLayout.createParallelGroup()
						.addComponent(wrongData).addComponent(signInButton))
				);
		
		
		
		// Doctor Panel
		addDoctorTitle = new JLabel("Add doctor");
		addDoctorTitle.setFont(new Font("Arial", Font.BOLD, 37));
		addName = new JLabel("Name:");
		nameField = new JTextField();
		addSurname = new JLabel("Surname:");
		surnameField = new JTextField();
		addPersonalNumber = new JLabel("Personal Number:");
		personalNumberField = new JTextField();
		addDateOfBirth = new JLabel("Date of birth (yyyy-mm-dd):");
		dateOfBirthField = new JTextField();
		addCountryOfBirth = new JLabel("Country of birth:");
		countryOfBirthCB = new JComboBox<Object>(clinic.selectCountries().toArray());
		addCity = new JLabel("City:");
		cityField = new JTextField();
		addPostalCode = new JLabel("Postal code (xx-xxx):");
		postalCodeField = new JTextField();
		addStreetAndHouseNumber = new JLabel("Street and house number:");
		streetAndHouseNumberField = new JTextField();
		addPhone = new JLabel("Phone number:");
		phoneField = new JTextField();
		addSex = new JLabel("Sex:");
		sexCB = new JComboBox<Object>(clinic.selectSex().toArray());
		addLicenceNumber = new JLabel("Licence number:");
		licenceNumberField = new JTextField();
		addSpecialty = new JLabel("Specialty:");
		specialtyCB = new JComboBox<Object>(clinic.selectSpecialty().toArray());
		addDateOfEmployment = new JLabel("Date of employment (yyyy-mm-dd):");
		dateOfEmploymentField = new JTextField();
		
		
		//Add doctor button in add doctor panel
		addDoctor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					if (insertDoctor(nameField.getText(), surnameField.getText(), personalNumberField.getText(), dateOfBirthField.getText(), countryOfBirthCB.getSelectedItem().toString(), cityField.getText(),
							postalCodeField.getText(), streetAndHouseNumberField.getText(), phoneField.getText(), sexCB.getSelectedItem().toString(), licenceNumberField.getText(),
							specialtyCB.getSelectedItem().toString(), dateOfEmploymentField.getText())) {
						wrongData.setVisible(false);
					}
					else {
						wrongData.setVisible(true);
					}
			}
		});
		

		// Patient Panel
		addPatientTitle = new JLabel("Add patient");
		addPatientTitle.setFont(new Font("Arial", Font.BOLD, 37));
		addDateOfRegistration = new JLabel("Date of registration (yyyy-mm-dd):");
		dateOfRegistrationField = new JTextField();
		
		//Add patient button in add patient panel
		addPatient.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					if (insertPatient(nameField.getText(), surnameField.getText(), personalNumberField.getText(), dateOfBirthField.getText(), countryOfBirthCB.getSelectedItem().toString(), cityField.getText(),
							postalCodeField.getText(), streetAndHouseNumberField.getText(), phoneField.getText(), sexCB.getSelectedItem().toString(), dateOfRegistrationField.getText())) {
						wrongData.setVisible(false);
					}
					else {
						wrongData.setVisible(true);
					}
			}
		});
		

		// Support Staff Panel
		addSupportStaffTitle = new JLabel("Add Health Staff");
		addSupportStaffTitle.setFont(new Font("Arial", Font.BOLD, 37));
		addProfession = new JLabel("Profession:");
		professionCB = new JComboBox<Object>(clinic.selectProfession().toArray());
		
		//Add support staff button in add support staff
		addSupportStaff.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					if (insertSupportStaff(nameField.getText(), surnameField.getText(), personalNumberField.getText(), dateOfBirthField.getText(), countryOfBirthCB.getSelectedItem().toString(), cityField.getText(),
							postalCodeField.getText(), streetAndHouseNumberField.getText(), phoneField.getText(), sexCB.getSelectedItem().toString(), professionCB.getSelectedItem().toString(),
							dateOfEmploymentField.getText())) {
						wrongData.setVisible(false);
					}
					else {
						wrongData.setVisible(true);
					}
			}
		});
		
		// Show doctor panel
		showDoctorsTitle = new JLabel("Doctors");
		showDoctorsTitle.setFont(new Font("Arial", Font.BOLD, 37));
		model = new DefaultTableModel();
		model.setColumnIdentifiers(doctorsTableColumnNames);
		doctorsTable = new JTable();
		doctorsTable.setModel(model); 
		doctorsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		doctorsTable.setFillsViewportHeight(true);
		doctorsTable.setEnabled(false);
		doctorTableScroll = new JScrollPane(doctorsTable);
		doctorTableScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		doctorTableScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		for (int i = 0; i<clinic.selectDoctors().size(); i++) {
			model.addRow(clinic.selectDoctors().get(i));
		}
		
		// Show doctors in support staff
		showDoctors.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(panel, "Show doctors Panel");
				GroupLayout showDoctorsPanelLayout = new GroupLayout(showDoctorsPanel);
				showDoctorsPanel.setLayout(showDoctorsPanelLayout);
				showDoctorsPanelLayout.setAutoCreateGaps(true);
				showDoctorsPanelLayout.setAutoCreateContainerGaps(true);
				showDoctorsPanel.setBackground(new Color(228, 228, 228));
				
				showDoctorsPanelLayout.setHorizontalGroup(showDoctorsPanelLayout.createParallelGroup()
						.addComponent(showDoctorsTitle)
						.addGap(30, 30, Short.MAX_VALUE)
						.addComponent(doctorTableScroll)
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(showDoctorsPanelLayout.createSequentialGroup()
								.addGap(30, 30, Short.MAX_VALUE).addComponent(supportStaffMainMenuButton))
						);
				
				showDoctorsPanelLayout.setVerticalGroup(showDoctorsPanelLayout.createSequentialGroup()
						.addComponent(showDoctorsTitle)
						.addGap(30, 30, Short.MAX_VALUE)
						.addComponent(doctorTableScroll)
						.addGap(30, 30, Short.MAX_VALUE)
						.addGroup(showDoctorsPanelLayout.createParallelGroup()
								.addComponent(supportStaffMainMenuButton))
						);
			}
			
		});
		
		clinic.closeConnection();
		frame.setBounds(300, 200, 930, 400);
		frame.setMinimumSize(new Dimension(930, 400));
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	// Clear text fields panel
	public void clearTextFields() {
		nameField.setText("");
		surnameField.setText("");
		personalNumberField.setText("");
		dateOfBirthField.setText("");
		cityField.setText("");
		postalCodeField.setText("");
		streetAndHouseNumberField.setText("");
		phoneField.setText("");
		licenceNumberField.setText("");
		dateOfEmploymentField.setText("");
		
		dateOfRegistrationField.setText("");
		
	}
	
	// Admin Main Menu
	public void paintAdminMainPanel() {
		supportStaffMainPanel.removeAll();
		
		adminTitle = new JLabel("Administrator");
		adminTitle.setFont(new Font("Arial", Font.BOLD, 37));
		
		GroupLayout adminMainPanelLayout = new GroupLayout(adminMainPanel);
		adminMainPanel.setLayout(adminMainPanelLayout);
		adminMainPanelLayout.setAutoCreateGaps(true);
		adminMainPanelLayout.setAutoCreateContainerGaps(true);
		adminMainPanel.setBackground(new Color(228, 228, 228));
		
		adminMainPanelLayout.setHorizontalGroup(adminMainPanelLayout.createParallelGroup()
				.addComponent(adminTitle)
				.addGroup(adminMainPanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addGap(10, 10, Short.MAX_VALUE)
						.addComponent(addDoctorButton)
						.addComponent(addSupportStaffButton)
						.addComponent(signOutButton))
				);
		
		adminMainPanelLayout.setVerticalGroup(adminMainPanelLayout.createSequentialGroup()
				.addComponent(adminTitle)
				.addGap(10, 10, Short.MAX_VALUE)
				.addComponent(addDoctorButton)
				.addComponent(addSupportStaffButton)
				.addGap(10, 10, Short.MAX_VALUE)
				.addComponent(signOutButton)
				);
	}
	
	// Support Staff Main Menu
	public void paintSupportStaffMainPanel() {
		adminMainPanel.removeAll();		
		
		supportStaffTitle = new JLabel("Health Staff");
		supportStaffTitle.setFont(new Font("Arial", Font.BOLD, 37));
				
		GroupLayout supportStaffMainPanelLayout = new GroupLayout(supportStaffMainPanel);
		supportStaffMainPanel.setLayout(supportStaffMainPanelLayout);
		supportStaffMainPanelLayout.setAutoCreateGaps(true);
		supportStaffMainPanelLayout.setAutoCreateContainerGaps(true);
		supportStaffMainPanel.setBackground(new Color(228, 228, 228));
		
		supportStaffMainPanelLayout.setHorizontalGroup(supportStaffMainPanelLayout.createParallelGroup()
				.addComponent(supportStaffTitle)
				.addGroup(supportStaffMainPanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addGap(10, 10, Short.MAX_VALUE)
						.addComponent(addPatientButton)
						.addComponent(showDoctors)
						.addComponent(signOutButton))
				);
		
		supportStaffMainPanelLayout.setVerticalGroup(supportStaffMainPanelLayout.createSequentialGroup()
				.addComponent(supportStaffTitle)
				.addGap(10, 10, Short.MAX_VALUE)
				.addComponent(addPatientButton)
				.addComponent(showDoctors)
				.addGap(10, 10, Short.MAX_VALUE)
				.addComponent(signOutButton)
				);		
	}
			
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new NeurologyClinic();
			}
		});
	}

}