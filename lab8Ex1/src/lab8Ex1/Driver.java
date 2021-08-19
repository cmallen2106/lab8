//Christina Sosa
//Programming Fundamentals - Summer 2021
//Lab 8 - Exercise 1

/*Exercise 1
Modify the main method of the Driver class from Lab #7. In this method, do the following:
1. Create instances of an ArrayQ and a LinkedQueue
2. Enqueue the following int's onto the two queues: (1,7,3,4,9,2)
3. Dequeue all the elements from the queues, displaying each int as it's removed
*/

package lab8Ex1;
import java.util.Arrays; 
import java.util.Stack; 

public class Driver {

	public static void main(String[] args) {
		
		// create the ArrayStack and LinkedStack
		ArrayStack arrayStack = new ArrayStack(); 
		LinkedStack linkedStack = new LinkedStack(); 
		
		//pushing values into two stacks
		
		//first array stack
		arrayStack.push(1); 
		arrayStack.push(7); 
		arrayStack.push(3); 
		arrayStack.push(4); 
		arrayStack.push(9); 
		arrayStack.push(2); 
		
		//second linked stack
		linkedStack.push(1); 
		linkedStack.push(7); 
		linkedStack.push(3); 
		linkedStack.push(4);
		linkedStack.push(9);
		linkedStack.push(2); 
		
		//pop off elements from ArrayStack and display each int as it's removed
		while (!arrayStack.isEmpty()) {
			System.out.println("ArrayStack: " + arrayStack.pop());
		}

		System.out.println("\n");
		
		//pop off elements from LinkedStack and display each int as it's removed
		while (!linkedStack.isEmpty()) {
			System.out.println("LinkedStack: " + linkedStack.pop());
		}
		
		System.out.println("\n");
		
		//create new LinkedStack
		LinkedStack linkedStack2 = new LinkedStack(); 
		
		linkedStack2.push(1);
		linkedStack2.push(7);
		linkedStack2.push(3);
		linkedStack2.push(4);
		linkedStack2.push(9);
		linkedStack2.push(2);		
		
		//connect removeBottomHalf method from the LinkedStack class
		linkedStack2.removeBottomHalf(); 
		
		//print remaining elements
		System.out.println("After removing bottom half: " + linkedStack2);
		
		//Time complexity is O(N)
		

	}

}
