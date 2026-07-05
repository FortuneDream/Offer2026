package doublepoint;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result =new ArrayList<>();
        Set<List<Integer>> set =new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int first =0;first<n-2;first++){
            int second = first +1;
            int third = n-1;
            while (second < third){
                int temp=nums[first]+nums[second]+nums[third];
                if (temp==0){
                    List<Integer> list =new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    if (!set.contains(list)){
                        set.add(list);
                        result.add(list);
                    }
                    second++;
                    third--;
                }else if (temp < 0){
                    second++;
                }else {
                    third--;
                }
            }
        }
        return result;
    }
}
