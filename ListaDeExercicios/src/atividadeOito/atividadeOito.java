package atividadeOito;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class atividadeOito extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atividadeOito frame = new atividadeOito();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public atividadeOito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtn_a = new JRadioButton("Plat\u00E3o");
		rdbtn_a.setBounds(85, 113, 109, 23);
		contentPane.add(rdbtn_a);
		
		JRadioButton rdbtn_c = new JRadioButton("Francis Bacon");
		rdbtn_c.setBounds(85, 157, 109, 23);
		contentPane.add(rdbtn_c);
		
		JRadioButton rdbtn_b = new JRadioButton("S\u00F3crates");
		rdbtn_b.setBounds(230, 113, 109, 23);
		contentPane.add(rdbtn_b);
		
		JRadioButton rdbtn_d = new JRadioButton("Descartes");
		rdbtn_d.setBounds(230, 157, 109, 23);
		contentPane.add(rdbtn_d);
		//textField_1.type
		
		JLabel lblNewLabel = new JLabel("De quem \u00E9 a famosa frase \u201CPenso, logo existo\u201D?");
		lblNewLabel.setBounds(85, 26, 254, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Confirme");
		btnNewButton.setBounds(167, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		rdbtn_a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                   if (rdbtn_a.isSelected()) {
					
                	   rdbtn_b.setSelected(false);
                	   rdbtn_c.setSelected(false);
                	   rdbtn_d.setSelected(false);
				}
				
			}			
			
		});
		rdbtn_b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                   if (rdbtn_b.isSelected()) {
					
                	   rdbtn_a.setSelected(false);
                	   rdbtn_c.setSelected(false);
                	   rdbtn_d.setSelected(false);
				}
				
			}			
			
		});
		rdbtn_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                   if (rdbtn_c.isSelected()) {
					
                	   rdbtn_a.setSelected(false);
                	   rdbtn_b.setSelected(false);
                	   rdbtn_d.setSelected(false);
				}
				
			}			
			
		});
		rdbtn_d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                   if (rdbtn_d.isSelected()) {
					
                	   rdbtn_a.setSelected(false);
                	   rdbtn_b.setSelected(false);
                	   rdbtn_c.setSelected(false);
				}
				
			}			
			
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "Selecione uma opção";
				if(rdbtn_a.isSelected())
					message = "Você errou. \n Que pena!";

				if(rdbtn_b.isSelected())
					message = "Você errou. \n Que pena!";
				
				if(rdbtn_c.isSelected())
					message = "Você errou. \n Que pena!";
				
				if(rdbtn_d.isSelected())
					message =  "Você acertou \n Parabéns!!!!";
				
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
			});
	}
}
