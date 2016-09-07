package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's phone number in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPhone(String)}
 */
public class Phone extends Contact{

    public static final String EXAMPLE = "123456789";
    public static final String MESSAGE_PHONE_CONSTRAINTS = "Person phone numbers should only contain numbers";
    public static final String PHONE_VALIDATION_REGEX = "\\d+";


    /**
     * Validates given phone number.
     *
     * @throws IllegalValueException if given phone string is invalid.
     */
    public Phone(String phone, boolean isPrivate){
    	super(phone, isPrivate);
    }
    
    public Phone createPhone(String phone, boolean isPrivate) throws IllegalValueException {
        phone = phone.trim();
        if (!isValidPhone(phone)) {
            throw new IllegalValueException(MESSAGE_PHONE_CONSTRAINTS);
        }
        Phone newPhone = new Phone(phone, isPrivate);
        
        return newPhone;
    }

    /**
     * Checks if a given string is a valid person phone number.
     */
    public static boolean isValidPhone(String test) {
        return test.matches(PHONE_VALIDATION_REGEX);
    }

    
}
