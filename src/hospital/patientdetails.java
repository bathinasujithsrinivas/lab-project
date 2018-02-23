package hospital;

import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;

public class patientdetails extends JFrame {
	
	static int x=0;
	JLabel label_8 = new JLabel("");
	JLabel label_7 = new JLabel("");
	JLabel label_6 = new JLabel("");
	JLabel label_5 = new JLabel("");
	JLabel label_4 = new JLabel("");
	JLabel label_3 = new JLabel("");
	JLabel label_2 = new JLabel("");
	JLabel label_1 = new JLabel("");
	JLabel lblNewLabel = new JLabel("");
	patientdetails(int pid,String name,int age,String gender,String phno,String address,int roomno,String doctor,String problem )
	{
		
	super("Patient Details");
	x+=20;
	lblNewLabel.setText(Integer.toString(pid));
	label_1.setText(name);
	label_2.setText(Integer.toString(age));
	label_3.setText(gender);
	label_4.setText(phno);
	label_5.setVerticalAlignment(SwingConstants.TOP);
	label_5.setText(address);
	label_6.setText(Integer.toString(roomno));
	label_7.setText(doctor);
	label_8.setVerticalAlignment(SwingConstants.TOP);
	label_8.setText(problem);
	
	setVisible(true);
	setBounds(500,x+200,400,447);
	getContentPane().setLayout(null);
	
	JLabel label = new JLabel("Name");
	label.setHorizontalAlignment(SwingConstants.CENTER);
	label.setForeground(new Color(50, 205, 50));
	label.setFont(new Font("Tahoma", Font.BOLD, 14));
	label.setBounds(64, 37, 56, 15);
	getContentPane().add(label);
	
	JLabel lblAge = new JLabel("Age");
	lblAge.setHorizontalAlignment(SwingConstants.CENTER);
	lblAge.setForeground(new Color(50, 205, 50));
	lblAge.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAge.setBounds(64, 63, 56, 17);
	getContentPane().add(lblAge);
	
	JLabel lblAddress = new JLabel("Address");
	lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
	lblAddress.setForeground(new Color(50, 205, 50));
	lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAddress.setBounds(64, 142, 56, 15);
	getContentPane().add(lblAddress);
	
	JLabel lblPhoneNo = new JLabel("Phone no");
	lblPhoneNo.setHorizontalAlignment(SwingConstants.CENTER);
	lblPhoneNo.setForeground(new Color(50, 205, 50));
	lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblPhoneNo.setBounds(52, 116, 82, 15);
	getContentPane().add(lblPhoneNo);
	
	JLabel lblRoomNo = new JLabel("Room no");
	lblRoomNo.setHorizontalAlignment(SwingConstants.CENTER);
	lblRoomNo.setForeground(new Color(50, 205, 50));
	lblRoomNo.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblRoomNo.setBounds(52, 213, 82, 15);
	getContentPane().add(lblRoomNo);
	
	JLabel lblDoctor = new JLabel("Doctor");
	lblDoctor.setHorizontalAlignment(SwingConstants.CENTER);
	lblDoctor.setForeground(new Color(50, 205, 50));
	lblDoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDoctor.setBounds(64, 239, 56, 15);
	getContentPane().add(lblDoctor);
	
	JLabel lblProblem = new JLabel("Problem");
	lblProblem.setHorizontalAlignment(SwingConstants.CENTER);
	lblProblem.setForeground(new Color(50, 205, 50));
	lblProblem.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblProblem.setBounds(147, 274, 73, 15);
	getContentPane().add(lblProblem);
	
	JLabel lblGender = new JLabel("Gender");
	lblGender.setHorizontalAlignment(SwingConstants.CENTER);
	lblGender.setForeground(new Color(50, 205, 50));
	lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblGender.setBounds(64, 89, 56, 15);
	getContentPane().add(lblGender);
	
	JLabel lblPatientId = new JLabel("Patient ID");
	lblPatientId.setHorizontalAlignment(SwingConstants.CENTER);
	lblPatientId.setForeground(new Color(50, 205, 50));
	lblPatientId.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblPatientId.setBounds(64, 11, 82, 15);
	getContentPane().add(lblPatientId);
	
	
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
	lblNewLabel.setBounds(188, 11, 107, 14);
	getContentPane().add(lblNewLabel);
	
	
	label_1.setHorizontalAlignment(SwingConstants.LEFT);
	label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	label_1.setBounds(188, 39, 132, 23);
	getContentPane().add(label_1);
	
	label_2.setHorizontalAlignment(SwingConstants.LEFT);
	label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	label_2.setBounds(188, 66, 56, 14);
	getContentPane().add(label_2);
	
	
	label_3.setHorizontalAlignment(SwingConstants.LEFT);
	label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
	label_3.setBounds(188, 91, 82, 16);
	getContentPane().add(label_3);
	
	
	label_4.setHorizontalAlignment(SwingConstants.LEFT);
	label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
	label_4.setBounds(188, 118, 107, 15);
	getContentPane().add(label_4);
	
	
	label_5.setHorizontalAlignment(SwingConstants.LEFT);
	label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
	label_5.setBounds(188, 144, 132, 62);
	getContentPane().add(label_5);
	
	
	label_6.setHorizontalAlignment(SwingConstants.LEFT);
	label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
	label_6.setBounds(188, 215, 132, 14);
	getContentPane().add(label_6);
	
	
	label_7.setHorizontalAlignment(SwingConstants.LEFT);
	label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
	label_7.setBounds(188, 241, 132, 14);
	getContentPane().add(label_7);
	

	label_8.setHorizontalAlignment(SwingConstants.LEFT);
	label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
	label_8.setBounds(64, 302, 278, 95);
	getContentPane().add(label_8);
	
	}
}
