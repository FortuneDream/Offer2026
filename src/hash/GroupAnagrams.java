package hash;

import java.util.*;

//字母异位词，---排序 + HashMap
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String c = strs[i];
            char[] chars =c.toCharArray();
            Arrays.sort(chars);
            String str= String.valueOf(chars);
            if (map.containsKey(str)){
                map.get(str).add(c);
            }else {
                ArrayList<String> list =new ArrayList<>();
                list.add(c);
                map.put(str,list);
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
