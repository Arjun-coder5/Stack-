  class Node{
  int data;
  Node next;
   Node(int data){
   this.data = data;
   this.next = null;
  }
}
public class ll_stack{
private Node top;

    public ll_stack() {
      top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        System.out.println(data + " pushed into stack");
    }
    public int pop(){
       if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
     public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }
    
      public boolean isEmpty() {
        return top == null;
    }

     public int size() {
        int count = 0;
        Node temp = top;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        System.out.print("Stack: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

}