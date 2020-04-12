package QaurantineTP;

import java.lang.*;
class Addition
{
	public static void main(String args[])
	{
		int num1,num2;
		num1 = 20;
		num2 = 7;
		int add = num1 + num2; //Addition
		int sub = num1 - num2; //Substraction
		int mul = num1 * num2; //Multiplication
		int div = num1 / num2; //Division
		int rem = num1 % num2; //Reminder

		System.out.println(" I am doing java program ");
		System.out.println("\n" +num1 +"+" +num2 +"=" +add);
		System.out.println("\n" +num1 +"-" +num2 +"=" +sub);
		System.out.println("\n" +num1 +"*" +num2 +"=" +mul);
		System.out.println("\n" +num1 +"/" +num2 +"=" +div);
		System.out.println("\n" +num1 +"%" +num2 +"=" +rem);
	}
}