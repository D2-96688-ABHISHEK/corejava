package sdk;

public class StringReverse {

	public static void main(String[] args) {
		String  str = "Abhishek";	
		System.out.println("Original String : " + str);
		
		String empty = "";
		
		char [] chArr= str.toCharArray();
		
		for(int i= chArr.length-1;i>=0;i--) {
			empty += chArr[i];
		}
		System.out.println("Reversed String : " + empty);
			
	}

}
