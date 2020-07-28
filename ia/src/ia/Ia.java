package ia;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Ia extends JFrame  {

	public static Color PEACH = new Color(255, 218, 185);
	public static Dictionary dictionary = new Dictionary();
	private static final int MAX = 5;
	private final JTabbedPane pane = new JTabbedPane();
	JTextField word;
	static JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ia ia = new Ia();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Ia() {
		setTitle("German practice vocab");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 528);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(100, 100, 822, 528);
		getContentPane().add(tabbedPane);
		setVisible(true);

		TabMenu tabmenu = new TabMenu(tabbedPane);
		Tab1 tab1 = new Tab1(tabbedPane);
		TabAdd tabAdd = new TabAdd(tabbedPane);
		TabAbout tabAbt = new TabAbout(tabbedPane);

		tabbedPane.addTab("Menu",tabmenu);
		tabbedPane.addTab("Vocab",tab1);
		tabbedPane.addTab("Add", tabAdd);
		tabbedPane.addTab("About", tabAbt);
		tab1.setLayout(null);
		tabmenu.setLayout(null);
		tabAdd.setLayout(null);
		tabAbt.setLayout(null);
		
	}
}