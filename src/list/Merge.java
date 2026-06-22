package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//合并区间
//先排序，然后获取当前已经排序的最后一个区间作为对照区间。主要更新这个对照区间的右值
public class Merge {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0]; //小于0是正序
            }
        });
        List<int[]> result =new ArrayList<>();
        for (int[] interval : intervals){
            int size = result.size();
            int left =interval[0];
            if(size>0&&left <=result.get(size-1)[1]){
                int[] last =result.get(size-1);
                last[1] = Math.max(interval[1],last[1]); //只需要更新右值即可
            }else {
                result.add(interval); //第一个0 或者 没有交叉的区间。
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
