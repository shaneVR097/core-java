package StringClass;

public class StringPrograms {
	public int numofalphabets(String s) {
		if(s==null || s.length()==0)
			return -1;
		int a=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z'))
				a++;
		}
		return a;
	}
	public int[] numofdifftypechar(String s) { //assignment
		if(s==null || s.length()==0)
			return null;
		int al=0,nm=0,sp=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z'))
				al++;
			else if (c>='1' && c<='9')
				nm++;
			else if ((c!=' ' || c!='\u0000') && !((c>='a' && c<='z') || (c>='A' && c<='Z')) && !(c>='1' && c<='9'))
				sp++;
		}
		int[] numd= {al,nm,sp};
		return numd;
	}
	public String removenum(String s) { //assignment
		if(s==null || s.length()==0)
			return null;
		String s2="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(!(c>='1' && c<='9'))
				s2+=c;
		}
		return s2;
	}
	public String frstcharupper(String s) { //assignment
	    if(s==null || s.length()==0)
	        return null;
	    
	    String s2="";

	    for(int i=0; i<s.length(); i++) {
	        char c = s.charAt(i);
	        if(i == 0 || (i > 0 && s.charAt(i-1) == ' ' && c != ' ')) {
	            if(c >= 'a' && c <= 'z') {
	                s2 += (char)(c - 32);
	                continue; 
	            }
	        }
	        s2 += c;
	    }
	    return s2;
	}
	
	
	public void printstring(String s) {
		System.out.println("\nGiven String is: '"+s+"'\n");
	}
	
	public String lstcharlower(String s) {
		 if(s==null || s.length()==0)
		        return null;
		    
		 String s2="";

	    for(int i=0; i<s.length(); i++) {
	        char c = s.charAt(i);
	        if(i == (s.length()-1) || (i < (s.length()-1) && s.charAt(i+1) == ' ' && c != ' ')) {
	            if(c >= 'A' && c <= 'Z') {
	                s2 += (char)(c + 32);
	                continue; 
	            }
	        }
	        s2 += c;
	    }
		 
		return s2;
	}

	public String swapfrstlstchar(String s) { //"abC deF ghI" -> "Cba Fed Ihg"
	    if(s==null || s.length()==0)
	        return null;
	    String s2="";
	    int wordStart = -1;  	    
	    for(int i=0; i<s.length(); i++) {
	        char c = s.charAt(i);	        
	        if(c != ' ' && (i == 0 || s.charAt(i-1) == ' ')) {
	            wordStart = i;
	        }	        
	        if(wordStart != -1 && (c == ' ' || i == s.length()-1)) {
	            int wordEnd = (c == ' ') ? i-1 : i;	        
	            if(wordEnd > wordStart) {
	                char firstChar = s.charAt(wordStart);
	                char lastChar = s.charAt(wordEnd);
	                s2 += lastChar;
	
	                for(int j=wordStart+1; j<wordEnd; j++) {
	                    s2 += s.charAt(j);
	                }
	                
	                s2 += firstChar;
	            } else {
	                s2 += s.charAt(wordStart);
	            }
	            if(c == ' ') {
	                s2 += ' ';
	                wordStart = -1;
	            }
	        }
	    }
	    
	    return s2;
	}
	
	public String toUpperCase(String s) {
		if(s==null || s.length()==0)
			return null;
		String s2="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c>='a' && c<='z')) // || (c>='A' && c<='Z')
				c=(char)(c-32);
			s2+=c;
		}
		return s2;
	}
	public String toLowerCase(String s) {
		if(s==null || s.length()==0)
			return null;
		String s2="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c>='A' && c<='Z')) // || (c>='A' && c<='Z')
				c=(char)(c+32);
			s2+=c;
		}
		return s2;
	}
	public String Trim(String s) {
	    if(s == null || s.length() == 0)
	        return null;

	    int start = 0;
	    while (start < s.length() && s.charAt(start) == ' ') {
	        start++;
	    }

	    int end = s.length() - 1;
	    while (end >= start && s.charAt(end) == ' ') {
	        end--;
	    }

	    if (start > end) {
	        return "";
	    }

	    return s.substring(start, end + 1);
	}
	public String removeallspc(String s) {
//		if(s == null || s.length() == 0)
//	        return null;
//		
//		String[] s2=s.split(" ");
//		String s3="";
//		for(int i=0;i<s2.length;i++) {
//			s3+=s2[i];
//		}
//		return s3;
		return s.replace(" ", ""); //1 line implementation
		
	}
	public static void main(String[] args) {
		
		String s="abc@1234";
		StringPrograms sp=new StringPrograms();
		sp.printstring(s);
		System.out.println("\nNumber of alphabets in string "+s+" is: "+sp.numofalphabets(s));
		System.out.println("\nNumber of different type of characters in string are "+"Alphabets: "+sp.numofdifftypechar(s)[0] +" Numbers: "+sp.numofdifftypechar(s)[1] +" Special-characters: "+sp.numofdifftypechar(s)[2]);
		System.out.println("\nString after removal of numbers from "+s+" is: "+sp.removenum(s));
		String s3="abc Def ghi";
		System.out.println("\nString after converting first character of word to upper-case '"+s3+"' is: "+sp.frstcharupper(s3));
		s3="abc  Def  ghi";
		System.out.println("\nString after converting first character of word to upper-case '"+s3+"' is: "+sp.frstcharupper(s3));
		s3=" abc  Def  1hi";
		System.out.println("\nString after converting first character of word to upper-case '"+s3+"' is: "+sp.frstcharupper(s3));
		System.out.println("\nString after converting to upper-case "+s+" is: "+sp.toUpperCase(s));
		s=sp.toUpperCase(s);
		System.out.println("\nString after converting to upper-case "+s+" is: "+sp.toLowerCase(s));
		s="   cpd   ";
		sp.printstring(s);
		System.out.println("\nString after removal of extra spaces: "+s.trim());
		System.out.println("\nString after removal of extra spaces: "+sp.Trim(s));
		s="abcde";
		sp.printstring(s);
		System.out.println("\nSub-string from "+2+"nd index: "+s.substring(1));
		System.out.println("\nSub-string after "+2+"nd index and ends before: "+5+"th index:"+s.substring(2,4));
		char[] c2=s.toCharArray();
		System.out.println(c2);
		String s2=new String(c2);
		sp.printstring(s2);
		s="abcd@1234";
		sp.printstring(s);
		System.out.println("\nIndex-of a character occurrence in string: "+s.indexOf('@'));
		System.out.println("\nIndex-of a character occurrence in string: "+s.indexOf('9'));
		s="abcbc";
		sp.printstring(s);
		System.out.println("\nIndex-of a character occurrence in string: "+s.indexOf('b',2));
		System.out.println("\nIndex-of a character occurrence in string: "+s.indexOf("bc"));
		
		String s4="abc def ijk";
		System.out.println(s4.contains("def"));
		String[] s7=s4.split(" ");
		System.out.println(s7[0]+","+s7[1]+","+s7[2]);
		String s5="abcd";
		String s6="ABCD";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println(s5.startsWith("ab"));
		System.out.println(s5.endsWith("cd"));
		int a=10;
		String s9=null;
		s9=s9.valueOf(a);
		System.out.println(s9);
		String s10="";
		System.out.println(s10.isEmpty());
		s10=" ";
		System.out.println(s10.isBlank());
		String s11="   hello hi  hi students   ";
		System.out.println(s11.replace("hi", "hello"));
		System.out.println(s11.replaceFirst("hi", "hello"));
		System.out.println(s11.stripLeading());
		System.out.println(s11.stripTrailing());
		
		s3="abC deF ghI";
		System.out.println("\nString after converting last character of word to lower-case '"+s3+"' is: "+sp.lstcharlower(s3));
		s3="abC def ghI";
		System.out.println("\nString after converting last character of word to lower-case '"+s3+"' is: "+sp.lstcharlower(s3));
		s3=" abC  De1  fhI";
		System.out.println("\nString after converting last character of word to lower-case '"+s3+"' is: "+sp.lstcharlower(s3));
		
		s3="abC deF ghI";
		System.out.println("\nString after swapping first & last character of word '"+s3+"' is: "+sp.swapfrstlstchar(s3));
		s3="abC def ghI";
		System.out.println("\nString after swapping first & last character of word '"+s3+"' is: "+sp.swapfrstlstchar(s3));
		s3=" abC  De1  fhI";
		System.out.println("\nString after swapping first & last character of word '"+s3+"' is: "+sp.swapfrstlstchar(s3));
		
		s3="abC deF ghI";
		System.out.println("\nString after removing all spaces'"+s3+"' is: "+sp.removeallspc(s3));
		s3="abC def ghI";
		System.out.println("\nString after removing all spaces'"+s3+"' is: "+sp.removeallspc(s3));
		s3=" abC  De1  fhI";
		System.out.println("\nString after removing all spaces'"+s3+"' is: "+sp.removeallspc(s3));
	}
}
 //find how many alphabets present in string
//wap to convert every word last char to lower case
//wap to swap frst and last char of a word