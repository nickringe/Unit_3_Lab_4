import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TDDPasswordPracticeTest {

	@Test
	void testVowels1() {
		boolean expected = true;
		boolean actual = TDDPasswordPractice.addPassword("pAsswOrd1");		
		assertEquals(expected, actual);
			}
	
	@Test
	void testVowels2() {
		boolean expected = false;
		boolean actual = TDDPasswordPractice.addPassword("pesswYrd1");		
		assertEquals(expected, actual);
			}
	@Test
	void testSpace1() {
		boolean expected = false;
		boolean actual = TDDPasswordPractice.addPassword("pEss wYrd1");		
		assertEquals(expected, actual);
			}
	
	@Test
	void testSpace2() {
		boolean expected = true;
		boolean actual = TDDPasswordPractice.addPassword("pEsswYrd1");		
		assertEquals(expected, actual);
			}
	
	@Test
	void test7to12() {
		boolean expected = false;
		boolean actual = TDDPasswordPractice.addPassword("pEYrd1");		
		assertEquals(expected, actual);
			}
	
	@Test
	void test7to12two() {
		boolean expected = false;
		boolean actual = TDDPasswordPractice.addPassword("pEYrd17890123");		
		assertEquals(expected, actual);
			}
	
	@Test
	void testHasNumNot6() {
		boolean expected = true;
		boolean actual = TDDPasswordPractice.addPassword("EY123457890");		
		assertEquals(expected, actual);
			}
	
	@Test
	void testHasNumNot6Two() {
		boolean expected = false;
		boolean actual = TDDPasswordPractice.addPassword("EY623457890");		
		assertEquals(expected, actual);
			}
	
	@Test
	void testIfPasswordExists1() {
		ArrayList<String> expected = new ArrayList<>();
		String testString = "1pAsswOrd";
		expected.add(testString);
		ArrayList<String> actual = new ArrayList<>();
		actual.add(testString);
		String testStringDuplicate = "1pAsswOrd";
		TDDPasswordPractice.passList(actual, testStringDuplicate);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIfPasswordExists2() {
		ArrayList<String> expected = new ArrayList<>();
		String testString = "1pAsswOrd";
		expected.add(testString);
		ArrayList<String> actual = new ArrayList<>();
		actual.add(testString);
		actual.add(testString);
		TDDPasswordPractice.passList(actual, testString);
		assertNotEquals(expected, actual);
	}
		
	@Test
	void testAdminMod1() {
		ArrayList<String> expected = new ArrayList<>();
		String testMod = "mod";
		expected.add(testMod);
		ArrayList<String> actual = new ArrayList<>();
		TDDPasswordPractice.addPassword(testMod);
		TDDPasswordPractice.passList(actual, testMod);
		assertEquals(expected, actual);
			}
	
	@Test
	void testAdmin1() {
		ArrayList<String> expected = new ArrayList<>();
		String testMod = "admin";
		expected.add(testMod);
		ArrayList<String> actual = new ArrayList<>();
		TDDPasswordPractice.addPassword(testMod);
		TDDPasswordPractice.passList(actual, testMod);
		assertEquals(expected, actual);
			}
	
}
