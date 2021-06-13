//5)	Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  
	
public class Result{
	public static void main(String args[]){
		int per=85;
		if(per>=80)
			System.out.println("Pass with Grade A first class with #DISTINCTION"); 
		else if(per>=75)
			System.out.println("Pass with Grade A first class"); 
		else if(per>=60)
			System.out.println("Pass with Grade B Second class"); 
		else if(per>=50)
			System.out.println("Pass with Grade C Third class"); 
		else if(per>=34)
			System.out.println("Pass "); 
		else 
			System.out.println("Fail "); 
		
	}
}

