package list;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int[] s =new int[nums.length+1];
        for (int i=0;i<nums.length;i++){
            s[i+1] =s[i] + nums[i];
        }
        //构造前缀和
        int ans = 0;
        // map用来优化查找，key s[j] value 出现的次数
        Map<Integer,Integer> cnt = new HashMap<>();
        for (int sj:s){
            int value = cnt.getOrDefault(sj-k,0);
            ans +=value;
            cnt.merge(sj,1,Integer::sum); //cnt [sj] ++
        }
        return ans;
    }
}
