package SWexpert;

public class solution {

	public static void main(String[] args) {
		String s = " 1 2 4";
		
		for(int i=0;i<s.length();i++) {
			Character c = s.charAt(i);
			System.out.println(Character.isWhitespace(c));
		}

	}

}