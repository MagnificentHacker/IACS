package ia;

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

	private JTextField filterTB;
	private JTable table = new JTable();	
	private IaTableData tableData;
	
	public TabTable(JTabbedPane tabbedPane, IaTableData tableData, DefaultTableModel model ) {
		this.tableData = tableData;
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 41, 734, 211);
		add(scrollPane);
		scrollPane.setViewportView(table);
		table.setModel(tableData);

		TableRowSorter sorter = new TableRowSorter(tableData);
		table.setRowSorter(sorter);


		filterTB = new JTextField();
		filterTB.setBounds(76, 10, 532, 20);
		add(filterTB);
		filterTB.setColumns(10);

		filterTB.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {	
				model.fireTableDataChanged();
			}
			@Override
			public void removeUpdate(DocumentEvent e) {
				model.fireTableDataChanged();
			}
			@Override
			public void changedUpdate(DocumentEvent e) {	
				model.fireTableDataChanged();
			}
		});

		sorter.setRowFilter(new RowFilter() {
			@Override
			public boolean include(Entry entry) {
				String name = entry.getValue(0).toString();
				String searchText = filterTB.getText();
				return name.startsWith(searchText);
			}
		});

	}
	public Entry getCurrentEntry() {
		int selectedRow = table.getSelectedRow();
		return tableData.getEntry(selectedRow);
	}
}
