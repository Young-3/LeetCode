import java.util.HashMap;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9

所以返回 [0, 1]


 * @author Young
 *
 */
public class TwoSum {
	 public int[] twoSum(int[] nums, int target) {
	        int len = nums.length;
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < len; ++i) {
	            if (map.containsKey(nums[i])) {
	                return new int[]{map.get(nums[i]), i};
	            }
	            map.put(target - nums[i], i);
	        }
	        return null;
	    }
	 
	 public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
	}
	 
		
	}


