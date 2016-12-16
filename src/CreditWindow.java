import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreditWindow {
	
	JFrame CreditFrame;
	JPanel mainPanel, secondPanel;
	JTextField FioField, SummaCreditField, MonthDoxodField, NumberField, DoxodCreditField;
	JComboBox dayBox, monthBox, yearBox, creditHistoryBox, vidCreditBox, srokBox;
	JLabel SevenLabel, FioLabel, PolLabel, DataLabel, SummaCreditLabel, MonthDoxodLabel, NumberLabel;
	JButton order;
	JCheckBox polM, polZh;
	BorderLayout bl;
	GridBagLayout gbl;
	String[] vid =  {"На развитие ЛПХ", "Нецелой под залог недвижимости", "Пенсионный", 
			"Потребительский без обеспечения", "Потребительский с обеспечением"};
	String [] srok = {"1","2","3"};
	
	@SuppressWarnings("rawtypes")
	CreditWindow(){
		CreditFrame = new JFrame("ЗАПОЛНИТЕ ЗАЯВКУ");
		mainPanel = new JPanel();
		bl = new BorderLayout();
		mainPanel.setLayout(bl);
		
		secondPanel = new JPanel();
		gbl = new GridBagLayout();
		secondPanel.setLayout(gbl);
		GridBagConstraints c = new GridBagConstraints();
		
		FioLabel = new JLabel("ФИО");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.weightx = 0.5;			
			c.gridx = 0;
			c.gridy = 0;
		secondPanel.add(FioLabel, c);
		
		FioField = new JTextField();
			c.fill = GridBagConstraints.HORIZONTAL;
			c.weightx = 0.5;			
			c.gridx = 0;
			c.gridy = 1;
		secondPanel.add(FioField, c);
	
		PolLabel = new JLabel("Пол");
			c.weightx = 0.25;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.gridy = 0;
		secondPanel.add(PolLabel, c);
		
	
		polM = new JCheckBox("М");
		c.weightx = 0.25;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		secondPanel.add(polM, c);
		
		polZh = new JCheckBox("Ж");
		c.weightx = 0.25;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		secondPanel.add(polZh, c);
		
		DataLabel = new JLabel("Дата рождения");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 0;
		secondPanel.add(DataLabel, c);
		
		String[] month = {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль",
				"Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
		monthBox = new JComboBox(month);
			c.weightx = 0.1;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 2;
			c.gridy = 1;
			secondPanel.add(monthBox, c);
			
			vidCreditBox = new JComboBox(vid);
			c.weightx = 0.5;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 3;
			secondPanel.add(vidCreditBox, c);
			
			SummaCreditField = new JTextField();
			c.weightx = 0.5;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 4;
			secondPanel.add(SummaCreditField, c);
			
			
			srokBox = new JComboBox(srok);
			c.weightx = 0.5;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 5;
			secondPanel.add(srokBox, c);
			
			DoxodCreditField = new JTextField();
			c.weightx = 0.5;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 6;
			secondPanel.add(srokBox, c);
			
		mainPanel.add("North",secondPanel );
		
		CreditFrame.setContentPane(mainPanel);
		CreditFrame.pack();
		CreditFrame.setVisible(true);
		
		CreditEngine myEngine = new CreditEngine(this);
		
		
//		SummaCredit = new JLabel("Сумма кредита");
//		MonthDoxod = new JLabel("Ежемесячный доход");
//		Number = new JLabel("Номер телефона");
//		
//		
//		seven = new JLabel("+7");
//		order = new JButton("Оформить");
		
//	
//	String[] years = new String[76];
//	for (int i = 1930; i < 2016; i++) {
//		years[i] = Integer.toString(i);
//	}
//	yearBox = new JComboBox(years);
//	
//		
//		
//		
//		
//		String[] creditHistory = {"Никогда не брал кредит", "Имеется непогашенный кредит", 
//		"Имеются полностью погашенные кредиты"};
//		creditHistoryBox = new JComboBox(creditHistory);
//		
//		
//		
//		JComboBox[] srokBox = new JComboBox[7];
//		for (int i = 0; i <= srokBox.length; i++ ){
//			srokBox[i] = new JComboBox();}
//		
//		secondPanel = new JPanel();
//		gl = new GridLayout(10,2,10,10);
//		secondPanel.setLayout(gl);
//		
//		secondPanel.add(Fio);
		
		}
		
		
		
		
		
	}
	


