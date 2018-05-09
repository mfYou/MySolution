import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        System.out.print(climbStairs(n));
    }

    private static int climbStairs(int n){
        if (n<=1)
            return 1;
        int last_one=1;
        int last_two=1;
        int res = 0;
        for (int i=2; i<=n; i++){
            res=last_one+last_two;
            last_two = last_one;
            last_one=res;
        }
        return res;
    }
}
