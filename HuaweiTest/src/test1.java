

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String args[]){
        List<String[]> list = new ArrayList<>();
        Scanner sn = new Scanner(System.in);
        int payload_len = sn.nextInt();
        int len = sn.nextInt();
        String next = sn.nextLine();
        next = sn.nextLine();
        while (!next.equals("end")){
            list.add(next.split(","));
            next=sn.nextLine();
        }
        for (int i=0; i<list.size()-1; i++){
            System.out.println(list.get(i)[0]+","+list.get(i)[1]);
        }
        int num = Integer.valueOf(list.get(list.size()-1)[1])+len;
        if (num<=payload_len){
            System.out.println(list.get(list.size()-1)[0]+","+num);
        }else {
            System.out.println(list.get(list.size()-1)[0]+","+list.get(list.size()-1)[1]);
            System.out.println("0,"+len);
        }
    }
}
