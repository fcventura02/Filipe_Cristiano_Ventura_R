package atividadeDez;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class atividadeDez extends JFrame {

	private JPanel contentPane;
	private JTextField tfAddress;
	private JTextField tfName;
	private JTextField tfLastname;
	private JTextField tfDistrict;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atividadeDez frame = new atividadeDez();
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
	public atividadeDez() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> cBCity = new JComboBox<String>();
		cBCity.setBounds(284, 109, 118, 22);
		contentPane.add(cBCity);
		
		cBCity.addItem("Belo Horizonte");
		cBCity.addItem("Santa Luzia");
		cBCity.addItem("Contagem");
		cBCity.addItem("Ouro Preto");
		cBCity.addItem("Divinopolis");
		
		tfAddress = new JTextField();
		tfAddress.setBounds(10, 110, 248, 20);
		contentPane.add(tfAddress);
		tfAddress.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(10, 50, 110, 20);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfLastname = new JTextField();
		tfLastname.setBounds(148, 50, 110, 20);
		contentPane.add(tfLastname);
		tfLastname.setColumns(10);
		
		tfDistrict = new JTextField();
		tfDistrict.setBounds(10, 172, 110, 20);
		contentPane.add(tfDistrict);
		tfDistrict.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Bairro");
		lblNewLabel.setBounds(10, 152, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rua/Avenida");
		lblNewLabel_1.setBounds(10, 85, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setBounds(10, 25, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sobrenome");
		lblNewLabel_3.setBounds(148, 25, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnConfirm = new JButton("Confirmar");
		btnConfirm.setBounds(134, 227, 144, 23);
		contentPane.add(btnConfirm);
		
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String city = (String) cBCity.getSelectedItem ();
				String address = (String) tfAddress.getText ();
				String name = (String) tfName.getText ();
				String lastname = (String) tfLastname.getText ();
				String district = (String) tfDistrict.getText ();
				
				System.out.println(tfAddress.getText().length());
				
				if(address.length() != 0 && name.length() != 0 && lastname.length() != 0 && lastname.length() != 0)
				JOptionPane.showMessageDialog(contentPane, "Entrega para o sr. " + name + " " + lastname +
						"\n" + "no endere�o: " + address + "\n" + "Bairro: " + district + "\n" +
						"City: " + city
						);
			}
		});		

	}
}
