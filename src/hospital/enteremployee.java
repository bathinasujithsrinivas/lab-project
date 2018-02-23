package hospital;

import java.awt.EventQueue;


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

public class enteremployee extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextArea textField_6;
	JLabel label_4 = new JLabel("");
	JComboBox comboBox = new JComboBox();
	JLabel label_3 = new JLabel("");
	Random r=new Random();
	String name,dob,phno,address,department,designation;
	int salary,eid;

	enteremployee()
	{
		super("Employee Details");
		setVisible(true);
		setBounds(500,200,400,367);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Name");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(50, 205, 50));
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(52, 35, 56, 15);
		getContentPane().add(label);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setForeground(new Color(50, 205, 50));
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDob.setBounds(52, 66, 56, 15);
		getContentPane().add(lblDob);
		
		JLabel lblPhNo = new JLabel("Ph no");
		lblPhNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhNo.setForeground(new Color(50, 205, 50));
		lblPhNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhNo.setBounds(52, 92, 56, 15);
		getContentPane().add(lblPhNo);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepartment.setForeground(new Color(50, 205, 50));
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDepartment.setBounds(35, 123, 100, 15);
		getContentPane().add(lblDepartment);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesignation.setForeground(new Color(50, 205, 50));
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDesignation.setBounds(35, 147, 100, 26);
		getContentPane().add(lblDesignation);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalary.setForeground(new Color(50, 205, 50));
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSalary.setBounds(52, 177, 70, 15);
		getContentPane().add(lblSalary);
		
		JLabel label_1 = new JLabel("Address");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(50, 205, 50));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(52, 203, 70, 15);
		getContentPane().add(label_1);
		
		textField = new JTextField(10);
		textField.setBounds(140, 34, 125, 20);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 65, 100, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 91, 108, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(140, 150, 125, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(139, 176, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextArea();
		textField_6.setBounds(139, 202, 141, 59);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label_2 = new JLabel("<html><u>Back to menu</u></html>");
		label_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu m1=new menu();
				dispose();
			}
		});
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(259, 11, 115, 22);
		getContentPane().add(label_2);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button)
				{
					name=textField.getText();
					dob=textField_1.getText();
					phno=textField_2.getText();
					department=(String)comboBox.getSelectedItem();
					designation=textField_4.getText();
					if((textField_5.getText()).isEmpty()==false)
					salary=Integer.parseInt(textField_5.getText());
					address=textField_6.getText();
					if(name.isEmpty()==true||dob.isEmpty()==true||phno.isEmpty()==true||department.isEmpty()==true||designation.isEmpty()==true||textField_5.getText().isEmpty()==true||address.isEmpty()==true)
					{
						label_4.setText("Please fill all details"); 
					}
					else
					{
						eid=r.nextInt(899999)+100000;
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
						PreparedStatement st=con.prepareStatement("Insert into employee(eid,name,dob,phno,department,designation,salary,address)values (?,?,?,?,?,?,?,?)");
					     st.setInt(1,eid);
						 st.setString(2, name);
					     st.setString(3, dob);
					     st.setString(4, phno);
					     st.setString(5,department);
					     st.setInt(7,salary);
					     st.setString(6, designation);
					     st.setString(8, address);
					     
							
					     
					    label_3.setText("Employee Details entered Successfully");
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
		button.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		button.setBounds(97, 272, 89, 23);
		getContentPane().add(button);
		
		
		label_3.setForeground(Color.GREEN);
		label_3.setFont(new Font("Sitka Subheading", Font.PLAIN, 13));
		label_3.setBounds(84, 303, 229, 14);
		getContentPane().add(label_3);
		
		
		comboBox.addItem("Medical");
		comboBox.addItem("Security");
		comboBox.addItem("Planning");
		comboBox.addItem("Pharmacy");
		comboBox.addItem("Sanitation");
		comboBox.setBounds(145, 122, 120, 20);
		getContentPane().add(comboBox);
		
		
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setForeground(Color.RED);
		label_4.setBounds(118, 303, 147, 14);
		getContentPane().add(label_4);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				label_4.setText("");
				label_3.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.setBounds(196, 272, 89, 23);
		getContentPane().add(btnReset);
	}
}
