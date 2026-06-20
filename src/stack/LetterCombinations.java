package stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//电话号码的字母组合。
public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        Map<String, String> numberMap = new HashMap<>();
        numberMap.put("1", "");
        numberMap.put("2", "abc");
        numberMap.put("3", "def");
        numberMap.put("4", "ghi");
        numberMap.put("5", "jkl");
        numberMap.put("6", "mno");
        numberMap.put("7", "pqrs");
        numberMap.put("8", "tuv");
        numberMap.put("9", "wxyz");
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        backTrace(result, numberMap, digits, 0, current); //这里特地传一个map
        return result;
    }

    public static void backTrace(List<String> result, Map<String, String> numberMap, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = numberMap.get(String.valueOf(digit));
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backTrace(result, numberMap, digits, index + 1, current); //回溯
            current.deleteCharAt(index);  //删除当前的index的内容
        }
    }


}
