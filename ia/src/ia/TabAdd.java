package ia;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;

public class TabAdd extends JPanel {
	private JTextField germanTF;
	private JTextField englishTF;
	JLabel myLabel;
	JLabel ansLabel;
	
	public TabAdd(JTabbedPane tabbedPane, TabTbl tableData) {
		setBackground(new Color(255, 218, 185));
		setLayout(null);

		germanTF = new JTextField();
		germanTF.setBounds(257, 201, 130, 26);
		add(germanTF);
		germanTF.setColumns(10);

		englishTF = new JTextField();
		englishTF.setBounds(529, 201, 130, 26);
		add(englishTF);
		englishTF.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(ArticleType.values()));
		comboBox.setBounds(77, 203, 85, 22);
		add(comboBox);
		
		JLabel articleLabel = new JLabel("Article");
		articleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		articleLabel.setBounds(77, 168, 85, 30);
		add(articleLabel);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object article = comboBox.getSelectedItem();
				tableData.add(article.toString(),germanTF.getText(),englishTF.getText());
				JOptionPane.showMessageDialog(null, "Word is added");
				englishTF.setText("");
				germanTF.setText("");
			}
		});
		btnNewButton.setBounds(313, 398, 97, 26);
		add(btnNewButton);
		
		JLabel germanLabel = new JLabel("German");
		germanLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		germanLabel.setBounds(257, 164, 117, 38);
		add(germanLabel);
		
		JLabel englishLabel = new JLabel("English");
		englishLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		englishLabel.setBounds(529, 169, 130, 29);
		add(englishLabel);
		
		JLabel addingWordSection = new JLabel("Adding words section");
		addingWordSection.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		addingWordSection.setBounds(195, 39, 381, 71);
		add(addingWordSection);
		
		JButton backToMenuBT = new JButton("Back to menu");
		backToMenuBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		backToMenuBT.setBounds(77, 400, 117, 23);
		add(backToMenuBT);
		
		JButton doPraticeBT = new JButton("Do some practice!");
		doPraticeBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		doPraticeBT.setBounds(529, 400, 157, 23);
		add(doPraticeBT);
		
	
	}
}
