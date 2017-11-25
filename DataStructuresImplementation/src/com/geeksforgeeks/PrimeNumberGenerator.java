package com.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberGenerator 
{
	public static void main(String[] args) throws IOException
	{
		int n;
		
		System.out.println("Enter the input");
		//methods to take input
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		n = Integer.parseInt(br.readLine());
		
		//it will help to identify the prime numbers
		boolean prime[] = new boolean[n+1];
		
		//initialize the boolean matrix
		for(int i=2; i<=n; i++)
		{
			prime[i] = true;
		}
		
		for(int i=2; i<Math.sqrt(n); i++)
		{
			for(int j=i*i; j<=n; j += i)
			{
				if(j%i == 0) //it will check whether a number has a factor or not
				{
					prime[j] = false;
				}
			}
		}
		
		System.out.println("The prime nos smaller than "+ n + " are...");
		for(int i=2; i<=n; i++)
		{
			if(prime[i] == true)
				System.out.print(i + " ");
		}
	}

}
