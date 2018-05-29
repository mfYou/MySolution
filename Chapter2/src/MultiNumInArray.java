import java.util.Scanner;

public class MultiNumInArray {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int k = sn.nextInt();
        int[] nums  = new int[k];
        for (int j=0; j<k; j++){
            nums[j]=sn.nextInt();
        }
        for (int i=0; i<nums.length; i++){
            while (nums[i]!=i){
                if (nums[i]==nums[nums[i]]){
                    System.out.print(nums[i]);
                    return;
                }
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
    }
}
