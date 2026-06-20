package string;

import java.util.ArrayList;
import java.util.List;

//Z字形变换
//利用多个数组来保存打印结果
public class Convert {
    public String convert(String s, int numRows) {
        if(numRows < 2) return s; //特殊情况
        List<StringBuilder> list =new ArrayList<>();
        for (int i =0;i<numRows;i++){
            list.add(new StringBuilder());
        }
        int index = 0;
        int flag = -1;
        for (char c : s.toCharArray()){
            list.get(index).append(c);
            if (index==0||index == numRows-1){ //在第一行和最后一行变换
                flag=-flag; //index变化的方向取反
            }
            index +=flag;
        }
        StringBuilder result =new StringBuilder();
        for (int i =0;i<list.size();i++){
            result.append(list.get(i).toString());
        }

        return result.toString();
    }
}
