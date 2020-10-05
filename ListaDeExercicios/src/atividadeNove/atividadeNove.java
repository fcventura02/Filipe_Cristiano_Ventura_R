package atividadeNove;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class atividadeNove extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atividadeNove frame = new atividadeNove();
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
	public atividadeNove() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox opBacon = new JCheckBox("Bacon");
		opBacon.setFont(new Font("Verdana", Font.PLAIN, 14));
		opBacon.setBounds(6, 98, 124, 23);
		contentPane.add(opBacon);
		
		JCheckBox opQueijo = new JCheckBox("Queijo");
		opQueijo.setFont(new Font("Verdana", Font.PLAIN, 14));
		opQueijo.setBounds(6, 124, 124, 23);
		contentPane.add(opQueijo);
		
		JCheckBox opMolho = new JCheckBox("Molho ");
		opMolho.setFont(new Font("Verdana", Font.PLAIN, 14));
		opMolho.setBounds(245, 98, 124, 23);
		contentPane.add(opMolho);
				
		JCheckBox opBorda = new JCheckBox("Borda Recheada");
		opBorda.setFont(new Font("Verdana", Font.PLAIN, 14));
		opBorda.setBounds(245, 47, 157, 23);
		contentPane.add(opBorda);
		
		JCheckBox opMilho = new JCheckBox("Milho");
		opMilho.setFont(new Font("Verdana", Font.PLAIN, 14));
		opMilho.setBounds(245, 73, 97, 22);
		contentPane.add(opMilho);
		
		JCheckBox opCoca = new JCheckBox("Coca-Cola");
		opCoca.setFont(new Font("Verdana", Font.PLAIN, 14));
		opCoca.setBounds(6, 47, 97, 23);
		contentPane.add(opCoca);
		
		JCheckBox opFanta = new JCheckBox("Fanta");
		opFanta.setFont(new Font("Verdana", Font.PLAIN, 14));
		opFanta.setBounds(6, 72, 97, 23);
		contentPane.add(opFanta);
		
		JLabel lblNewLabel = new JLabel("Acr\u00E9scimos");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(6, 11, 139, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_7 = new JLabel("9.00");
		lblNewLabel_7.setBounds(183, 53, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("3.50");
		lblNewLabel_8.setBounds(453, 53, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("R$");
		lblNewLabel_9.setBounds(419, 78, 23, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("1.00");
		lblNewLabel_10.setBounds(453, 104, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("2.00");
		lblNewLabel_11.setBounds(183, 130, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("2.00");
		lblNewLabel_12.setBounds(183, 104, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("7.00");
		lblNewLabel_13.setBounds(183, 78, 46, 14);
		contentPane.add(lblNewLabel_13);
			
		JLabel lblNewLabel_9_1 = new JLabel("R$");
		lblNewLabel_9_1.setBounds(419, 53, 23, 16);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("3,50");
		lblNewLabel_8_1.setBounds(453, 53, 46, 14);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("1.00");
		lblNewLabel_8_1_1.setBounds(453, 79, 46, 14);
		contentPane.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_9_2 = new JLabel("R$");
		lblNewLabel_9_2.setBounds(419, 104, 23, 16);
		contentPane.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("R$");
		lblNewLabel_9_1_1.setBounds(150, 53, 23, 16);
		contentPane.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_9_1_2 = new JLabel("R$");
		lblNewLabel_9_1_2.setBounds(150, 79, 23, 16);
		contentPane.add(lblNewLabel_9_1_2);
		
		JLabel lblNewLabel_9_1_3 = new JLabel("R$");
		lblNewLabel_9_1_3.setBounds(150, 104, 23, 16);
		contentPane.add(lblNewLabel_9_1_3);
		
		JLabel lblNewLabel_9_1_4 = new JLabel("R$");
		lblNewLabel_9_1_4.setBounds(150, 130, 23, 16);
		contentPane.add(lblNewLabel_9_1_4);
		
		JButton btnConfirm = new JButton("Confirmar");
		btnConfirm.setBounds(237, 208, 89, 23);
		contentPane.add(btnConfirm);
		
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String message = "";
				double cost = 0.0;
				for (Component item : contentPane.getComponents()) {
					if (item.getClass().equals (JCheckBox.class)) {
						JCheckBox jck = (JCheckBox) item;
						if ((jck.getText() == "Bacon" || jck.getText() == "Queijo") && jck.isSelected())
							cost = cost + 2.00;
						if((jck.getText() == "Milho" || jck.getText() == "Molho") && jck.isSelected())
							cost = cost + 1.00;
						if(jck.getText() == "Borda Recheada" && jck.isSelected())
							cost = cost + 3.50;
						if(jck.getText() == "Coca-Cola" && jck.isSelected())
							cost = cost + 9.00;
						if(jck.getText() == "Fanta" && jck.isSelected())
							cost = cost + 7.00;

						if (jck.isSelected())
							message += jck.getText() +", ";
						
					}
				}
				
				JOptionPane.showMessageDialog(null, message+"\n"+"Valor: R$ " + cost, "Acréscimo adicionados",JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
}
