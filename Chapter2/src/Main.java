import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        List<Stuff> stuffs = new ArrayList<>();
        while (sn.hasNextLine()){
            String[] input = sn.nextLine().trim().split(" ");
            char[] name = input[0].toCharArray();
            Stuff stuff = new Stuff(name, Integer.parseInt(input[1]));
            stuffs.add(stuff);
        }
        int m =  0;
        int n = 1;
        float max = 0;
        if (stuffs.size()>1){
            for (int i = 0; i<stuffs.size(); i++){
                for (int j =i+1; j<stuffs.size(); j++){
                    if (stuffs.get(i).getSimilar(stuffs.get(j))>max){
                        m = i;
                        n = j;
                        max = stuffs.get(i).getSimilar(stuffs.get(j));
                    }
                }
            }
        }
        String str1 = new String(stuffs.get(m).name);
        String str2 = new String(stuffs.get(n).name);
        System.out.println(str1+" "+stuffs.get(m).popular);
        System.out.println(str2+" "+stuffs.get(n).popular);
    }
}

class Stuff{
    char[] name;
    int popular;

    public Stuff(char[] name, int popular){
        this.name = name;
        this.popular = popular;
    }

    public float getSimilar(Stuff stuff){
        float total = stuff.name.length + name.length;
        float n = 0;
        for (int i =0; i<name.length; i++){
            for (int j = 0; j<stuff.name.length; j++){
                if (name[i]==stuff.name[j]){
                    n+=1;
                }
            }
        }
        return n/total;
    }
}