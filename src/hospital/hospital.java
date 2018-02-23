package hospital;
import javax.swing.*;
import java.awt.*;
import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.text.JTextComponent;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class hospital extends JFrame implements ActionListener{
	String username;
	public menu m;
	JLabel lblUserName = new JLabel("User Name");
	char pass[]=new char[20];
	int flag=0;
	JLabel label = new JLabel("");
	
	
	private JTextField textField;
	private final JLayeredPane layeredPane_2 = new JLayeredPane();
	private JPasswordField passwordField;
	JButton btnLogin = new JButton("Login");
	int i;
	private final JLabel lblAbcHospitals = new JLabel("<html><u>ABC HOSPITALS</u></html>");
	public hospital() {
		
		super("Log In");
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
	    
		getContentPane().setForeground(Color.RED);
		getContentPane().setBackground(Color.GRAY);
		getContentPane().setLayout(null);
		
		
		lblUserName.setForeground(new Color(0, 128, 0));
		lblUserName.setBackground(Color.GREEN);
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUserName.setBounds(81, 50, 90, 28);
		getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 128, 0));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(91, 90, 79, 22);
		getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(181, 56, 133, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		layeredPane_2.setBounds(180, 90, 134, 22);
		getContentPane().add(layeredPane_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			i++;
			if(i%2==0)
			{
				passwordField.setEchoChar('*');
			}
			else
			{
				passwordField.setEchoChar((char)0);
			}
			
			}
		});
		lblNewLabel.setBounds(112, 0, 33, 22);
		layeredPane_2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bsviz\\Desktop\\eye.png"));
		lblNewLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		passwordField = new JPasswordField();
		passwordField.setBounds(0, 0, 115, 22);
		layeredPane_2.add(passwordField);
		
		
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBounds(139, 133, 89, 23);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(this);
		passwordField.setEchoChar('*');
		lblAbcHospitals.setForeground(new Color(255, 105, 180));
		lblAbcHospitals.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbcHospitals.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblAbcHospitals.setBounds(111, 11, 184, 28);
		
		getContentPane().add(lblAbcHospitals);
		
		
		label.setBounds(139, 167, 211, 14);
		getContentPane().add(label);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.setBounds(238, 133, 89, 23);
		getContentPane().add(btnReset);
	    setVisible(true);
		setBounds(500,200,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		
		
	}
	
		
	

	
	public static void main (String args[]) 
	{
		hospital h=new hospital();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogin)
		{
			username=textField.getText();
			pass=passwordField.getPassword();
			String password = new String(pass);
			try
			{
			 Class.forName("com.mysql.jdbc.Driver");
		     Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
		     PreparedStatement st=con.prepareStatement("select * from user");
		     ResultSet rs=st.executeQuery();
		     String dbusername,dbpassword;
		     while(rs.next())
		     {
		       dbusername=rs.getString(1);
		        dbpassword=rs.getString(2);
		    	
		    	if(username.equals(dbusername)&&password.equals(dbpassword))
		    	{
		    		m=new menu();
		    		
		    		dispose();
		    		flag=1;
		    		break;
		    	}
		    	
		     }
		    if(flag!=1)
		    	label.setText("Invalid credentials Try Again.....");
		     
		     st.close();
		     con.close();
			}
			catch(Exception excep)
			{
				System.out.println(excep.getMessage());
			}
		
		
		
		
		}
		
	}
}
