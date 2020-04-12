/**
 *
 * @author SHIVam M. Laidwar
 */
package Constructor;
// Java Program to illustrate calling of 
// parameterized constructor. 
import java.io.*; 

class Sample2 
{ 
	// data members of the class. 
	String name; 
	int id; 

	// constructor would initialize data members 
	// with the values of passed arguments while 
	// object of that class created. 
	Sample2(String name, int id) 
	{ 
		this.name = name; 
		this.id = id; 
	} 
} 

class ParaConstructor 
{ 
	public static void main (String[] args) 
	{ 
		// this would invoke the parameterized constructor.
            int n=20;
            String name="SHIVam";
		Sample2 s1 = new Sample2(name, n); 
		System.out.println("Sample2Name :" + s1.name + 
						" and Sample2Id :" + s1.id); 
	} 
} 
