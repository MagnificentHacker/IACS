package ia;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tab1 extends JPanel {


	JTextField entryField;
	JLabel myLabel;
	JButton button;
	JTextArea textarea;
	Entry entry;

	public Tab1(JTabbedPane tabbedPane) {

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
		btnRevealAnswer.setBounds(449, 400, 155, 23);
		this.add(btnRevealAnswer);

		JButton nextQ = new JButton("next Question");
		nextQ.setLocation(285, 480);
		nextQ.setSize(200,30);
		this.add(nextQ);

		myLabel = new JLabel(Ia.dictionary.getCurrentEntry());
		myLabel.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		myLabel.setLocation(212,109);
		myLabel.setSize(446,176);
		this.add(myLabel);


		confirmb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Entry entry = Ia.dictionary.getCurrentEntry();
				String userAns = entryField.getText();
				if(entry.getAnswer().contentEquals(userAns)) {
					ansLabel.setText("correct");

				} else {
					ansLabel.setText("incorrect");
					ansLabel.setText("Correct answer:" + entry.getAnswer());
					System.out.println(entry.getAnswer() + "." + userAns);
				} 
			}
		});
	}

}
