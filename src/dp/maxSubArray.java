package dp;

public class maxSubArray {

    public int maxSubArray(int[] nums){
        int ans= 0;
        int[] f = new int[nums.length];
        f[0]= nums[0];
        ans =f[0];
        //递推公式 f[i] = max(f[i-1],0) + nums[i]
        //f[i]表示以i结尾的连续数字的最大和，但是并不是全局最大的，所以需要加一个ans做额外判断
        //如果<0那肯定不是在递增，所以直接去掉
        for (int i =1 ; i<f.length;i++){
            f[i] =Math.max(f[i-1],0)+ nums[i];
            ans = Math.max(ans,f[i]);
        }
        return ans;
    }
}
