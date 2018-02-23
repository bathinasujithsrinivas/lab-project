package hospital;

import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class logout extends JFrame {
	int button=0,flag=1;
	logout() {
		super("");
		menu m1=new menu();
		
		
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Are you sure you want to Logout?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(57, 11, 311, 25);
		getContentPane().add(lblNewLabel);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				m1.dispose();
				hospital h1=new hospital();
				dispose();
				
				
				
				
			}
		});
		btnOk.setBounds(84, 47, 89, 23);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnCancel.setBounds(199, 47, 89, 23);
		getContentPane().add(btnCancel);
		setVisible(true);
		setBounds(450,300,600,150);
	}
	
	
}
