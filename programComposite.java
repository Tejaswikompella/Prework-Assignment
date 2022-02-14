package javaPractice;

import java.util.Scanner;

public class programComposite {

    //function to checkPalindrome
	Scanner Sc = new Scanner(System.in);
public void checkPalindrome()  {
	
	System.out.println("Enter the number:");
	int n=Sc.nextInt();
	  int r,sum=0,temp;    
	  //It is the number variable to be checked for palindrome  
	  
	  temp=n;    
	  while(n>0){    
	   r=n%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");
	  
}



     //function to printPattern

public void printPattern() {

		 
	 
	    System.out.println("Enter the number of rows: "); //takes input from user
	 
	    int rows = Sc.nextInt();
	 
	    for (int i= rows-1; i>=0 ; i--)
	    {
	    for (int j=0; j<=i; j++)
	    {
	    System.out.print("*" + " ");
	    }
	    System.out.println();
	    }
	    
}



   //function to check no is prime or not

 public void checkPrimeNumber() {
	 
	 System.out.println("Enter the number");
	 int num = Sc.nextInt();	
	 boolean gl = checkPrime(num);
	 if(gl)
	 {
	 	System.out.println("It is a Prime Number");
	 }
	 else
	 {
	 	System.out.println("It is Not a Prime Number");
	 }	 
 }
	 
 public static boolean checkPrime(int n)
	{
		int count = 0;
		for(int i = 2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count>0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

 
   // function to print Fibonacci Series

 public void printFibonacciSeries() {

         //initialize the first and second value as 0,1 respectively.

    int first = 0, second = 1; 
    System.out.println("Enter number for series:");
    int n=Sc.nextInt();
    System.out.println("Fibonacci series till "+ n +" terms");
    for(int i=1;i<=n;i++)
    {
    	System.out.println(first +"  ");
    	int F = first+second;
    	first = second;
    	second = F;
    }
   }

	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		programComposite obj = new programComposite();
		
		int choice;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

			+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();
			choice = sc.nextInt();
			switch (choice) {

			 

			case 0:

			choice = 0;

			break;

			 

			case 1: {

			obj.checkPalindrome();

			}

			break;

			 

			case 2: {

			 

			obj.printPattern();

			}

			break;

			 

			case 3: {

			obj.checkPrimeNumber();

			}

			break;

			 

			case 4: {

			 

			obj.printFibonacciSeries();

			}

			break;

			 

			default:

			System.out.println("Invalid choice. Enter a valid no.\n");

			}

			 

			} while (choice != 0);

			System.out.println("Exited Successfully!!!");

			sc.close();

			}


}


