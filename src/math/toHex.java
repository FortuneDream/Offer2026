package math;

public class toHex {
    public static void main(String[] args) {
        System.out.println(toHex(16));
    }

    public static String toHex(int num){
        if (num == 0) return "0";
        String s = "0123456789abcdef";
        StringBuilder sb =new StringBuilder();
        long current = num;
        if (num < 0){
            current += (long) Math.pow(2,32);
        }
        while (current>0){
            int mode = (int) (current % 16);
            sb.append(s.charAt(mode));
            current/=16;
        }
        return sb.reverse().toString();
    }
}
