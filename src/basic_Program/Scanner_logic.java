package basic_Program;

import java.util.Scanner;

/* 1st create objec of scaner
 * 2nd used import java.util.Scanner;
 * call input in the object
 * 
 * */


public class Scanner_logic {

	
	public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	
	Scanner obje=new Scanner(System.in);
//	String name=obje.next();
	String fullname=obje.nextLine();
	int rollNo=obje.nextInt();
	String Div=obje.next();
	boolean tru=obje.hasNext();
	double percent=obje.nextDouble();
	
//	 System.out.println(name);
	 System.out.println(fullname);
	 System.out.println(rollNo);
	 System.out.println(Div);
	 System.out.println(tru);
	 System.out.println(percent);
	 
	
	
	}
	
	
	
}
