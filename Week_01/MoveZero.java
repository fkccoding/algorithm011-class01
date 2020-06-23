/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/6/23 23:14
 */
public class MoveZero {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int j = 0;
        for (int i = 0; i < l; ++i) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for (int i = j; i < l; ++i) {
            nums[i] = 0;
        }
    }
}
