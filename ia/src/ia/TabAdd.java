package ia;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Font;

public class TabAdd extends JPanel {
	private JTextField germanTF;
	private JTextField englishTF;
	JLabel myLabel;
	JLabel ansLabel;
	
	public TabAdd(JTabbedPane tabbedPane) {
		setBackground(new Color(255, 218, 185));
		setLayout(null);

		germanTF = new JTextField();
		germanTF.setBounds(77, 201, 130, 26);
		add(germanTF);
		germanTF.setColumns(10);

		englishTF = new JTextField();
		englishTF.setBounds(529, 201, 130, 26);
		add(englishTF);
		englishTF.setColumns(10);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String germanText = germanTF.getText();
				String englishText = englishTF.getText();
				Entry entry = new Entry (germanText, englishText);
				Ia.dictionary.add(entry);
				JOptionPane.showMessageDialog(null, "Word is added");
			}
		});
		btnNewButton.setBounds(313, 398, 97, 26);
		add(btnNewButton);
		
		JLabel lblGerman = new JLabel("German");
		lblGerman.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblGerman.setBounds(77, 164, 117, 38);
		add(lblGerman);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblEnglish.setBounds(529, 169, 130, 29);
		add(lblEnglish);
		
		JLabel lblAddingWordsSection = new JLabel("Adding words section");
		lblAddingWordsSection.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblAddingWordsSection.setBounds(195, 39, 381, 71);
		add(lblAddingWordsSection);
		
		JButton btnBackToMenu = new JButton("Back to menu");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnBackToMenu.setBounds(77, 400, 117, 23);
		add(btnBackToMenu);
		
		JButton btnDoSomePractice = new JButton("Do some practice!");
		btnDoSomePractice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnDoSomePractice.setBounds(529, 400, 157, 23);
		add(btnDoSomePractice);
	}
}
