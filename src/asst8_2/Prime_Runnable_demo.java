/*8.2) Implement a class that checks whether a given number is a prime using 
both the Thread class and Runnable interface */ 

//In order to create , execute and run a simple Thread in Java , we need to perform few operations . 
//We can create a thread by two ways : 

//1 . First way is to create a thread by implementing Runnable Interface . Generally , Runnable Interface 
//has one method called as run . This run method performs the logic for our thread . We have to provide 
//implementation to this method from the Runnable Interface and execute it when we want to execute code in 
//threads.     
//2 . Second way is to extend Thread class in Java and override run method 

package asst8_2;

import java.util.*;

//The Runnable interface defines a single method, run, meant to contain the code executed in the thread.
	public class Prime_Runnable_demo implements Runnable {
		
		public void run()
		{
			System.out.println("Please enter a number for Runnable interface: \n");
			
			// For taking input from the user, we have to make the object of Scanner class.
			//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
			Scanner sc = new Scanner(System.in);
			
			//Initializing the int variable by user input values.
			int a = sc.nextInt();
			int cnt = 0;
			try
			{
				//Using for loop, we're checking whether given number is dividing by 2 or not.
				for(int i=2;i<=a/2;i++)
				{
					if(a%i==0)
					{
						cnt++;
						
					}
										
				}
				if(cnt > 0)
				{
					System.out.println ("****Checking for Runnable Interface******\n"+a+" is not a prime number\n");
				}
				else
				{
					System.out.println ("****Checking for Runnable Interface******\n"+a+" is a prime number\n");
				}
			}
			catch (Exception e){}
			sc.close();
		}
		
		}
			