package ia;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.TableUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TabTable extends JPanel {

	private JTable table = new JTable();	
	private IaTableData tableData;

	public TabTable(JTabbedPane tabbedPane, IaTableData tableData, DefaultTableModel model ) {
		setBackground(new Color(255, 218, 185));

		this.tableData = tableData;
		setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(238, 5, 452, 402);
		add(scrollPane);
		scrollPane.setViewportView(table);
		table.setModel(tableData);

		TableRowSorter sorter = new TableRowSorter(tableData);
		table.setRowSorter(sorter);
		
		JButton backToMenuBT = new JButton("Back to Menu");
		backToMenuBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		backToMenuBT.setBounds(95, 366, 129, 23);
		add(backToMenuBT);
		
		JButton backToPracticeBT = new JButton("Back to Practice");
		backToPracticeBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		backToPracticeBT.setBounds(95, 335, 129, 23);
		add(backToPracticeBT);
		
		JButton removeLineBT = new JButton("Remove line");
		removeLineBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			model.removeRow(table.getSelectedRow());
			JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
			}
		});
		removeLineBT.setBounds(95, 301, 129, 23);
		add(removeLineBT);

		tabbedPane.setBackground(new Color(255, 218, 185));
	}
	public Entry getCurrentEntry() {
		int selectedRow = table.getSelectedRow();
		return tableData.getEntry(selectedRow);
	}
	public Entry nextEntry() {
		int selectedRow = table.getSelectedRow();
		selectedRow += 1;
		if(selectedRow >= table.getRowCount()) {
			selectedRow = 0;
		}
		table.getSelectionModel().setSelectionInterval(selectedRow, selectedRow);
		return tableData.getEntry(selectedRow);
	}
}
