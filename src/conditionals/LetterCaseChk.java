package conditionals;

public class LetterCaseChk {
	public static void main(String[] args) {
		char ch='y';
		if(ch>='a' && ch<='z')
			System.out.println(ch+" is a Lowercase alphabet letter");
		else if(ch>='A' && ch<='Z')
			System.out.println(ch+" is an Uppercase alphabet letter");
		else
			System.out.println(ch+" is not an alphabet character");
	}
}
