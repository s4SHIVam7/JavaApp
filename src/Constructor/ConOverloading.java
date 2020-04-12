/**
 *
 * @author SHIVam M. Laidwar
 */
package Constructor;

/**
 *
 * @author SHIVam Laidwar
 */
// Java Program to illustrate constructor overloading 
// using same task (addition operation ) for different 
// types of arguments. 
import java.io.*; 

class Sample3 
{ 
	// constructor with one argument 
	Sample3(String name) 
	{ 
		System.out.println("Constructor with one " + 
					"argument - String : " + name); 
	} 

	// constructor with two arguments 
	Sample3(String name, int age) 
	{ 

		System.out.println("Constructor with two arguments : " + 
				" String and Integer : " + name + " "+ age); 

	} 

	// Constructor with one argument but with different 
	// type than previous.. 
	Sample3(long id) 
	{ 
		System.out.println("Constructor with one argument : " + 
											"Long : " + id); 
	} 
} 

class ConOverloading 
{ 
	public static void main(String[] args) 
	{ 
		// Creating the objects of the class named 'Sample3' 
		// by passing different arguments 

		// Invoke the constructor with one argument of 
		// type 'String'. 
		Sample3 sample2 = new Sample3("Shivam"); 

		// Invoke the constructor with two arguments 
		Sample3 sample3 = new Sample3("Shubham", 23); 

		// Invoke the constructor with one argument of 
		// type 'Long'. 
		Sample3 sample4 = new Sample3(81496164); 
	} 
} 

