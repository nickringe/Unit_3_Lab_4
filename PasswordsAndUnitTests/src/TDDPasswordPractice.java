import java.util.ArrayList;

public class TDDPasswordPractice {
	public static void newListHome() {
		ArrayList<String> newList = new ArrayList<>();

		passList(newList, "PAsswOrd"); //fail, no number
		passList(newList, "1fjfjEIfjfj13"); //fail, too many characters
		passList(newList, "1sIxUh"); //fail, not enough characters
		passList(newList, "123456AA"); //fail, has a 6
		passList(newList, "1pAss tEst"); //fail, has a space
		passList(newList, "0abcdEfghI"); //PASS
		passList(newList, "0abcdEfghI"); //fail, repeat
		passList(newList, "0abcdEfI"); //PASS
		passList(newList, "admin"); //PASS
		passList(newList, "mod"); //PASS
		passList(newList, "1PAsswOrd"); //PASS
		passList(newList, "1PAssword"); //fail, repeat
		passList(newList, "mod"); //fail, repeat
		passList(newList, "admin"); //fail, repeat
		System.out.println(newList); //just to verify the above is correct
	}

	public static void passList(ArrayList<String> a, String b) {
		if (addPassword(b) == true && a.contains(b) == false) {
			a.add(b);
		} else if ((b.equalsIgnoreCase(("admin")) || b.equalsIgnoreCase("mod")) && (a.contains("mod") == false)) {
			a.add(b);
		} else if ((b.equalsIgnoreCase(("admin")) || b.equalsIgnoreCase("mod")) && (a.contains("admin") == false)) {
			a.add(b);
		} else {
			
		}
	}


	public static Boolean addPassword(String a) {
		int vowelCount = 0;

		if (a.contains("1") || a.contains("2") || a.contains("3") || a.contains("4") || a.contains("5")
				|| a.contains("7") || a.contains("8") || a.contains("9") || a.contains("0")) {

		} else {
//			System.out.println("Invalid entry. Password must contain at least one number.");
			return false;
		}

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O'
					|| a.charAt(i) == 'U' || a.charAt(i) == 'Y') {
				vowelCount++;
			}
		}
		if (vowelCount >= 2) {

		} else {
//			System.out.println("Invalid entry. Password must contain at least 2 uppercase vowels.");
			return false;
		}

		if (a.length() < 7 || a.length() > 12) {
//			System.out.println("Invalid entry. Password must contain between 7-12 characters.");
			return false;
		} else if (a.contains("6")) {
//			System.out.println("Invalid entry. Password must not contain the number 6.");
			return false;
		} else if (a.contains(" ")) {
//			System.out.println("Invalid entry. Password must not contain a space.");
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		newListHome(); //calling ArrayList itself
	}
}
