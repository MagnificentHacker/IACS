package ia;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;

public class Tab1 extends JPanel {


	JTextField entryField;
	JLabel myLabel;
	JButton button;
	JTextArea textarea;
	Entry entry;

	public Tab1(JTabbedPane tabbedPane) {
		setBackground(new Color(255, 218, 185));

		entryField = new JTextField();
		entryField.setBounds(212, 226, 446, 28);
		this.add(entryField);
		entryField.setColumns(10);

		JButton confirmb = new JButton("Confirm");
		confirmb.setBounds(361, 310, 89, 23);
		this.add(confirmb);

		JButton finishPr = new JButton("Finish practice");
		finishPr.setBounds(33, 400, 145, 23);
		this.add(finishPr);

		JLabel ansLabel = new JLabel("");
		ansLabel.setBounds(215, 91, 425, 38);
		this.add(ansLabel);
		ansLabel.setFont(new Font("Times New Roman", Font.PLAIN, 26));

		JButton btnTable = new JButton("Table");
		btnTable.setBounds(255, 400, 89, 23);
		this.add(btnTable);

		JButton btnRevealAnswer = new JButton("Reveal Answer");
		btnRevealAnswer.setBounds(400, 400, 155, 23);
		this.add(btnRevealAnswer);

		JButton nextQ = new JButton("next Question");
		nextQ.setBounds(600, 400, 175, 23);
		this.add(nextQ);

		myLabel = new JLabel(Ia.dictionary.getCurrentEntry().getAcronym());
		myLabel.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		myLabel.setLocation(212,109);
		myLabel.setSize(446,176);
		this.add(myLabel);


		confirmb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Entry entry = Ia.dictionary.getCurrentEntry();
				String userAns = entryField.getText();
				if(Ia.dictionary.getCurrentEntry().getAnswer().contentEquals(userAns)) {
					ansLabel.setText("correct");
				} else {
					ansLabel.setText("incorrect");
					ansLabel.setText("Correct answer:" + Ia.dictionary.getCurrentEntry().getAnswer());
					System.out.println(Ia.dictionary.getCurrentEntry().getAnswer() + "." + userAns);
				} 
			}
		});

		nextQ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				entryField.setText("");
				entry = Ia.dictionary.nextAcro();
				if (entry == null) {
					JOptionPane.showMessageDialog(null, "The quiz is over!");
				} else {
					myLabel.setText(Ia.dictionary.getCurrentEntry().getAcronym());
					ansLabel.setText("");
				}
			}
		});
	}

}
