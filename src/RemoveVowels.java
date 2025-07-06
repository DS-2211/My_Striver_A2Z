import java.util.*;

public class RemoveVowels {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(remDupl(s));
    }

    static Boolean isVowel(Character c){
        c = Character.toLowerCase(c);
        return ( c=='a' || c=='e' || c=='o' || c=='i' || c=='u' );
    }

    static StringBuilder remDupl(String S){
        StringBuilder ans = new StringBuilder();
        char[] c = S.toCharArray();
        for(int i=0;i<c.length;i++){
            if(!isVowel(c[i])){
                ans.append(c[i]);
            }
            else{
                if((i==0) && isVowel(c[i+1]) || i == c.length-1 && isVowel(c[i-1])){
                    ans.append(c[i]);
                }
                if(i < c.length-1 && i>0 && ( isVowel(c[i+1]) || isVowel(c[i-1]) ) ){
                    ans.append(c[i]);
                }
            }
        }
        return ans;
    }
}
