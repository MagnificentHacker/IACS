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
		EnhancedTabbedPane tabbedPane = new EnhancedTabbedPane(EnhancedTabbedPane.TOP);
		tabbedPane.setBounds(100, 100, 822, 528);
		getContentPane().add(tabbedPane);
		setVisible(true);
		tabbedPane.setBackground(new Color(255, 218, 185));
	
		IaTableData tableData = new IaTableData();
		TabAdd tabAdd = new TabAdd(tabbedPane, tableData);
		TabAbout tabAbt = new TabAbout(tabbedPane);
		TabTable tabTbl = new TabTable(tabbedPane, tableData, tableData);
		TabMenu tabmenu = new TabMenu(tabbedPane, tableData);
		TabQuiz tab1 = new TabQuiz(tabbedPane, tabTbl);
		TabHelp tabHelp = new TabHelp(tabbedPane);
		TabHelp2 tabHelp2 = new TabHelp2(tabbedPane);
		
		
		tabbedPane.addTab("Menu",tabmenu);
		tabbedPane.addTab("Vocab",tab1);
		tabbedPane.addTab("Add", tabAdd);
		tabbedPane.addTab("About", tabAbt);
		tabbedPane.addTab("Table", tabTbl);
		tabbedPane.addTab("Help", tabHelp);
		tabbedPane.addTab("Help2", tabHelp2);
		tab1.setLayout(null);
		tabmenu.setLayout(null);
		tabAdd.setLayout(null);
		tabAbt.setLayout(null);
		tabHelp.setLayout(null);
		tabHelp2.setLayout(null);
		tabbedPane.setTabsVisible(false);
	}
}