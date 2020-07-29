package ia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class TabAdd extends JPanel {
	private JTextField germanTF;
	private JTextField englishTF;
	JLabel myLabel;
	JLabel ansLabel;
	
	public TabAdd(JTabbedPane tabbedPane) {
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
				ansLabel.setText("");
			}
		});
		btnNewButton.setBounds(357, 352, 117, 29);
		add(btnNewButton);
	}

}
