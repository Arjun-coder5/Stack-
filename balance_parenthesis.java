
import java.util.ArrayDeque;

public class balance_parenthesis {
  public static void main(String[] args) {
    String s = "(()))";
    System.out.println(check(s));
  }
  public static boolean check(String s){
    ArrayDeque<Character> st = new ArrayDeque<>();
    for(int i = 0;i<s.length();i++){
      char x = s.charAt(i);
      if(x=='('||x=='['||x=='{'){
        st.push(x);
      }else {
        if(st.isEmpty()==true)
          return false;
        else if(matching(st.pop(),x)==false)
          return false;
        else
          st.pop();
      }

    }
    return s.isEmpty();
  }
  public static boolean matching(char open,char close){
     return (open=='('&&close==')')||(open=='['&&close==']')||(open=='{'&&close=='}');
  }
}
