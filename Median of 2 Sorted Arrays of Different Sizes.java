import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
	// Function to find max 
	static int maximum(int a, int b) 
	{ 
		return a > b ? a : b; 
	} 
	
	// Function to find minimum 
	static int minimum(int a, int b) 
	{ 
		return a < b ? a : b; 
	} 
	
	// Function to find median 
	// of two sorted arrays 
	static double getMedian(int n, int m, int a[], int b[]) 
	{ 
		
		int min_index = 0, 
			max_index = n, i = 0, 
			j = 0, median = 0; 
		
		while (min_index <= max_index) 
		{ 
			i = (min_index + max_index) / 2; 
			j = ((n + m + 1) / 2) - i; 
		
			if (i < n && j > 0 && b[j - 1] > a[i])	 
				min_index = i + 1; 
				
			else if (i > 0 && j < m && b[j] < a[i - 1])	 
				max_index = i - 1; 

			else
			{
				if (i == 0)		 
					median = b[j - 1];	
					
				else if (j == 0)		 
					median = a[i - 1];		 
				else	
					median = maximum(a[i - 1], 
									b[j - 1]);		 
				break; 
			} 
		} 
		if ((n + m) % 2 == 1) 
			return (double)median; 
		
		if (i == n) 
			return (median + b[j]) / 2.0; 
		
		if (j == m) 
			return (median + a[i]) / 2.0; 
		
		return (median + minimum(a[i], 
								b[j])) / 2.0; 
	} 
	
	static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        double res;
        if (n < m)
            res = getMedian (n, m, a, b);
        else
            res = getMedian (m, n, b, a);
        
        return res;
    }
}
