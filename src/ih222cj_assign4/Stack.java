package ih222cj_assign4;
import java.util.Iterator;

public interface Stack {
	int size(); 				// Current stack size
	boolean isEmpty(); 			// True if stack is empty
	void push(Object element); 		// Add element at top of stack
	Object pop(); 				// Return and remove top element
						// exception if stack is empty.
	Object peek(); 				// Return (without removing) top element,
						// exception if stack is empty.
	Iterator iterator(); 			// Element iterator
}

