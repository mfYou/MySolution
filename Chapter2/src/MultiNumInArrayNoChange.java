import java.util.Scanner;

public class MultiNumInArrayNoChange {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int len = sn.nextInt();
        int[] nums = new int[len];
        for (int i=0; i<len;i++){
            nums[i]=sn.nextInt();
        }
        int start = 1;
        int end = len-1;
        while (end>=start){
            int mid = (end+start)/2;
            int count = countNum(nums, start, mid);
            if (start == end){
                if (count>1) {
                    System.out.print(start);
                    return;
                }else
                    return;

            }
            if (count>(mid-start+1))
                end=mid;
            else start=mid;
        }
    }

    static int countNum(int nums[], int start, int end){
        int count =0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]<=end&&nums[i]>=start)
                count++;
        }
        return count;
    }
}
