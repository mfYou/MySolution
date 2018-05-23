import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test3 {
    public static void main(String args[]){
//        Scanner sn = new Scanner(System.in);
//        String test = sn.nextLine();
        String test1 = "unsigned int test[10]";
        String[] arr=test1.split("\\s+");
        int count  = getCount(arr);
        System.out.print(count);
    }
    private static int getCount(String[] arr){
        if (arr.length>3||arr.length<2){
            return 0;
        }
        String type = arr[0];
        String name = null;
        if (type.equals("int")||type.equals("char")||type.equals("short")||type.equals("long")){
            name=arr[1];
        }else if (type.equals("unsigned")){
            if (arr.length!=3)
                return 0;
            type= arr[1];
            if (type.equals("int")||type.equals("char")||type.equals("short")||type.equals("long")){
                name = arr[2];
            }
        }
        if (name!=null){
            String[] arr1 = name.split("\\[");
            if (arr1.length!=2){
                return 0;
            }else if(isPhonticName(arr1[0])){
                String[] arr2 = arr1[1].split("\\]");
                if (arr2.length!=1)
                    return 0;
                if (isInteger(arr2[0])){
                    int temp = Integer.parseInt(arr2[0]);
                    if (type.equals("char"))
                        return temp;
                    if (type.equals("int"))
                        return temp*2;
                    if (type.equals("short")||type.equals("long"))
                        return temp*4;
                }
            }
        }
        return 0;
    }

    public static boolean isPhonticName(String str) {
        char[] chars=str.toCharArray();
        boolean isPhontic = false;
        for(int i = 0; i < chars.length; i++) {
            isPhontic = (chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z');
            if (!isPhontic) {
                return false;
            }
        }
        return true;
    }
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

}
