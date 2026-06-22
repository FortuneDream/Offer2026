package string;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("1010","1011"));;
    }

    public static String  addBinary(String a,String b ){
        int aLength= a.length();
        int bLength = b.length();
        int indexA = aLength-1;
        int indexB = bLength-1;
        StringBuilder sb =new StringBuilder();
        boolean carry = false;
        while (indexA >= 0 || indexB >=0){
            int numA = indexA >=0?a.charAt(indexA)-'0':0;
            int numB = indexB >=0?b.charAt(indexB)-'0':0;
            int sum = numA+numB;
            if (carry){
                sum++;
            }
            if (sum>=2){
                carry = true;
            }else {
                carry = false;
            }
            int result = sum%2;
            sb.append(String.valueOf(result));
            indexA--;
            indexB--;
        }
        if (carry){
            sb.append("1");
        }

        return sb.reverse().toString();
    }
}
