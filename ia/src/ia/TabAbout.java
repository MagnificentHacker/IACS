package ia;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabAbout extends JPanel {


	public TabAbout(JTabbedPane tabbedPane) {
			setLayout(null);

		
			
			JLabel labelabt = new JLabel("About");
			labelabt.setFont(new Font("Times New Roman", Font.BOLD, 31));
			labelabt.setBounds(330, 24, 103, 46);
			add(labelabt);
			
			JLabel labelname = new JLabel("Author: Maxim Mitsenko");
			labelname.setFont(new Font("Times New Roman", Font.ITALIC, 17));
			labelname.setBounds(229, 151, 228, 24);
			add(labelname);
			
			JLabel labeldate = new JLabel("Date of Creation: 30.06.2020");
			labeldate.setFont(new Font("Times New Roman", Font.ITALIC, 17));
			labeldate.setBounds(229, 186, 286, 24);
			add(labeldate);
			
			JLabel labelversion = new JLabel("Version: 1.00");
			labelversion.setFont(new Font("Times New Roman", Font.ITALIC, 17));
			labelversion.setBounds(229, 221, 244, 24);
			add(labelversion);
			
			JButton btnReturn = new JButton("Return");
			btnReturn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tabbedPane.setSelectedIndex(0);
				}
			});
			btnReturn.setBounds(574, 290, 89, 23);
			add(btnReturn);
			
			
		}

	}
