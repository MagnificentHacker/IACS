package ia;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;

public class TabQuiz extends JPanel {


	JTextField entryField;
	JLabel myLabel;
	JButton button;
	JTextArea textarea;
	Entry entry;

	public TabQuiz(JTabbedPane tabbedPane, TabTable tabTbl) {
		setBackground(new Color(255, 218, 185));

		entryField = new JTextField();
		entryField.setBounds(212, 226, 446, 28);
		this.add(entryField);
		entryField.setColumns(10);

		JButton confirmb = new JButton("Confirm");
		confirmb.setBounds(361, 310, 89, 23);
		this.add(confirmb);

		JLabel ansLabel = new JLabel("");
		ansLabel.setBounds(215, 91, 425, 38);
		this.add(ansLabel);
		ansLabel.setFont(new Font("Times New Roman", Font.PLAIN, 26));

		JLabel artAnsLabel = new JLabel();
		artAnsLabel.setBounds(152,109, 446, 176);
		this.add(artAnsLabel);
		artAnsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 26));

		JButton bckBt = new JButton("Back to Menu");
		bckBt.setBounds(33, 400, 145, 23);
		this.add(bckBt);

		bckBt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(0);
			}
		});


		JButton btnTable = new JButton("Table");
		btnTable.setBounds(255, 400, 89, 23);
		this.add(btnTable);

		JButton btnRevealAnswer = new JButton("Reveal Answer");
		btnRevealAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userAns = entryField.getText();
					ansLabel.setText("Correct answer:" + entry.getEnglish());
			}
		});
		btnRevealAnswer.setBounds(400, 400, 155, 23);
		this.add(btnRevealAnswer);

		JButton nextQ = new JButton("next Question");
		nextQ.setBounds(600, 400, 175, 23);
		this.add(nextQ);

		entry = tabTbl.getCurrentEntry();
		myLabel = new JLabel(entry.getGerman());
		myLabel.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		myLabel.setLocation(212,109);
		myLabel.setSize(446,176);
		this.add(myLabel);


		confirmb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String userAns = entryField.getText();
				if(entry.getEnglish().contentEquals(userAns)) {
					ansLabel.setText("correct!");
				} else {
					ansLabel.setText("incorrect, try again!");
					ansLabel.setText("Correct answer:" + entry.getEnglish());
				} 
			}
		});

		nextQ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				entryField.setText("");
				entry = tabTbl.nextEntry();
				String german = entry.getGerman();
				if (entry == null) {
					ansLabel.setText("Correct answer:" + entry.getEnglish());
				} else {
					myLabel.setText(german);
					ansLabel.setText("");
				}
			}
		});
		btnTable.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(4);
			}
		});
	}
}
