package ia;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabHelp2 extends JPanel {

	public TabHelp2(JTabbedPane tabbedPane) {
		setBackground(new Color(255, 218, 185));
		
		setLayout(null);
	
		JButton btnReturn = new JButton("Return To Menu");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnReturn.setBounds(94, 421, 123, 23);
		add(btnReturn);
		
		JLabel lblNewLabel = new JLabel("How to use application");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(239, 28, 253, 53);
		add(lblNewLabel);
		
		JLabel lblIfApp = new JLabel("If application was already used");
		lblIfApp.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblIfApp.setBounds(249, 92, 253, 15);
		add(lblIfApp);
		
		JLabel lbl1 = new JLabel("1. Click \"Load\" button");
		lbl1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl1.setBounds(10, 145, 233, 14);
		add(lbl1);
		
		JLabel lbl2 = new JLabel("2. Load the file, where you saved your words. Make sure you remember the name or where the file location is.");
		lbl2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl2.setBounds(10, 170, 761, 14);
		add(lbl2);
		
		JLabel lbl3 = new JLabel("4. Go to practice mode section.");
		lbl3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl3.setBounds(10, 220, 233, 14);
		add(lbl3);
		
		JLabel lbl4 = new JLabel("5. Click \"confirm\", as application doesn't have a word and it will not show a word until the next one appears.");
		lbl4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl4.setBounds(10, 245, 670, 21);
		add(lbl4);
		
		JLabel lbl5 = new JLabel("6.Enjoy your practice.");
		lbl5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl5.setBounds(10, 274, 233, 14);
		add(lbl5);
		
		JButton btnNextPage = new JButton("Previous Page");
		btnNextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(5);
			}
		});
		btnNextPage.setBounds(527, 421, 138, 23);
		add(btnNextPage);
		
		JLabel lblClicktable = new JLabel("3. Click \"Table\" button after you load the file to check if words are loaded correctly.");
		lblClicktable.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblClicktable.setBounds(10, 195, 816, 14);
		add(lblClicktable);
		
		
	}
}
