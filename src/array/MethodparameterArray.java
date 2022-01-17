package array;

public class MethodparameterArray {

	static void m1(int[] a) //method parameter is array
	{ for (int a1:a)
	{ System.out.println(a1);
	}
	}
	static int[] m2() //method return type is array
	{ System.out.println("m1 method");
	return new int[]{100,200,300};
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodparameterArray.m1(new int[]{10,20,30,40});  // call static method m1
		
		int[] x = MethodparameterArray.m2(); // move static method array output to x array
		for (int x1:x)   //  or used direct for (int x1:MethodparameterArray.m2())
		{ System.out.println(x1);
		}
		
		
	}

}
