package seedu.addressbook.data.person;


public class Contact {
	protected final String value;
	protected boolean isPrivate;
	
	public Contact(String value, boolean isPrivate) {
		this.isPrivate = isPrivate;
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public int hashCode() {
		return value.hashCode();
	}
	
	public boolean isPrivate() {
		return isPrivate;
	}
	
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }
    
	public String toString() {
        return value;
    }
}
