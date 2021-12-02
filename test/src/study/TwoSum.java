package study;

public class TwoSum {
   /*
    输入：nums = [2,7,11,15], target = 9
    输出：[0,1]
    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值 target的那两个整数，并返回它们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    你可以按任意顺序返回答案。
   * */

    public static void main(String[] args) {
        int[] nums = {2,15,11,7};
        int target = 9;
        TwoSum sum = new TwoSum();
        int[] ints = sum.twoSum(nums, target);
        for (int i : ints) {
        System.out.println(i);
        }
    }
    public int[] twoSum(int nums[],int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]+nums[j]==target){
                    int[] ints = new int[2];
                     ints[0]= i;
                     ints[1]= j;
                    return ints;
                }
            }
        }
        return new int[0];
    }

    /*public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }*/
}


