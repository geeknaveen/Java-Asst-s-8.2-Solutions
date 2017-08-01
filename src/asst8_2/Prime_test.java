/*
Printing whether a given number is a prime or not.  */

package asst8_2;

public class Prime_test
{

public static void main(String[] args) {
	//Both method invoke start to Start the new Thread
	
	//Creating object of class Prime_thread_demo
	Thread thread_demo = new Prime_Thread_demo();
	//Starting thread_demo Thread.
	thread_demo.start(); 

  	//Creating object of class Prime_Runnable_demo
	Prime_Runnable_demo prime_runnable=new Prime_Runnable_demo();
	Thread th= new Thread(prime_runnable);
	//Starting prime_runnable Thread.
	th.start();
	
	}

}
