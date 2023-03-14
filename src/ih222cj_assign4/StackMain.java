package ih222cj_assign4;


import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {
      StackClass myStack = new StackClass(2);
      myStack.push(1);
	System.out.println(myStack.peek());
	 myStack.push(2);
		System.out.println(myStack.peek());

	 myStack.push(3);
		System.out.println(myStack.peek());
/*
	 myStack.push(4);
		System.out.println(myStack.peek());

	myStack.push(5);
	System.out.println(myStack.peek());

	*/
		Iterator it= myStack.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

}
	}

