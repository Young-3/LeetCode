import java.util.HashMap;

/**
 * ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������

����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�

ʾ��:

���� nums = [2, 7, 11, 15], target = 9

��Ϊ nums[0] + nums[1] = 2 + 7 = 9

���Է��� [0, 1]


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


