import javax.swing.*;

import clinic.Clinic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NeurologyClinic extends Clinic{
	
	Clinic clinic = new Clinic();
	
	JFrame frame = new JFrame("Neurology Clinic");
	JPanel panel = new JPanel();
	JPanel mainPanel = new JPanel();
	JPanel doctorPanel = new JPanel();
	JButton addDoctorButton = new JButton("Add doctor to Database");
	JButton addDoctor = new JButton("Add doctor");
	JButton addPatientButton = new JButton("Add patient to Database");
	JButton addHealthStaffButton = new JButton("Add health staff to Database");
	
	
	JButton mainMenuButton = new JButton("Main Menu");
	CardLayout cl = new CardLayout();
	
	public NeurologyClinic() {
		panel.setLayout(cl);
		doctorPanel.add(mainMenuButton);
		
		panel.add(mainPanel, "Main Panel");
		panel.add(doctorPanel, "Adding Doctor Panel");
		cl.show(panel, "Main Panel");
		
		addDoctorButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panel, "Adding Doctor Panel");
				System.out.println("Add doctor");
			}
		});
		
		mainMenuButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panel, "Main Panel");
			}
		});
		
		GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
		mainPanel.setLayout(mainPanelLayout);
		mainPanelLayout.setAutoCreateGaps(true);
		mainPanelLayout.setAutoCreateContainerGaps(true);
		mainPanel.setBackground(new Color(228, 228, 228));
		
		mainPanelLayout.setHorizontalGroup(mainPanelLayout.createParallelGroup()
				.addComponent(addPatientButton)
				.addComponent(addDoctorButton)
				.addComponent(addHealthStaffButton)
				);
		
		mainPanelLayout.setVerticalGroup(mainPanelLayout.createSequentialGroup()
				.addComponent(addPatientButton)
				.addComponent(addDoctorButton)
				.addComponent(addHealthStaffButton)
				);
		
		//Add doctor menu
		JLabel addDoctorTitle = new JLabel("Add doctor");
		addDoctorTitle.setFont(new Font("Arial", Font.BOLD, 37));
		JLabel addName = new JLabel("Name:");
		JTextField nameField = new JTextField();
		JLabel addSurname = new JLabel("Surname:");
		JTextField surnameField = new JTextField();
		JLabel addPersonalNumber = new JLabel("Personal Number:");
		JTextField personalNumberField = new JTextField();
		JLabel addDateOfBirth = new JLabel("Date of birth (yyyy-mm-dd):");
		JTextField dateOfBirthField = new JTextField();
		JLabel addCountryOfBirth = new JLabel("Country of birth:");
		JComboBox countryOfBirthCB = new JComboBox(clinic.selectCountries().toArray());
		JLabel addCity = new JLabel("City:");
		JTextField cityField = new JTextField();
		JLabel addPostalCode = new JLabel("Postal code (xx-xxx):");
		JTextField postalCodeField = new JTextField();
		JLabel addStreetAndHouseNumber = new JLabel("Street and house number:");
		JTextField streetAndHouseNumberField = new JTextField();
		JLabel addPhone = new JLabel("Phone number:");
		JTextField phoneField = new JTextField();
		JLabel addSex = new JLabel("Sex:");
		JComboBox sexCB = new JComboBox(clinic.selectSex().toArray());
		JLabel addLicenceNumber = new JLabel("Licence number:");
		JTextField licenceNumberField = new JTextField();
		JLabel addSpecialty = new JLabel("Specialty:");
		JComboBox specialtyCB = new JComboBox(clinic.selectSpecialty().toArray());
		JLabel addDateOfEmployment = new JLabel("Date of employment (yyyy-mm-dd):");
		JTextField dateOfEmploymentField = new JTextField();
		/*
		textFieldAdjustment(nameField);
		textFieldAdjustment(surnameField);
		textFieldAdjustment(personalNumberField);
		textFieldAdjustment(dateOfBirthField);
		textFieldAdjustment(cityField);
		textFieldAdjustment(postalCodeField);
		textFieldAdjustment(streetAndHouseNumberField);
		textFieldAdjustment(phoneField);
		textFieldAdjustment(sexField);
		textFieldAdjustment(licenceNumberField);
		textFieldAdjustment(dateOfEmploymentField);*/
		
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
						.addGap(100, 100, Short.MAX_VALUE).addComponent(addDoctor).addComponent(mainMenuButton))
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
						.addComponent(addDoctor).addComponent(mainMenuButton))
				);
		//Add doctor button in add doctor panel
		addDoctor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				insertDoctor(nameField.getText(), surnameField.getText(), personalNumberField.getText(), dateOfBirthField.getText(), countryOfBirthCB.getSelectedItem().toString(), cityField.getText(),
						postalCodeField.getText(), streetAndHouseNumberField.getText(), phoneField.getText(), sexCB.getSelectedItem().toString(), licenceNumberField.getText(),
						specialtyCB.getSelectedItem().toString(), dateOfEmploymentField.getText());
			}
		});
		
		frame.setBounds(300, 200, 930, 400);
		frame.setMinimumSize(new Dimension(930, 400));
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public void textFieldAdjustment(Object textField) {
		((Container) textField).setFont(new Font("Arial", Font.BOLD, 20));
		((AbstractButton) textField).setHorizontalAlignment(SwingConstants.RIGHT);
		((Window) textField).setSize(209, 43);
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