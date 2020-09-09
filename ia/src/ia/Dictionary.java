package ia;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Dictionary {
	Entry[] entries = new Entry[100];
	int numEntries = 0;
	int nextIndex = 0;
	public static final Path path = Paths.get("\\Users\\maxim\\OneDrive - Nord Anglia Education\\NAE - Files\\Desktop\\dictonary.txt");

	Dictionary() {

		String text = null;

		try(InputStream stream = Files.newInputStream(path)) {
			byte[] bytes = Files.readAllBytes(path);
			text = new String(bytes, Charset.defaultCharset());
			String[] lines = text.split("\\n");
			
			for(String line : lines) {
				int commaIndex = line.indexOf(',');
				String acronym = line.substring(0,commaIndex).trim();
				String definition = line.substring(commaIndex + 1).trim();
				entries[numEntries++] = new Entry(acronym, definition);
				
				
				
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	Entry nextAcro() {
		nextIndex = nextIndex + 1;
		return entries[nextIndex];
	}
	
	public void add(Entry entry) { 
		entries[numEntries] = entry;
		 numEntries += 1;
	}
	public Entry getCurrentEntry() {
		return entries[nextIndex];
	}
}
