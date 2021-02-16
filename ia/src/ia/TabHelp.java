package ia;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabHelp extends JPanel {


	public TabHelp(JTabbedPane tabbedPane) {
		setBackground(new Color(255, 218, 185));

		setLayout(null);

		JButton btnReturn = new JButton("Return To Menu");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnReturn.setBounds(94, 421, 129, 23);
		add(btnReturn);

		JLabel lblNewLabel = new JLabel("How to use application");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(239, 28, 253, 53);
		add(lblNewLabel);
		
		JLabel lblIfApp = new JLabel("If application is run for the first time follow this rules");
		lblIfApp.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblIfApp.setBounds(181, 92, 422, 15);
		add(lblIfApp);
		
		JLabel lbl1 = new JLabel("1. Go to \"Add Words\" section.");
		lbl1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl1.setBounds(55, 135, 233, 14);
		add(lbl1);
		
		JLabel lbl2 = new JLabel("2. Add words that you want to.");
		lbl2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl2.setBounds(55, 164, 233, 14);
		add(lbl2);
		
		JLabel lbl3 = new JLabel("3. Go to practice mode section.");
		lbl3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl3.setBounds(55, 195, 233, 14);
		add(lbl3);
		
		JLabel lbl4 = new JLabel("4. Click \"confirm\", as application doesn't have a word and it will not show a word until the next one appears.");
		lbl4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl4.setBounds(55, 220, 670, 21);
		add(lbl4);

		JLabel lbl5 = new JLabel("5.Enjoy your practice.");
		lbl5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl5.setBounds(55, 252, 233, 14);
		add(lbl5);

		JButton btnNextPage = new JButton("Next Page");
		btnNextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(6);
			}
		});
		btnNextPage.setBounds(527, 421, 109, 23);
		add(btnNextPage);

		JLabel lblmakeSureBefore = new JLabel("6.Make sure before you close the application - you save the words.");
		lblmakeSureBefore.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblmakeSureBefore.setBounds(55, 282, 535, 14);
		add(lblmakeSureBefore);

		JLabel lblWordsAre = new JLabel("! WORDS ARE NOT SAVED AUTOMATICALLY - IT SHOULD BE DONE MANUALLY IN MENU !");
		lblWordsAre.setBackground(Color.RED);
		lblWordsAre.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblWordsAre.setBounds(26, 367, 718, 14);
		add(lblWordsAre);


	}
}
