package hash;

import java.util.HashMap;
import java.util.Map;

//两数之和。利用hashmap target-num = hash key去重
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map =new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int num = nums[i];
            if (map.containsKey(target-num)){
                int[] result =new int[2];
                result[0]=map.get(target-num);
                result[1]=i;
                return result;
            }
            map.put(num,i);
        }
        return new int[2];
    }
}
