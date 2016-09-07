package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void checkNull() {
		assertTrue(Utils.isAnyNull("1234", null));
	}
	
	public void checkNoNull() {
		assertFalse(Utils.isAnyNull("1234", "5678"));
	}
	
	public void allUnique() {
		ArrayList<String> test = new ArrayList<String> ();
		test.add("1234");
		test.add("5678");
		assertTrue(Utils.elementsAreUnique(test));
	}
	
	public void allNotUnique() {
		ArrayList<String> test = new ArrayList<String> ();
		test.add("1234");
		test.add("1234");
		assertFalse(Utils.elementsAreUnique(test));
	}
		

}
