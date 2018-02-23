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
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class searchpatient extends JFrame {
	private JTextField textField;
	JLabel label_1 = new JLabel("");
	String name,gender,phno,address,problem,doctor;
	int pid,age,roomno,flag=0;
	searchpatient()
	{
		super("Search Patient");
		setVisible(true);
		setBounds(500,200,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblPatientName = new JLabel("Patient Name");
		lblPatientName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPatientName.setForeground(new Color(50, 205, 50));
		lblPatientName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPatientName.setBounds(59, 55, 108, 17);
		getContentPane().add(lblPatientName);
		
		textField = new JTextField();
		textField.setBounds(192, 55, 126, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Search");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnSubmit)
				{
					String pname=textField.getText();
					try
					{
					 Class.forName("com.mysql.jdbc.Driver");
				     Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
				     PreparedStatement st=con.prepareStatement("select * from patient where name=?");
				     st.setString(1, pname);
				     ResultSet rs=st.executeQuery();
				     
				    
				    	
				     while(rs.next())
				     {
				      pid=rs.getInt(1);
				      name=rs.getString(2);
				      age=rs.getInt(3);
				      gender=rs.getString(4);
				      phno=rs.getString(5);
				      address=rs.getString(6);
				      roomno=rs.getInt(7);
				      doctor=rs.getString(8);
				      problem=rs.getString(9);
				      
				      flag=1;
				    	
				      patientdetails p=new patientdetails(pid,name,age,gender,phno,address,roomno,doctor,problem);
					    
				    	
				     }
				    if(flag!=1)
				    {
				    	label_1.setText("No patient exist for given patient name");
				    }	
				    
				    	
				     st.close();
				     con.close();
					}
					catch(Exception excep)
					{
						System.out.println(excep.getMessage());
					}
				
					
				}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBounds(136, 95, 89, 23);
		getContentPane().add(btnSubmit);
		
		JLabel label = new JLabel("<html><u>Back to menu</u></html>");
		label.setCursor(new Cursor(Cursor.HAND_CURSOR));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu m1=new menu();
				dispose();
			}
		});
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(247, 11, 115, 22);
		getContentPane().add(label);
		
		
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		label_1.setBounds(78, 143, 284, 14);
		getContentPane().add(label_1);
	}
}
