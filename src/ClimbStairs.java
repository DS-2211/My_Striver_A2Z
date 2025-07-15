//leetcode 70


public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n){
        if(n<4) return n;
        return climbStairs(n-2)+climbStairs(n-1);
    }

}
