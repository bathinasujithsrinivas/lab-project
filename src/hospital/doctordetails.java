package hospital;

import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;

public class doctordetails extends JFrame{
	static int x=0;
	JLabel label_7 = new JLabel("");
	JLabel label_6 = new JLabel("");
	JLabel label_5 = new JLabel("");
	JLabel label_4 = new JLabel("");
	JLabel label_3 = new JLabel("");
	JLabel label_2 = new JLabel("");
	JLabel label_1 = new JLabel("");
	doctordetails(int id,String name,String dob,String phno,String specialisation,String address,String experiance)
	{
		super("Doctor Details");
		x+=20;
		label_1.setText(Integer.toString(id));
		label_2.setText(name);
		label_3.setText(dob);
		label_4.setText(phno);
		label_5.setText(specialisation);
		label_6.setText(address);
		label_7.setText(experiance);		
		
		setVisible(true);
		setBounds(500,x+200,400,300);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Name");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(50, 205, 50));
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(69, 46, 56, 15);
		getContentPane().add(label);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setForeground(new Color(50, 205, 50));
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDob.setBounds(69, 72, 56, 15);
		getContentPane().add(lblDob);
		
		JLabel lblPhNo = new JLabel("Ph no");
		lblPhNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhNo.setForeground(new Color(50, 205, 50));
		lblPhNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhNo.setBounds(69, 98, 56, 15);
		getContentPane().add(lblPhNo);
		
		JLabel lblSpecialistion = new JLabel("Specialistion");
		lblSpecialistion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpecialistion.setForeground(new Color(50, 205, 50));
		lblSpecialistion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSpecialistion.setBounds(69, 124, 93, 15);
		getContentPane().add(lblSpecialistion);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(new Color(50, 205, 50));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(79, 153, 56, 15);
		getContentPane().add(lblAddress);
		
		JLabel lblExperiance = new JLabel("Experiance");
		lblExperiance.setHorizontalAlignment(SwingConstants.CENTER);
		lblExperiance.setForeground(new Color(50, 205, 50));
		lblExperiance.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblExperiance.setBounds(69, 231, 94, 15);
		getContentPane().add(lblExperiance);
		
		JLabel lblDoctorId = new JLabel("Doctor ID");
		lblDoctorId.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctorId.setForeground(new Color(50, 205, 50));
		lblDoctorId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDoctorId.setBounds(69, 20, 76, 15);
		getContentPane().add(lblDoctorId);
		
		
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(184, 22, 126, 14);
		getContentPane().add(label_1);
		
		
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		label_2.setBounds(184, 48, 126, 25);
		getContentPane().add(label_2);
		
		
		label_3.setVerticalAlignment(SwingConstants.TOP);
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		label_3.setBounds(173, 73, 126, 25);
		getContentPane().add(label_3);
		
		
		label_4.setVerticalAlignment(SwingConstants.TOP);
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		label_4.setBounds(173, 100, 126, 25);
		getContentPane().add(label_4);
		
		
		label_5.setVerticalAlignment(SwingConstants.TOP);
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		label_5.setBounds(173, 126, 126, 18);
		getContentPane().add(label_5);
		
		
		label_6.setVerticalAlignment(SwingConstants.TOP);
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		label_6.setBounds(173, 155, 147, 67);
		getContentPane().add(label_6);
		
		
		label_7.setVerticalAlignment(SwingConstants.TOP);
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		label_7.setBounds(173, 233, 126, 28);
		getContentPane().add(label_7);
	}

	

}
