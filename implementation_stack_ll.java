public class implementation_stack_ll{
  public static void main(String[] args) {
      ll_stack st1 = new ll_stack();
       st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);

          st1.display();

        System.out.println("Top Element: " + st1.peek());

        System.out.println("Popped: " + st1.pop());

        st1.display();

        System.out.println("Size: " + st1.size());

        System.out.println("Is Empty: " + st1.isEmpty());



  }
}