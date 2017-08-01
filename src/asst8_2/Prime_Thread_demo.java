/*8.2) Implement a class that checks whether a given number is a prime using 
both the Thread class and Runnable interface */ 

//  What is Prime number?
//As per definition, Number which is greater than 1 and has only 1 divider which
//is itself is called Prime number. Other numbers are called Composite Number. 
//Let’s take a look: 3, 5, 7, 11, 13 are prime numbers.


package asst8_2;

import java.util.*;

	public class Prime_Thread_demo extends Thread  {
		private Scanner sc;

		/*
		 * A thread, in the context of Java, is the path followed when executing a program.
		 * All Java programs have at least one thread
		 * creating a thread is accomplished by implementing an interface and extending a class.
		 * Every Java thread is created and controlled by the java.lang.Thread class
		 * */
			//The Thread class itself implements Runnable, though its run method does nothing.
			//An application can subclass Thread, providing its own implementation of run
		public void run()
		{
			System.out.println("Please enter a number for Thread Class: ");
			// For taking input from the user, we have to make the object of Scanner class.
			//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
			sc = new Scanner(System.in);
			//Initializing the int variable by user input values.
			int a = sc.nextInt();
			int cnt = 0;
			try
			{
				for(int i=2;i<=a/2;i++)
				{
					//if number is dividing.
					if(a%i==0)
					{
						cnt++;
						
					}
					
				}
				if(cnt > 0)
				{
					System.out.println ("****Checking for Thread Class******\n"+a+" is not a prime number\n");
					Thread.sleep(100); //Calling Sleep to Thread.
				}
				else
				{
					System.out.println ("****Checking for Thread Class******\n"+a+" is a prime number\n");
					Thread.sleep(100); //Calling Sleep to Thread.
				} 
			}
			catch (Exception e){}
				//sc.close();
			}
			
		}
