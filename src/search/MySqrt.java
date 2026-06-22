package search;

//计算算数平方根，二分法
public class MySqrt {
    public int mySqrt(int x){
        int result =0;
        int left =0;
        int right = x;

        while (left<=right){
            int mid =(left+right)/2;
            if ((long)mid*mid<=x){
                result =mid;
                left=mid+1;
            }else {
                right =mid -1 ;
            }
        }

        return result;
    }
}
