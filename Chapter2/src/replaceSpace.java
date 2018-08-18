import java.util.Scanner;

public class replaceSpace {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        String str = sn.nextLine();
        StringBuffer sb = new StringBuffer(str);
        String strNew = replaceSpace(sb);
        System.out.print(strNew);
    }

    static String replaceSpace(StringBuffer sb){
        int oldLen = sb.length();
        for (int i=0; i<oldLen; i++){
            if (sb.charAt(i) == ' '){
                sb.append("  ");
            }
        }
        int i = oldLen-1;
        int j = sb.length()-1;
        while (i>=0&&j>i){
            char c = sb.charAt(i--);
            if (c==' '){
                sb.setCharAt(j--, '0');
                sb.setCharAt(j--, '2');
                sb.setCharAt(j--, '%');
            }else {
                sb.setCharAt(j--, c);
            }
        }
        return sb.toString();
    }
}
