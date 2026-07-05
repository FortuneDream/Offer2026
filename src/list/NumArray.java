package list;

public class NumArray {
    private int[] s ;
    public NumArray(int[] nums) {
        s = new int[nums.length+1];
        for (int i=0;i<nums.length;i++){ //提前计算前缀和
            s[i+1] = s[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return s[right+1]-s[left];
    }
}
