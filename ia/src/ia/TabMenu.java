package ia;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TabMenu extends JPanel {

	
	public TabMenu(JTabbedPane tabbedPane, IaTableData tableData) {
		setBackground(new Color(255, 218, 185));
		setLayout(null);
		
		JLabel lblWelcomeToGerman = new JLabel("Welcome to German Vocabulary Trainer!");
		lblWelcomeToGerman.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblWelcomeToGerman.setBounds(96, 52, 553, 62);
		add(lblWelcomeToGerman);
		
		JButton beginButton = new JButton("Begin!");
		beginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tabbedPane.setSelectedIndex(1);
			}
		});
		beginButton.setBounds(149, 181, 117, 23);
		add(beginButton);
		
		JButton addWordBTN = new JButton("Add words");
		addWordBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tabbedPane.setSelectedIndex(2);
			}
		});
		addWordBTN.setBounds(445, 181, 117, 23);
		add(addWordBTN);
		
		JButton tableBTN = new JButton("Table");
		tableBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		tableBTN.setBounds(149, 368, 117, 23);
		add(tableBTN);
		
		JButton loadBTN = new JButton("load");
		loadBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableData.loadData();
			}
		});
		loadBTN.setBounds(445, 270, 117, 23);
		add(loadBTN);
		
		JButton saveBTN = new JButton("save");
		saveBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tableData.saveData();
			}
		});
		
		saveBTN.setBounds(149, 270, 117, 23);
		add(saveBTN);
		
		
		JButton aboutButton = new JButton("About");
		aboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tabbedPane.setSelectedIndex(3);
			}
		});
		aboutButton.setBounds(445, 368, 117, 23);
		add(aboutButton);

	}
}
