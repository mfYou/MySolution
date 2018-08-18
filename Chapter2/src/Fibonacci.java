import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        System.out.print(fibonacci(n));
    }

    static long fibonacci(int n){
        if (n==0){
            return 0;
        }
        if (n==1)
            return 1;
        long one = 1;
        long two = 0;
        long res = 0;
        for (int i =2; i<=n; i++){
            res = one + two;
            two = one;
            one = res;
        }
        return res;
    }
}
