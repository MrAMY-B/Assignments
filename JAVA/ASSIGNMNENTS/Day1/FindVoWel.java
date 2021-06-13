//2)	using switch ….case   display whether character is vowel or not.

public class FindVowel{
	public static void main(String args[]){
		
		char ch='O';
		System.out.println();
		switch(ch){
		case 'A':
		case 'a': System.out.println(ch+" is Vovel");
				break;
		case 'E':
		case 'e': System.out.println(ch+" is Vovel");
				break;
		case 'I':
		case 'i': System.out.println(ch+" is Vovel");
				break;
		case 'O':
		case 'o': System.out.println(ch+" is Vovel");
				break;
		case 'U':
		case 'u': System.out.println(ch+" is Vovel");
				break;
		default: System.out.println("Character is not a Vovel");
			break;
		}	
	
	}
}
