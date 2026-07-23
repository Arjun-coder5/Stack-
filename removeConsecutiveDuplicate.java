import java.util.ArrayDeque;

class removeConsecutive_Duplicate {
    public static String removeConsecutiveDuplicates(String s) {
        // Your code here
        if(s==null||s.isEmpty()){
            return s;
        }
        ArrayDeque<Character> st = new ArrayDeque<>();
        for(int i = 0;i<s.length();i++){
            char x = s.charAt(i);
            if(st.isEmpty()||st.peek()!=x){
                st.push(x);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}