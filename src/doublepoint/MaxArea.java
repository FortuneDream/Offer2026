package doublepoint;

//盛最多水的容器
//双指针，每次尝试的面积 = 最短的木板高度 * 当前底部宽度，并更新最大值。
//同时移动最短的木板，
public class MaxArea {

    public static void main(String[] args) {
       System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while (left < right) {
           int temp = Math.min(height[left],height[right]) * (right-left);
           area=Math.max(area,temp);
            if (height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return area;
    }
}
