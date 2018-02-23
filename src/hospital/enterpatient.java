package hospital;

import java.awt.EventQueue;
import java.sql.*;
import java.util.Random;

import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class enterpatient extends JFrame implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	JLabel label_1 = new JLabel("");
	
	private JTextField textField_4;
	private JTextField textField_5;
	String pname,dname,paddress,pproblem,gender,problem,ppno;
	int pid,age,roomno;
	Random r=new Random();
	JButton button = new JButton("Submit");
	JTextArea textArea = new JTextArea();
    JTextArea textField_3=new JTextArea();
    JLabel label = new JLabel("");
	
	enterpatient()
	{
	super("Patient Details");
	getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
	setVisible(true);
	setBounds(500,125,400,580);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Name");
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setForeground(new Color(50, 205, 50));
	lblNewLabel.setBounds(74, 34, 56, 15);
	getContentPane().add(lblNewLabel);
	
	JLabel lblAge = new JLabel("Age");
	lblAge.setHorizontalAlignment(SwingConstants.CENTER);
	lblAge.setForeground(new Color(50, 205, 50));
	lblAge.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAge.setBounds(74, 58, 56, 22);
	getContentPane().add(lblAge);
	
	JLabel lblGender = new JLabel("Gender");
	lblGender.setHorizontalAlignment(SwingConstants.CENTER);
	lblGender.setForeground(new Color(50, 205, 50));
	lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblGender.setBounds(74, 91, 56, 15);
	getContentPane().add(lblGender);
	
	JLabel lblPhNo = new JLabel("Ph no");
	lblPhNo.setHorizontalAlignment(SwingConstants.CENTER);
	lblPhNo.setForeground(new Color(50, 205, 50));
	lblPhNo.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblPhNo.setBounds(74, 121, 56, 15);
	getContentPane().add(lblPhNo);
	
	JLabel lblAddress = new JLabel("Address");
	lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
	lblAddress.setForeground(new Color(50, 205, 50));
	lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAddress.setBounds(74, 147, 66, 15);
	getContentPane().add(lblAddress);
	
	JLabel lblProblem = new JLabel("Problem");
	lblProblem.setHorizontalAlignment(SwingConstants.CENTER);
	lblProblem.setForeground(new Color(50, 205, 50));
	lblProblem.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblProblem.setBounds(140, 292, 66, 15);
	getContentPane().add(lblProblem);
	
	textField = new JTextField();
	textField.setBounds(165, 33, 114, 20);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBounds(165, 61, 74, 20);
	getContentPane().add(textField_1);
	textField_1.setColumns(10);
	

	
	JRadioButton rdbtnMale = new JRadioButton("Male");
	rdbtnMale.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent arg0) {
			if(rdbtnMale.isSelected()==true)
			{
				gender="Male";
			}
		}
	});
	rdbtnMale.setBounds(170, 89, 66, 23);
	getContentPane().add(rdbtnMale);
	
	JRadioButton rdbtnFemale = new JRadioButton("Female");
	rdbtnFemale.setBounds(238, 89, 66, 23);
	getContentPane().add(rdbtnFemale);
	rdbtnFemale.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent arg0) {
			if(rdbtnFemale.isSelected()==true)
			{
				gender="Female";
			}
		}
	});
	ButtonGroup bg = new ButtonGroup();
	bg.add(rdbtnMale);
	bg.add(rdbtnFemale);
	
	textField_2 = new JTextField();
	textField_2.setBounds(165, 120, 114, 20);
	getContentPane().add(textField_2);
	textField_2.setColumns(10);
	
	
	textField_3.setBounds(165, 151, 152, 63);
	getContentPane().add(textField_3);
	textField_3.setColumns(10);
	

	textArea.setBounds(63, 318, 249, 155);
	getContentPane().add(textArea);
	
	JLabel lblRoomNo = new JLabel("Room No");
	lblRoomNo.setHorizontalAlignment(SwingConstants.CENTER);
	lblRoomNo.setForeground(new Color(50, 205, 50));
	lblRoomNo.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblRoomNo.setBounds(74, 235, 66, 15);
	getContentPane().add(lblRoomNo);
	
	JLabel lblDoctor = new JLabel("Doctor");
	lblDoctor.setHorizontalAlignment(SwingConstants.CENTER);
	lblDoctor.setForeground(new Color(50, 205, 50));
	lblDoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDoctor.setBounds(74, 261, 66, 15);
	getContentPane().add(lblDoctor);
	
	textField_4 = new JTextField();
	textField_4.setBounds(165, 234, 86, 20);
	getContentPane().add(textField_4);
	textField_4.setColumns(10);
	
	textField_5 = new JTextField();
	textField_5.setBounds(165, 261, 146, 20);
	getContentPane().add(textField_5);
	textField_5.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("<html><u>Back to menu</u></html>");
	lblNewLabel_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
	lblNewLabel_1.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			menu m1=new menu();
			dispose();
		}
	});
	lblNewLabel_1.setForeground(new Color(255, 0, 0));
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_1.setBounds(269, 11, 115, 22);
	getContentPane().add(lblNewLabel_1);
	
	
	button.setFont(new Font("Sitka Text", Font.PLAIN, 14));
	button.setBounds(101, 484, 89, 23);
	getContentPane().add(button);
	
	
	label.setFont(new Font("Tahoma", Font.PLAIN, 13));
	label.setForeground(Color.RED);
	label.setBounds(74, 518, 205, 14);
	getContentPane().add(label);
	
	
	label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	label_1.setForeground(Color.GREEN);
	label_1.setBounds(111, 518, 236, 14);
	getContentPane().add(label_1);
	
	JButton btnReset = new JButton("Reset");
	btnReset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			textField_5.setText("");
			textArea.setText("");
			label.setText("");
			label_1.setText("");
		}
	});
	btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnReset.setBounds(200, 484, 89, 23);
	getContentPane().add(btnReset);
	button.addActionListener(this);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
		{
			pname=textField.getText();
			if((textField_1.getText()).isEmpty()==false)
			age=Integer.parseInt(textField_1.getText());
			ppno=(textField_2.getText());
			paddress=textField_3.getText();
			if((textField_4.getText()).isEmpty()==false)
			roomno=Integer.parseInt(textField_4.getText());
			dname=textField_5.getText();
			problem=textArea.getText();
			
			if(pname.isEmpty()==true||(textField_1.getText()).isEmpty()==true||ppno.isEmpty()==true||paddress.isEmpty()==true||(textField_4.getText()).isEmpty()==true||dname.isEmpty()==true||problem.isEmpty()==true)
			{
				label.setText("Please fill all details");
			}
			else
			{
				int pid=r.nextInt(899999)+100000;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
				PreparedStatement st=con.prepareStatement("Insert into patient(pid,name,age,gender,phoneno,address,roomno,doctor,problem) values (?,?,?,?,?,?,?,?,?)");
                 st.setInt(1, pid);
				 st.setString(2, pname);
			     st.setInt(3, age);
			     st.setString(4, gender);
			     st.setString(5, ppno);
			     st.setString(6, paddress);
			     st.setInt(7, roomno);
			     st.setString(8, dname);
			     st.setString(9, problem);
			     label_1.setText("Patient Details Entered Successfully");
			    
			     st.executeUpdate();
			     st.close();
			     con.close();
			}
			
			catch (Exception e1) {
				
				System.out.println(e1.getMessage());
			}
		     
			}
			
			
			
			
			
		}
		System.out.println();
	}
}
//set @row_num = 0; 
//SELECT name,age,gender,phoneno,address,roomno,doctor,problem, @row_num := @row_num + 1 as id FROM patient;
	