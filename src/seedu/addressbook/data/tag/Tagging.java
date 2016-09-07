package seedu.addressbook.data.tag;

public class Tagging {
	
	private Person person;
	private Tag tag;
	private String task;
	
	public Tagging (Person person, Tag tag, String task) {
		this.tag = tag;
		this.person = person;
		this.task = task;
	}
	
	public String toString(){
		String operation;
		
		if (this.task == "DELETED") {
			operation = "-";	
		}
		else
		{
			operation = "+";
		}
		
		return operation + person.getName() + tag.toString();
		
	}
}