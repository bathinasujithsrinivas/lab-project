package hospital;

import java.awt.EventQueue;
import java.sql.*;


import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class enterdoctor extends JFrame {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textField_4;
	private JTextField textField_5;
	JLabel label_3 = new JLabel("");
	int did;
	Random r=new Random();
	String name,dob,phno,specialisation,address,experiance;
	JLabel label_2 = new JLabel("");
	JComboBox comboBox = new JComboBox();

	enterdoctor()
	{
		super("Doctor Details");
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		setVisible(true);
		setBounds(500,200,400,379);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Name");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(50, 205, 50));
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(61, 41, 56, 15);
		getContentPane().add(label);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setForeground(new Color(50, 205, 50));
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDob.setBounds(61, 70, 56, 15);
		getContentPane().add(lblDob);
		
		JLabel lblPhNo = new JLabel("Ph No");
		lblPhNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhNo.setForeground(new Color(50, 205, 50));
		lblPhNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhNo.setBounds(61, 103, 56, 15);
		getContentPane().add(lblPhNo);
		
		JLabel lblSpecialisation = new JLabel("Specialisation");
		lblSpecialisation.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpecialisation.setForeground(new Color(50, 205, 50));
		lblSpecialisation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSpecialisation.setBounds(58, 129, 109, 15);
		getContentPane().add(lblSpecialisation);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(new Color(50, 205, 50));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(61, 163, 70, 15);
		getContentPane().add(lblAddress);
		
		JLabel lblExperiance = new JLabel("Experiance");
		lblExperiance.setHorizontalAlignment(SwingConstants.CENTER);
		lblExperiance.setForeground(new Color(50, 205, 50));
		lblExperiance.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblExperiance.setBounds(61, 252, 99, 15);
		getContentPane().add(lblExperiance);
		
		textField = new JTextField();
		textField.setBounds(173, 40, 133, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 69, 99, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(173, 99, 126, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextArea();
		textField_4.setBounds(162, 162, 144, 68);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(170, 251, 91, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_1 = new JLabel("<html><u>Back to menu</u></html>");
		label_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu m1=new menu();
				dispose();
			}
		});
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(259, 11, 115, 22);
		getContentPane().add(label_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnSubmit)
				{
					name=textField.getText();
					dob=textField_1.getText();
					phno=textField_2.getText();
					specialisation=(String)comboBox.getSelectedItem();
					address=textField_4.getText();
					experiance=textField_5.getText();
					if(name.isEmpty()==true||dob.isEmpty()==true||phno.isEmpty()==true||specialisation.isEmpty()==true||address.isEmpty()==true||experiance.isEmpty()==true)
					{
						label_2.setText("Please fill all details"); 
					}
					else
					{
						did=r.nextInt(899999)+100000;
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
						PreparedStatement st=con.prepareStatement("Insert into doctor(did,name,dob,phno,specialisation,address,experiance)values (?,?,?,?,?,?,?)");
					     st.setInt(1, did);
						st.setString(2, name);
					     st.setString(3, dob);
					     st.setString(4, phno);
					     st.setString(5,specialisation);
					     st.setString(6,address);
					     st.setString(7, experiance);
					     
					     label_3.setText("Doctor Details Entered Successfully");
					    
					     st.executeUpdate();
					     st.close();
					     con.close();
					}
					
					catch (Exception e1) {
						
						System.out.println(e1.getMessage());
					}
									
				}
				}
			}
		});
		btnSubmit.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		btnSubmit.setBounds(133, 288, 89, 23);
		getContentPane().add(btnSubmit);
		
		
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setForeground(Color.RED);
		label_2.setBounds(156, 322, 150, 14);
		getContentPane().add(label_2);
		
		
		comboBox.setBounds(177, 128, 129, 20);
		getContentPane().add(comboBox);
		comboBox.addItem("Heart");
		comboBox.addItem("Bones");
		comboBox.addItem("Physician");
		comboBox.addItem("Surgeon");
		comboBox.addItem("Dentist");
		
		
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setForeground(Color.GREEN);
		label_3.setBounds(103, 322, 230, 14);
		getContentPane().add(label_3);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_4.setText("");
				textField_5.setText("");
				label_2.setText("");
				label_3.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.setForeground(Color.BLACK);
		btnReset.setBounds(232, 288, 89, 23);
		getContentPane().add(btnReset);
	}
}
