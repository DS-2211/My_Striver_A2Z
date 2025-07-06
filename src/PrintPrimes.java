import java.util.*;

public class PrintPrimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(isPrime(num)) ans.add(num);
        }
        for(int i : ans){
        System.out.print(i+" ");
    }}

    static Boolean isPrime(int n){
        if(n<2) return false;
        if(n==2 || n==3) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

}
