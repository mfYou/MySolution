import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        String s = sn.next();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s){
        return new StringBuffer(s).reverse().toString();
    }
}
