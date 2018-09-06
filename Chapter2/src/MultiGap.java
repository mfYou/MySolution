import java.util.Arrays;

public class MultiGap {
    public static void main(String[] args) {
        int[] nums = {1,3,12,6,10};
        System.out.println(maxGap(nums));
    }

    public static int maxGap(int[] nums){
        Arrays.sort(nums);
        if (nums.length == 1) return 0;
        int max = nums[1] - nums[0];
        for (int i=1; i<nums.length; i++){
            if (nums[i]-nums[i-1] > max){
                max = nums[i] - nums[i-1];
            }
        }
        return max;
    }
}
