package ia;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import com.google.gson.Gson;

public class IaTableData extends DefaultTableModel {

	static final Object[] tableHeadings = new Object[] 
			{"Article" , "German word", "English word"};
	public static final Path dataPath = Paths.get("C:\\Users\\maxim\\OneDrive - Nord Anglia Education\\NAE - Files\\Desktop\\dictonary.txt"); 
	IaTableData() {
		super(tableHeadings,0);
	}
	public void saveData() {
		Gson gson = new Gson();
		Vector dataVector = this.getDataVector();
		String textData = gson.toJson(dataVector);
		System.out.println(textData);
		System.out.println("Data saved");


		try {
			Files.write(dataPath, textData.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadData () {

		try {
			String textData = new String(Files.readAllBytes(dataPath));
			System.out.println(textData);
			System.out.println("Data loaded");


			Gson gson = new Gson();
			List tableData = gson.fromJson(textData, List.class);
			this.setRowCount(0);
			for(Object rowData : tableData) {
				this.addRow(new Vector((List)rowData));
			}
			System.out.println(tableData);
			this.fireTableDataChanged();


		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void add(String article, String wordG, String wordEN ) {
		addRow(new Object[] {article,wordG,wordEN});
	}

	public void deleteSelectedRowFromJtable(int row) {
		if (row >= 0) {
			removeRow(row);
			JOptionPane.showMessageDialog(null, "Row Deleted");
		} else {
			JOptionPane.showMessageDialog(null,"Unable To Delete", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	public Entry getEntry(int row) {
		System.out.println(row);
		if (row < 0) {
			return new Entry ("", "", "");
		}
		String article = this.getValueAt(row, 0).toString();
		String german = this.getValueAt(row, 1).toString();
		String english = this.getValueAt(row, 2).toString();
		return new Entry(article, german, english);
	}
}

