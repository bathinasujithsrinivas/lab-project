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

public class searchdoctor extends JFrame {
	JLabel label_1 = new JLabel("");
	JComboBox comboBox = new JComboBox();
	String name,dob,phno,specialisation,address,experiance;
    int did,flag=0;
	searchdoctor()
	{
		super("Search Doctor");
		setVisible(true);
		setBounds(500,200,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblDoctorId = new JLabel("Specialisation");
		lblDoctorId.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctorId.setForeground(new Color(50, 205, 50));
		lblDoctorId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDoctorId.setBounds(57, 57, 104, 17);
		getContentPane().add(lblDoctorId);
		
		JButton btnSubmit = new JButton("Search");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnSubmit)
				{
					String special=(String)comboBox.getSelectedItem();
					try
					{
					 Class.forName("com.mysql.jdbc.Driver");
				     Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
				     PreparedStatement st=con.prepareStatement("select * from doctor where specialisation=?");
				     st.setString(1, special);
				     ResultSet rs=st.executeQuery();
				     
				    
				    	
				     while(rs.next())
				     {
				      did=rs.getInt(1);
				      name=rs.getString(2);
				      
				      dob=rs.getString(3);
				      phno=rs.getString(4);
				      specialisation=rs.getString(5);
				      address=rs.getString(6);
				      experiance=rs.getString(7);
				     
				     
				     
				      flag=1;
				    	
				      doctordetails p=new doctordetails(did,name,dob,phno,specialisation,address,experiance);
					    
				    	
				     }
				    if(flag!=1)
				    {
				    	label_1.setText("No Doctor exist with given specialisation");
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
		btnSubmit.setBounds(134, 93, 89, 23);
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
		label.setBounds(245, 11, 115, 22);
		getContentPane().add(label);
		
		
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setForeground(Color.RED);
		label_1.setBounds(86, 131, 227, 14);
		getContentPane().add(label_1);
		
		
		comboBox.setBounds(171, 57, 151, 20);
		getContentPane().add(comboBox);
		comboBox.addItem("Heart");
		comboBox.addItem("Bones");
		comboBox.addItem("Physician");
		comboBox.addItem("Surgeon");
		comboBox.addItem("Dentist");
		
	}
}
