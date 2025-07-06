import java.util.*;

//LC

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(decStr(s));
    }

//    static StringBuilder decodeStr(String s){
//        Stack<Integer> numstk = new Stack<>();
//        Stack<StringBuilder> strstk = new Stack<>();
//
//        int num=0;
//        StringBuilder ans = new StringBuilder();
//
//        for(char c : s.toCharArray() ){
//            if(Character.isDigit(c)){
//                num = (num * 10) + c-'0';
//            }
//            else if(c == '['){
//                numstk.push(num);
//                num=0;
//                strstk.push(ans);
//                ans = new StringBuilder();
//            }
//            else if(c == ']'){
//                String str = ans.toString();
//                ans = new StringBuilder( str.repeat(numstk.pop()) );
//                ans = strstk.pop().append(ans);
//            }
//            else{
//                ans.append(c);
//            }
//        }
//        return ans;
//    }

    static StringBuilder decStr(String S){
        int num=0;
        StringBuilder ans = new StringBuilder();

        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();

        for(char c : S.toCharArray()){
            if(Character.isDigit(c)){
                num = (num*10) + (c-'0');
            }
            else if(c == '['){
                numStack.push(num);
                num=0;
                strStack.push(ans);
                ans = new StringBuilder();
            }
            else if(c == ']'){
                String s = ans.toString();
                ans = new StringBuilder( s.repeat(numStack.pop()) );
                ans = strStack.pop().append(ans);
            }
            else{
                ans.append(c);
            }
        }
        return ans;
    }
}
