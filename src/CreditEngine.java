import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CreditEngine implements ActionListener, ItemListener {
	
	private CreditWindow creditWindow;
	
	private CreditWindow cw;
	String creditItem;
	String srokItem;
	private int stavka = 0;
	private int summa = 0;
	private int srok = 0;
	private int doxod = 0;
	
	CreditEngine(CreditWindow cw){
		this.cw = cw;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (creditItem.equals(cw.vid[0])){
			stavka = 20;
			summa = Integer.parseInt(cw.SummaCreditField.getText());
			srok = Integer.parseInt(srokItem);
			doxod = Integer.parseInt(cw.DoxodCreditField.getText());
			// и так далее
		}
		if (creditItem.equals(cw.vid[0]) && summa > 2000000){
			JOptionPane.showConfirmDialog(null, "Вы превысили допустимую сумму кредита", "Ошибка", JOptionPane.PLAIN_MESSAGE);
		}
		if (creditItem.equals(cw.vid[0]) && doxod < 15000){
			JOptionPane.showConfirmDialog(null, "Нищеброд", "Ошибка", JOptionPane.PLAIN_MESSAGE);

	}
	
	

}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		JComboBox selectedBox = (JComboBox) arg0.getSource();
		if (selectedBox == cw.vidCreditBox) {
			creditItem = arg0.getItem().toString();
		}
		if (selectedBox == cw.srokBox) {
			srokItem = arg0.getItem().toString();
		}
	}
}
