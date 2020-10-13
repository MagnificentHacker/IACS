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

public class TabTable extends JPanel {

	private JTable table = new JTable();	
	private IaTableData tableData;

	public TabTable(JTabbedPane tabbedPane, IaTableData tableData, DefaultTableModel model ) {
		setBackground(new Color(255, 218, 185));

		this.tableData = tableData;
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 41, 734, 211);
		add(scrollPane);
		scrollPane.setViewportView(table);
		table.setModel(tableData);

		TableRowSorter sorter = new TableRowSorter(tableData);
		table.setRowSorter(sorter);

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
