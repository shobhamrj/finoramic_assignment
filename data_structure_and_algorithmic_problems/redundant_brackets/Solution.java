 
public class Solution {
    public int braces(String A) {
        int n = A.length();
        Stack<Character> s = new Stack<>();
        int op = 0;
        for(int i = 0; i < n; i++){
            if(A.charAt(i) == '('){
                if(s.isEmpty())
                    op = 0;
                s.push(A.charAt(i));
            }
            else if(isOperand(A.charAt(i)))
                op++;
            else if(A.charAt(i)==')'){
                if(op == 0)
                return 1;
                op--;
                s.pop();
            }
        }
        return 0;
    }

    public boolean isOperand(Character c){
        if(c == '+' || c == '-' || c == '*' || c == '/')
            return true;
        return false;
    }
}
