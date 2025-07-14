import java.util.*;

public class LongestValidPar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
//        int val = 0,max =0;
//        Stack<Character> stk = new Stack<>();
//        for(char c : s.toCharArray()){
//            if( c=='[' || c=='(' || c=='{' ){
//                stk.push(c);
//            }
//            else if(c==']' || c==')' || c=='}'){
//                if(!stk.isEmpty()) {
//                    if (validPar(c, stk.pop())){
//                        val+=2;
//                    }
//                }
//            }
//            else{
//                continue;
//            }
//            if(max < val) max = val;
//        }
//
//        return max;
        int max=0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='('){
                stk.push(i);
            }
            else{
                stk.pop();
                if(stk.isEmpty()) stk.push(i);
                else{
                    max = Math.max(max,i-stk.peek());
                }
            }
        }
        return max;
    }
    public static Boolean validPar(char c, char prev){
        return (prev=='[' && c==']') || (prev=='{' && c=='}') || (prev=='(' && c==')');
    }
}
