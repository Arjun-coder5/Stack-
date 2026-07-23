import java.util.Stack;

class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        int sizes = s.size();
        solve(s, sizes, 0);
    }
    
    public void solve(Stack<Integer> s, int sizeOfStack, int currentCount) {
        // Base case: We reached the middle element from the top
        if (currentCount == sizeOfStack / 2) {
            s.pop();
            return;
        }
        
        // Remove the top element and store it in the current call stack frame
        int temp = s.pop();
        
        // Recursively move towards the middle
        solve(s, sizeOfStack, currentCount + 1);
        
        // Push the stored element back onto the stack
        s.push(temp);
    }
}

public class delete_mid_stack {
    public static void main(String[] args) {
        Solution solver = new Solution();

        
        Stack<Integer> s1 = new Stack<>();
        s1.push(10); 
        s1.push(20);
        s1.push(30); 
        s1.push(40);
        s1.push(50); 
        
        System.out.println("Example 1 Input (Top to Bottom):  " + getTopToBottomString(s1));
        solver.deleteMid(s1);
        System.out.println("Example 1 Output (Top to Bottom): " + getTopToBottomString(s1));
        System.out.println();

        
        Stack<Integer> s2 = new Stack<>();
        s2.push(10); 
        s2.push(20); 
        s2.push(30);
        s2.push(40); 

        System.out.println("Example 2 Input (Top to Bottom):  " + getTopToBottomString(s2));
        solver.deleteMid(s2);
        System.out.println("Example 2 Output (Top to Bottom): " + getTopToBottomString(s2));
    }

   
    private static String getTopToBottomString(Stack<Integer> st) {
        @SuppressWarnings("unchecked")
        Stack<Integer> temp = (Stack<Integer>) st.clone();
        StringBuilder sb = new StringBuilder("[");
        while (!temp.isEmpty()) {
            sb.append(temp.pop());
            if (!temp.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
