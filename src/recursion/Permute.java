package recursion;

import java.util.ArrayList;
import java.util.List;

//全排列
//深搜 +标记已经添加的数字 + 移除标记
//返回的时候一定要new 一个List，否则会引用到一个空的List
public class Permute {

    public static void main(String[] args) {
        permute(new int[]{1,2,3});
    }

    public static List<List<Integer>> permute(int[] nums) {
        boolean[] flags= new boolean[nums.length];
        List<List<Integer>> result =new ArrayList<>();
        dfs(result,flags,new ArrayList<>(),nums);
        return result;
    }

    public static void dfs(List<List<Integer>> result,boolean[] flags,List<Integer> curs,int[] nums){
        if (curs.size() == nums.length){
            result.add(new ArrayList<>(curs)); // 这里一定要new 一个
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!flags[i]){
                flags[i] = true; //标记添加
                curs.add(nums[i]);
                dfs(result,flags,curs,nums);
                flags[i] =false; //清除标记
                curs.remove(curs.size()-1);
            }
        }
    }


}
