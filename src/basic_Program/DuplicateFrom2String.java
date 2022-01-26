package basic_Program;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateFrom2String {
	
	  static String removeDuplicate(char str[], int n)
	    {
	        // Used as index in the modified string
	        int index = 0;
	 
	        // Traverse through all characters
	        for (int i = 0; i < n; i++)
	        {
	 
	            // Check if str[i] is present before it
	            int j;
	            for (j = 0; j < i; j++)
	            {
	                if (str[i] == str[j])
	                {
	                    break;
	                }
	            }
	 
	            // If not present, then add it to
	            // result.
	            if (j == i)
	            {
	                str[index++] = str[i];
	            }
	        }
	        return String.valueOf(Arrays.copyOf(str, index));
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	    	Scanner obje=new Scanner(System.in);

			String s1 =obje.nextLine();
			//String s2=obje.nextLine();
			
	        char str1[] = s1.toCharArray();
	      //  char str2[] = s1.toCharArray();
	        int n = str1.length;
	        System.out.println(removeDuplicate(str1, n));
	    }

}
