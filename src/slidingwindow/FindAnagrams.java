package slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//找到字符串中所有字母异位词
//定长滑动窗口  + 统计次数确定是否正确index
public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int[] cntP = new int[26];
        for (int i = 0; i < p.length(); i++) {
            cntP[p.charAt(i)-'a']++;
        }
        int[] cntS = new int[26];
        List<Integer> result = new ArrayList<>();
        for (int right = 0; right < s.length(); right++) {
            cntS[s.charAt(right)-'a']++;
            int left = right - p.length() + 1;
            if (left < 0) {
                continue;
            }
            if (Arrays.equals(cntS,cntP)){
                result.add(left);
            }
            cntS[s.charAt(left)-'a']--;
        }
        return result;
    }
}
