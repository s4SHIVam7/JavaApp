
// Java Program to illustrate calling a 
// no-argument constructor 
package Constructor;
import java.io.*; 

class Sample 
{ 
	int num; 
	String name; 

	// this would be invoked while an object 
	// of that class is created. 
	Sample() 
	{ 
		System.out.println("Constructor called"); 
	} 
} 

class DefConstructor 
{ 
	public static void main (String[] args) 
	{ 
		// this would invoke default constructor. 
		Sample S1 = new Sample(); 

		// Default constructor provides the default 
		// values to the object like 0, null 
		System.out.println(S1.name); 
		System.out.println(S1.num); 
	} 
} 

