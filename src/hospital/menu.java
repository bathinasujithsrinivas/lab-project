package hospital;
import javax.swing.*;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class menu extends JFrame {
	int button,status;
     menu()
     {
	super("Main Menu");
	getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bsviz\\Desktop\\download.jpg"));
	lblNewLabel.setBounds(68, 68, 46, 14);
	getContentPane().add(lblNewLabel);
	
	JLabel label = new JLabel("");
	label.setIcon(new ImageIcon("C:\\Users\\bsviz\\Desktop\\download.jpg"));
	label.setBounds(68, 144, 46, 14);
	getContentPane().add(label);
	
	JLabel label_1 = new JLabel("");
	label_1.setIcon(new ImageIcon("C:\\Users\\bsviz\\Desktop\\download.jpg"));
	label_1.setBounds(68, 95, 27, 14);
	getContentPane().add(label_1);
	
	JLabel label_2 = new JLabel("");
	label_2.setIcon(new ImageIcon("C:\\Users\\bsviz\\Desktop\\download.jpg"));
	label_2.setBounds(68, 119, 46, 14);
	getContentPane().add(label_2);
	
	JLabel label_3 = new JLabel("<html><u>ABC HOSPITALS</u></html>");
	label_3.setHorizontalAlignment(SwingConstants.CENTER);
	label_3.setForeground(new Color(255, 105, 180));
	label_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
	label_3.setBounds(115, 11, 184, 28);
	getContentPane().add(label_3);
	
	JLabel lblDetailsOfThe = new JLabel("<html><u>Enter Details of the patient</u></html>");
	lblDetailsOfThe.setCursor(new Cursor(Cursor.HAND_CURSOR));
	lblDetailsOfThe.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			dispose();
			enterpatient ap=new enterpatient();
		}
	});
	lblDetailsOfThe.setHorizontalAlignment(SwingConstants.CENTER);
	lblDetailsOfThe.setForeground(new Color(0, 128, 0));
	lblDetailsOfThe.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblDetailsOfThe.setBackground(Color.GREEN);
	lblDetailsOfThe.setBounds(99, 65, 184, 20);
	getContentPane().add(lblDetailsOfThe);
	
	JLabel lblEnterDetailsOf = new JLabel("<html><u>Enter Details of the Doctor</u></html>");
	lblEnterDetailsOf.setCursor(new Cursor(Cursor.HAND_CURSOR));
	lblEnterDetailsOf.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			enterdoctor ed=new enterdoctor();
			dispose();
		}
	});
	lblEnterDetailsOf.setHorizontalAlignment(SwingConstants.CENTER);
	lblEnterDetailsOf.setForeground(new Color(0, 128, 0));
	lblEnterDetailsOf.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblEnterDetailsOf.setBackground(Color.GREEN);
	lblEnterDetailsOf.setBounds(103, 90, 174, 20);
	getContentPane().add(lblEnterDetailsOf);
	
	JLabel lblSearchDetailsOf = new JLabel("<html><u>Search Details of the patient</u></html>");
	lblSearchDetailsOf.setCursor(new Cursor(Cursor.HAND_CURSOR));
	lblSearchDetailsOf.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			searchpatient sp=new searchpatient();
			dispose();
		}
	});
	lblSearchDetailsOf.setHorizontalAlignment(SwingConstants.CENTER);
	lblSearchDetailsOf.setForeground(new Color(0, 128, 0));
	lblSearchDetailsOf.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblSearchDetailsOf.setBackground(Color.GREEN);
	lblSearchDetailsOf.setBounds(103, 114, 184, 20);
	getContentPane().add(lblSearchDetailsOf);
	
	JLabel lblSearchDetailsOf_1 = new JLabel("<html><u>Search Details of the Doctor</u></html>");
	lblSearchDetailsOf_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
	lblSearchDetailsOf_1.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			searchdoctor sd=new searchdoctor();
			dispose();
		}
	});
	lblSearchDetailsOf_1.setHorizontalAlignment(SwingConstants.CENTER);
	lblSearchDetailsOf_1.setForeground(new Color(0, 128, 0));
	lblSearchDetailsOf_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblSearchDetailsOf_1.setBackground(Color.GREEN);
	lblSearchDetailsOf_1.setBounds(103, 138, 184, 20);
	getContentPane().add(lblSearchDetailsOf_1);
	
	JLabel lblLogOut = new JLabel("<html><u>Log Out</u></html>");
	lblLogOut.setCursor(new Cursor(Cursor.HAND_CURSOR));
	lblLogOut.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			
			 
				try {
					logout l=new logout();
					dispose();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
			
			
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			
		}
	});
	lblLogOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblLogOut.setForeground(Color.RED);
	lblLogOut.setBounds(356, 16, 68, 19);
	getContentPane().add(lblLogOut);
	
	JLabel label_4 = new JLabel("");
	label_4.setIcon(new ImageIcon("C:\\Users\\bsviz\\Desktop\\download.jpg"));
	label_4.setBounds(68, 165, 46, 14);
	getContentPane().add(label_4);
	
	JLabel lblSearchDetailsOf_2 = new JLabel("<html><u>Search Details of the Employee</u></html>");
	lblSearchDetailsOf_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
	lblSearchDetailsOf_2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			searchemployee se=new searchemployee();
			dispose();		}
	});
	lblSearchDetailsOf_2.setHorizontalAlignment(SwingConstants.CENTER);
	lblSearchDetailsOf_2.setForeground(new Color(0, 128, 0));
	lblSearchDetailsOf_2.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblSearchDetailsOf_2.setBackground(Color.GREEN);
	lblSearchDetailsOf_2.setBounds(103, 162, 196, 20);
	getContentPane().add(lblSearchDetailsOf_2);
	
	JLabel label_5 = new JLabel("");
	label_5.setIcon(new ImageIcon("C:\\Users\\bsviz\\Desktop\\download.jpg"));
	label_5.setBounds(68, 190, 46, 14);
	getContentPane().add(label_5);
	
	JLabel lblenterDetailsOf = new JLabel("<html><u>Enter Details of the Employee</u></html>");
	lblenterDetailsOf.setCursor(new Cursor(Cursor.HAND_CURSOR));
	lblenterDetailsOf.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			enteremployee ee=new enteremployee();
			dispose();		}
	});
	lblenterDetailsOf.setHorizontalAlignment(SwingConstants.CENTER);
	lblenterDetailsOf.setForeground(new Color(0, 128, 0));
	lblenterDetailsOf.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblenterDetailsOf.setBackground(Color.GREEN);
	lblenterDetailsOf.setBounds(100, 187, 196, 20);
	getContentPane().add(lblenterDetailsOf);
	setVisible(true);
	setBounds(500,200,479,271);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
    
       
}
