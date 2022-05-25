package com.string;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String s = "giveyour123445string";

		int vowel=0;
		int remains =0;
		
		for (int i = 0; i < s.length(); i++) {
			
					char charAt = s.charAt(i);	
			
			if(charAt=='a'||charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u') 	
			{				
				System.out.println(charAt);
				vowel=vowel+1;		
			}
			
			else				{
			remains=remains+1;
			}
}

		System.out.println("print vowel letter "+ vowel);
		System.out.println("print remaining letter "+ remains);

}}
