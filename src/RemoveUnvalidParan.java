import java.util.Scanner;
import java.util.*;

public class RemoveUnvalidParan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(validExp(s));
    }

    static String validExp(String s){
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(') {
                stack.push(ch);
            }
            else if (ch==')') {
                if(!stack.isEmpty()){
                    stack.pop();
//                    ans.append('(');
//                    ans.append(temp);
//                    ans.append(')');
                    ans = new StringBuilder().append('(').append(ans).append(')');
                }
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
