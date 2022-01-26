package basic_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Compare2StringWordGenericWAy {

	
	 static String removeDuplicate(char str1[],char str2[], int n)
		    {
		        // Used as index in the modified string
		        int index = 0;
		 
		        // Traverse through all characters
		        for (int i = 0; i < n; i++)
		        {
		 
		            // Check if str[i] is present before it
		            int j;
		            for (j = 0; j < str2.length; j++)
		            {
		                if (str1[i] == str2[j])
		                {
		                    break;
		                }
		            }
		 
		            // If not present, then add it to
		            // result.
		            if (j == i)
		            {
		                str2[index++] = str2[i];
		            }
		        }
		        return String.valueOf(Arrays.copyOf(str2, index));
		    }
		 
		 
		    // Driver code
		    public static void main(String[] args)
		    {
		    	Scanner obje=new Scanner(System.in);

				String s1 =obje.nextLine();
				String s2=obje.nextLine();
				
		        char str1[] = s1.toCharArray();
		        char str2[] = s1.toCharArray();
		        int n = str1.length;
		        System.out.println(removeDuplicate(str1,str2, n));
		    }

        
}    
    	
    	
    
    
    
    

	
    
    
    		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

