
import java.util.*;

public class JumpGame {
    public boolean canJump(int[] nums) {
    	for (int i = nums[0]; i >= 1; i--) {
    		if ((0+i) == nums.length-1) {
    			return true;
    		}
    		else if ((0+i) > nums.length-1) {
    			continue;
    		}
    		else {
    			int[] sublist = Arrays.copyOfRange(nums, i, nums.length-1);
    			return canJump(sublist);
    		}
    	}
    	return false;
    }

	public static void main(String[] args) {
		JumpGame jump = new JumpGame();
		int[] nums = {3, 4, 5, 6};
		int[] nums2 = {1, 1, 0, 6};

		System.out.println(jump.canJump(nums));
		System.out.println(jump.canJump(nums2));

	}
}
