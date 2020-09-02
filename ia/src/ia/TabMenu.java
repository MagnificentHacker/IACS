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

	
	public TabMenu(JTabbedPane tabbedPane, TabTbl tableData) {
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
		
		JButton btnNewButton_1 = new JButton("Add words");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_1.setBounds(445, 181, 117, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Table");
		btnNewButton_2.setBounds(149, 368, 117, 23);
		add(btnNewButton_2);
		
		JButton saveButton = new JButton("load");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableData.loadData("\\\\NAEWAWWLIFIL01\\Students\\maxim_mitsenko\\Desktop\\dictionary.txt");
			}
		});
		saveButton.setBounds(445, 270, 117, 23);
		add(saveButton);
		
		JButton loadButton = new JButton("save");
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tableData.saveData("\\\\NAEWAWWLIFIL01\\Students\\maxim_mitsenko\\Desktop\\dictionary.txt");
			}
		});
		
		loadButton.setBounds(149, 270, 117, 23);
		add(loadButton);
		
		
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
