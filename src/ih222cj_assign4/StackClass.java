package ih222cj_assign4;

import java.util.Iterator;

/*
 * size() is missing
 * iteraitor() also
 */
public class StackClass implements Stack {
	int maxSize;
	int top;
	Object arr[];
	
	public StackClass(int n ){
		maxSize = n;
		arr = new Object [maxSize];
		top =0;
		
		
	}
	
	public boolean isEmpty(){
		if(top==0){
			return true;
		}
		
		else{
		return false;
		}
	}
	
	public void push(Object num){
		if(top<maxSize){
		arr[top]=num;
		top++;
		}
		else{
			System.out.println("Stack Overflow");
			
			Object[] temp = new Object[arr.length];
			for(int i = 0 ; i < arr.length; i++){
				temp[i] = arr[i];
				
			}
			arr = temp;
		}
	}
	
	public Object pop(){
		if(top>0){
			
			Object temp = this.peek();
			arr[top-1]=(Integer) null;
			top--;
			return temp;
		}
		else{
			return (Integer) null;
		}
		

	}
	public Object peek(){
		if(top>0){
			return arr[top-1];
		}
		else{
			return (Integer) null;
		}
		
	}

	@Override
	public int size() {
		return this.top;
	}

	

	@Override
	public Iterator iterator() {
		return new StackIterator();
	}
	class StackIterator implements Iterator<Object>{
		private int current;
		private int max = top;
		
		@Override
		public boolean hasNext() {
			return current < max;
		}

		@Override
		public Object next() {
			return arr[current++];
		}
		
	}
}

