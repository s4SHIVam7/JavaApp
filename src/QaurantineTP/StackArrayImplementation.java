/**
 *
 * @author SHIVam M. Laidwar
 */
package QaurantineTP;
import java.util.*;
public class StackArrayImplementation 
{
    int top;
    int capacity;
    int[] stack;
    StackArrayImplementation()
    {
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == capacity-1;
    }
    public int push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack Is Full");
        }
        return stack[++top]=data;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Is Empty");
        }
        return stack[top--];
    }
    public int peek()
    {
        return stack[top];
    }
    public void display()
    {
        for(int i:stack)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        StackArrayImplementation st = new StackArrayImplementation();
        st.push(34);
        st.push(314);
        st.push(24);
        st.push(14);
        st.push(40);
        
        System.out.println("Top is Empty : "+st.isEmpty());
        System.out.println("Top is Full : "+st.isFull());
        System.out.println("Capacity Of Stack : "+st.capacity);
        System.out.println("Top Element : "+st.peek());
        System.out.println("Removed Element : "+st.pop());
        st.display();
    }
}
