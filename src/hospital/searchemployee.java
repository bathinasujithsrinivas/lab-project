package hospital;

import java.awt.EventQueue;


import javax.swing.*;
import java.awt.BorderLayout;
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
import java.sql.*;
public class searchemployee extends JFrame {
	private JTextField textField;
	int eid,salary,flag=0;
	String name,dob,phno,department,designation,address;
	JLabel label_1 = new JLabel("");

	searchemployee()
	{
		super("Search Employee");
		setVisible(true);
		setBounds(500,200,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee ID");
		lblEmployeeName.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeName.setForeground(new Color(50, 205, 50));
		lblEmployeeName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmployeeName.setBounds(60, 67, 124, 17);
		getContentPane().add(lblEmployeeName);
		
		JButton btnSubmit = new JButton("Search");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id= textField.getText();
				try
				{
				 Class.forName("com.mysql.jdbc.Driver");
			     Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
			     PreparedStatement st=con.prepareStatement("select * from employee where eid=?");
			     st.setString(1, id);
			     ResultSet rs=st.executeQuery();
			     
			    
			    	
			    while(rs.next())
			    {
			      eid=rs.getInt(1);
			      name=rs.getString(2);
			      
			      dob=rs.getString(3);
			      phno=rs.getString(4);
			      department=rs.getString(5);
			      
			      designation=rs.getString(6);
			     salary=rs.getInt(7);
			      address=rs.getString(8);
			     
			     
			      flag=1;
			    	
			      employeedetails p=new employeedetails(eid,name,dob,phno,department,designation,salary,address);
			    }   
			    	
			     
			    if(flag!=1)
			    {
			    	label_1.setText("Employee ID does not exist");
			    }	
			    
			    	
			     st.close();
			     con.close();
				}
				catch(Exception excep)
				{
					System.out.println(excep.getMessage());
				}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBounds(128, 105, 89, 23);
		getContentPane().add(btnSubmit);
		
		textField = new JTextField();
		textField.setBounds(194, 67, 124, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
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
		label.setBounds(246, 22, 115, 22);
		getContentPane().add(label);
		
		
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(60, 152, 258, 14);
		getContentPane().add(label_1);
	}

}
