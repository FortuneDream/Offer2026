package slidingwindow;


import java.util.HashSet;
import java.util.Set;

class LengthOfLongestSubstring {
    //滑动窗口
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set =new HashSet<>();
        int max= 0;
        int left=0,right=0;
        while (right<s.length()){
          char ch=  s.charAt(right);
            while (set.contains(ch)){ //这里是while循环
                set.remove(s.charAt(left)); //注意这里不能移除ch
                left++;
            }
            set.add(ch);
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}