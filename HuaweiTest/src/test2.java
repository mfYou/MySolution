import java.util.Scanner;

public class test2 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i=0; i<nums.length; i++){
            nums[i] = sn.nextInt();
        }
//        int y = nums[0];
//        int x = nums[0];
//        int z = nums[0];
//        for (int i=0; i<nums.length; i++){
//            if (Math.abs(nums[i])>y){
//                y = nums[i];
//            }
//            if (Math.abs(nums[i])<x){
//                x=nums[i];
//            }
//            if (nums[i]<z){
//                z=nums[i];
//            }
//        }
        int count = getResult(nums[0], nums[1], nums[2]);
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                for (int k = j+1; k < nums.length; k++) {
                    int temp1 = getResult(nums[i],nums[j],nums[k]);
                    int temp2 = getResult(nums[i], nums[k], nums[k]);
                    int temp3 = getResult(nums[j], nums[i], nums[k]);
                    int temp4 = getResult(nums[j],nums[k],nums[i]);
                    int temp5 = getResult(nums[k], nums[i], nums[j]);
                    int temp6 = getResult(nums[k], nums[j], nums[i]);
                    if (temp1<count)
                        count=temp1;
                    if (temp2<count)
                        count=temp2;
                    if (temp3<count)
                        count=temp3;
                    if (temp4<count)
                        count=temp4;
                    if (temp5<count)
                        count=temp5;
                    if (temp6<count)
                        count=temp6;
                }
            }
        }
        System.out.print(count);
    }

    private static int getResult(int x, int y, int z){
        return x*x+x*y-y*y+z;
    }
}
