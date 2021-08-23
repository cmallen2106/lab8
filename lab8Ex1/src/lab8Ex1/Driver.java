//Christina Sosa
//Programming Fundamentals - Summer 2021
//Lab 8 - Exercise 1 - 3

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
		
		// create the ArrayQueue and LinkedQueue
		ArrayQ arrayQ = new ArrayQ(); 
		LinkedQueue linkedQ = new LinkedQueue(); 
		
		//pushing values into two stacks
		
		//first array stack
		arrayQ.enqueue(1); 
		arrayQ.enqueue(7); 
		arrayQ.enqueue(3); 
		arrayQ.enqueue(4); 
		arrayQ.enqueue(9); 
		arrayQ.enqueue(2); 
		
		//second linked stack
		linkedQ.enqueue(1); 
		linkedQ.enqueue(7); 
		linkedQ.enqueue(3); 
		linkedQ.enqueue(4);
		linkedQ.enqueue(9);
		linkedQ.enqueue(2); 
		
		//pop off and print the values until array is empty
		while (!arrayQ.isEmpty()) {
			System.out.println("ArrayQueue: " + arrayQ.dequeue());
		}

		System.out.println("\n");
		
		while (!linkedQ.isEmpty()) {
			System.out.println("LinkedQueue: " + linkedQ.dequeue());
		}
		
		System.out.println("\n");
		
		/*
		 * Modify the LinkedQueue class to include a new method called removeMiddle, which
		 * removes from the queue the value that is in the middle.
		 * For example, if the queue contains 3, 7, 2, 4, 5, then 2 will be removed.
		 * If the queue contains 2, 9, 1, 4 (even number of values), then remove 9 (round down).
		 * Test the method using the Driver program.
		 */
		
		//create new LinkedQueue for Exercise 2
		LinkedQueue linkedQ2 = new LinkedQueue(); 
		
		linkedQ2.enqueue(1);
		linkedQ2.enqueue(7);
		linkedQ2.enqueue(3);
		linkedQ2.enqueue(4);
		linkedQ2.enqueue(9);
		linkedQ2.enqueue(2);		
		
		//printing out without the middle element
		System.out.println("Removed Middle Element: "); 
		linkedQ2.removeMiddle(); 
		
		/*
		 * Exercise 3
		 * Use the tree diagram below to answer the questions below.
		 * a) What is the root node of the tree?
		 * 		50
		 * b) What are the leaf nodes of the tree?
		 * 		9, 14, 19, 67, 76
		 * c) What are the ancestor nodes of the node containing 19?
		 * 		23, 17, 50
		 * d) Write the sequence of node values that you would get from a post-order traversal.
		 * 		9, 14, 12, 19, 23, 17, 67, 54, 76, 72, 50
		 */
		

	}

}
