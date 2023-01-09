
class node{
	node next;
	int data;
	
	node(int d){
		data= d;
		next= null;
		
	}
}

class mystack{
	int size;
	node head;
	
	mystack(){
		size =0;
		head= null;;
	}
	
	
	void push(int x) {
		node temp = new node(x);
	    temp.next= head;
		head= temp;
		size++;
	}
	
	
	
	int pop() {
		if(head == null) {
			System.out.print("the stack is empty");
		}
		
		int res = head.data;
		node temp = head;
		head= head.next;
		size--;
		
		return res;
	}
	
	
	
	
	
	int peek() {
		
		if(head== null) {
			System.out.print("the head is null");
		}
		
		return head.data;
		
	}
	
	
	int size() {
		return size;
	}
	
	
	boolean isEmpty() {
		return head==null;
	}
	
	
}












public class stack {
	
	public static void main (String[] args)
	{
		mystack s=new mystack();
	    s.push(5);
	    s.push(10);
	    s.push(20);
	    System.out.println(s.pop());
	    System.out.println(s.size());
	    System.out.println(s.peek());
	    System.out.println(s.isEmpty());
	}

}
