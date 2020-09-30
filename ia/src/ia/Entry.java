package ia;

public class Entry {
	String article;
	String german;
	String english;
	
	
	Entry(String article, String german, String english){
		this.article = article;
		this.german = german;
		this.english = english;
	}
	
	public String getArticle() {
		return this.article;
	}
	
	public String getGerman() {
		return this.german;
	}
	
	public String getEnglish() {
		return this.english;
	}
}
