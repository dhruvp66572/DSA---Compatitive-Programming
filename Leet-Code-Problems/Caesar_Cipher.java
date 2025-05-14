public class Caesar_Cipher {

	public static String ans(String s, int k) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
            if (Character.isLetter(current)) {
                if (Character.isLowerCase(current)) {
                    current = (char) ('a' + (current - 'a' + k) % 26);
                } else {
                    current = (char) ('A' + (current - 'A' + k) % 26);
                }
            }
			result.append(current);
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String s = "HELLO WORLD";
		int k = 3;
		System.out.println("Cipher: " + ans(s, k));
	}
}
