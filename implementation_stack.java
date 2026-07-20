public class implementation_stack
 {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        System.out.println("Is Empty : " + s.isEmpty());

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        System.out.println("Top Element : " + s.peek());

        System.out.println("Popped : " + s.pop());

        s.display();

        System.out.println("Size : " + s.size());

        s.push(50);
        s.push(60);

        s.display();

        s.push(70); // Overflow

        while (!s.isEmpty()) {
            System.out.println("Removed : " + s.pop());
        }

        s.pop(); // Underflow
         
    }
}