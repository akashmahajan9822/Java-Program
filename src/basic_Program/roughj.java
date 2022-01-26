package basic_Program;

import java.util.Scanner;

public class roughj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obje=new Scanner(System.in);

		String str1 =obje.nextLine();
		String str2=obje.nextLine();
		
		String s1[] = {str1};
		String s2[]= {str2};
		
		
		String s2new="";

		 System.out.println(s1.length);
		 System.out.println(s2.length);
		 
		 
		
		for(int i=0;i<s1.length;i++) {
			
			for(int j=0;i<s2.length;j++) {
			
			if(s1[i].equalsIgnoreCase(s2[j])) {
				
	    s2new=	str2.replace(s2[j], "");		
				
			}
			
		}}
		
	
		 System.out.println(s1);
		 System.out.println(s2new);
			}
	
	}


