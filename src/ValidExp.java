import java.util.*;

public class ValidExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(validExpr(s));
    }
    public static boolean validExpr(String s){
        Stack<Character> stack = new Stack<>();
        char prev = ' ';

        for(char ch : s.toCharArray()){
            if(ch == '(') stack.push(ch);
            else  if(ch ==')') {
                if(stack.isEmpty() || prev =='+'|| prev =='-'|| prev =='*'|| prev =='/'|| prev =='%') return false;
                stack.pop();
            }
            if(ch == '+' ||ch == '*' ||ch == '-' ||ch == '/' || ch == '%' ){
                if(prev==')' || prev == '('  || prev== '+' ||prev == '*' ||prev == '-' ||prev == '/' || prev == '%') return false;
            }
            prev = ch;
        }

        return (stack.isEmpty() && prev!='(' && prev!=')' && prev!='+' && prev!='-' && prev!='*' && prev!='/' && prev!='%');
    }
}
