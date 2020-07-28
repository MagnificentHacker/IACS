package ia;

public class Entry {
	String acronym;
	String answer;
	
	
	Entry(String acronym, String answer){
		this.acronym = acronym;
		this.answer = answer;
	}
	
	
	public String getAcronym() {
		return this.acronym;
	}
	
	public String getAnswer() {
		return this.answer;
	}
}
