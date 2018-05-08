import java.util.Arrays;

/**
 * 把数组后k个转到最前面
 */
public class RotateArray {
    public static void main(String args[]){
        int[] array = {1,2,3,4,5,6,7,8};
        int k=3;
        rotate(array, k);
    }

    private static void rotate(int[] nums, int k){
        while(k>nums.length){
            k-=nums.length;
        }
        int[] array = new int[k];
        for (int i=1; i<=k; i++){
            array[k-i] = nums[nums.length-i];
        }
        for (int i=nums.length-1; i>=k; i--){
            nums[i] = nums[i-k];
        }
        for (int i=k-1; i>=0; i--){
            nums[i] = array[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
