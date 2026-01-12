package conditionals;

public class LetterCaseConverter {
	public static void main(String[] args) {
		char ch='D';
		if(ch>='A' && ch<='Z') {
			System.out.println( (char)(ch-'A'+'a') + " is the Lowercase of "+ch);
		} else if(ch>='A' && ch<='Z') {
			System.out.println( (char)(ch-'A'+'a') + " is the Uppercase of "+ch);
		} else 
			System.out.println(ch+" is not an alphabet character"); 	
	}
}
