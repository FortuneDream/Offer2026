package string;

import java.util.ArrayList;

//反转字符串中的单词
//双指针 + 处理空格
public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("hello world"));
    }

    public static String reverseWords(String s) {
        int m = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (m>=0&& s.charAt(m) == ' ') {
            m--;
        }
        int n = m; //终点
        while (m >= 0) {
            while (m >= 0 && s.charAt(m) != ' ') {
                m--;
            }
            sb.append(s.substring(m+1, n+1)).append(" "); //注意这里的坐标范围，Java和其他语言不太一样，其实也可以用for循环来做
            while (m >= 0 && s.charAt(m) == ' ') {
                m--;
            }
            n = m;
        }

        return sb.substring(0, sb.length() - 1);

    }
}
