package string;

import java.util.*;

//两数相加
//辗转相加法：
public class AddStrings {

    public static void main(String[] args) {
       addStrings("11","123");
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder sb =new StringBuilder("");
        int i =num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while (i>=0||j>=0){
            int n1 = i >=0 ? num1.charAt(i)-'0':0; //这一句是重点，如果位数不同，其实可以试做高位为0
            int n2 = j >=0 ? num2.charAt(j)-'0':0;
            int tmp = n1+ n2+ carry;
            carry =tmp/10;
            sb.append(tmp%10);
            i--;
            j--;
        }
        if (carry==1){
            sb.append(1); //最后还需要在判断一下是否进位
        }
        return sb.reverse().toString(); //最后反转一下字符串
    }
}
