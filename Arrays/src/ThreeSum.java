import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,6,-7};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list.toString());
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        int len = nums.length;
        int index = 0;
        for(int i=0; i<len-2; i++){
            if(i==0 || (i>0&&nums[i]!=nums[i-1])){
                int low = i+1;
                int high = len-1;
                int target = 0-nums[i];
                while(low<high){
                    if(nums[low]+nums[high]==target){
                        List<Integer> temp = new ArrayList();
                        temp.add(nums[i]);
                        temp.add(nums[low]);
                        temp.add(nums[high]);
                        list.add(temp);
                        while(low<high && nums[low+1]==nums[low]){
                            low++;
                        }
                        while(low<high && nums[high-1]==nums[high]){
                            high--;
                        }
                        low++;
                        high--;
                    }else if(nums[low]+nums[high]<target){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        return list;
    }
}
