package practice;

import java.util.Scanner;

public class SubstractNo
{
	public static void main(String[] args) 
	{
		int N1, N2,result;
		System.out.println("Addition of two number");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number one");
		 N1=input.nextInt();
		
		System.out.println("Enter secound number");
		 N2=input.nextInt();
		
		 result=N1+N2;
	    // System.out.println(result);
		System.out.printf("%d+%d=%d",N1,N2,result);		
	}

}
