package atividadeSeis;

import javax.swing.JOptionPane;

public class atividadeSeis {
	public static void main (String args[]) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		if(nome.length() >= 2) {
			String num = JOptionPane.showInputDialog("Digite sua idade: ");
			if(num != null && num.length() != 0) {
				int idade = Integer.parseInt(num);
				if(idade >= 18) {
					JOptionPane.showMessageDialog(null, "Parab�ns " + nome + " vo� pode tirar a habilita��o" , "CNH", JOptionPane.PLAIN_MESSAGE);	
				}else {
					JOptionPane.showMessageDialog(null, "Infelismente voce n�o pode tirar cateira de motorista, por ser menor de idade" + 
							"\n" + "voc� possu�: " + idade + " anos." , "CNH", JOptionPane.PLAIN_MESSAGE);	
			}
			}else {
				JOptionPane.showMessageDialog(null, "Digite uma idade valido!", "CNH", JOptionPane.PLAIN_MESSAGE);	

			}
		}else {
			JOptionPane.showMessageDialog(null, "Digite um nome valido!", "CNH", JOptionPane.PLAIN_MESSAGE);	
		}
	}
}
