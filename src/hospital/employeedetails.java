package hospital;

import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;

public class employeedetails extends JFrame{

	JLabel label_8 = new JLabel("");
	JLabel label_7 = new JLabel("");
	JLabel label_6 = new JLabel("");
	JLabel label_5 = new JLabel("");
	JLabel label_4 = new JLabel("");
	JLabel label_3 = new JLabel("");
	JLabel label_2 = new JLabel("");
	JLabel label_1 = new JLabel("");
	static int x=0;
	int eid;
	employeedetails(int id,String name,String dob,String phno,String department,String designation,int salary,String address)
	{
		super("Employee Details");
		x+=20;
		
		label_8.setText(Integer.toString(id));
		label_1.setText(name);
		label_2.setText(dob);
		label_3.setText(phno);
		label_4.setText(department);
		label_5.setText(designation);
		label_6.setText(Integer.toString(salary));
		label_7.setText(address);
		setVisible(true);
		setBounds(500,x+200,400,342);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Name");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(50, 205, 50));
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(65, 33, 56, 15);
		getContentPane().add(label);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setForeground(new Color(50, 205, 50));
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDob.setBounds(65, 59, 56, 15);
		getContentPane().add(lblDob);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneNo.setForeground(new Color(50, 205, 50));
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNo.setBounds(54, 85, 84, 15);
		getContentPane().add(lblPhoneNo);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepartment.setForeground(new Color(50, 205, 50));
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDepartment.setBounds(44, 111, 94, 15);
		getContentPane().add(lblDepartment);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesignation.setForeground(new Color(50, 205, 50));
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDesignation.setBounds(48, 137, 90, 19);
		getContentPane().add(lblDesignation);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalary.setForeground(new Color(50, 205, 50));
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSalary.setBounds(65, 167, 56, 15);
		getContentPane().add(lblSalary);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(new Color(50, 205, 50));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(65, 193, 56, 15);
		getContentPane().add(lblAddress);
		
		
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setBounds(152, 33, 151, 19);
		getContentPane().add(label_1);
		
		
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(152, 55, 151, 19);
		getContentPane().add(label_2);
		
		
		label_3.setVerticalAlignment(SwingConstants.TOP);
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(148, 85, 151, 19);
		getContentPane().add(label_3);
		
		
		label_4.setVerticalAlignment(SwingConstants.TOP);
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(152, 111, 151, 19);
		getContentPane().add(label_4);
		
		
		label_5.setVerticalAlignment(SwingConstants.TOP);
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(148, 141, 151, 19);
		getContentPane().add(label_5);
		
		
		label_6.setVerticalAlignment(SwingConstants.TOP);
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(148, 167, 151, 19);
		getContentPane().add(label_6);
		
		
		label_7.setVerticalAlignment(SwingConstants.TOP);
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(148, 195, 173, 78);
		getContentPane().add(label_7);
		
		
		label_8.setVerticalAlignment(SwingConstants.TOP);
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(152, 11, 151, 19);
		getContentPane().add(label_8);
		
		JLabel lblEmplyeeId = new JLabel("Emplyee ID");
		lblEmplyeeId.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmplyeeId.setForeground(new Color(50, 205, 50));
		lblEmplyeeId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmplyeeId.setBounds(44, 11, 85, 15);
		getContentPane().add(lblEmplyeeId);
	}

}
