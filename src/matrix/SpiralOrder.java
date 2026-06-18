package matrix;

import java.util.ArrayList;
import java.util.List;

//螺旋矩阵
//解法：收缩边界
//这里的判断条件是总数小于n*m，且每次都需要判断一次
public class SpiralOrder {

    public static void main(String[] args) {
        int[][] matrix =new int[3][3];
        for (int i=0;i<3;i++){
            matrix[0][i]=i+1;
        }
        for (int i=0;i<3;i++){
            matrix[1][i]=i+1;
        }
        for (int i=0;i<3;i++){
            matrix[2][i]=i+1;
        }
        spiralOrder(matrix);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int n =matrix.length;
        int m = matrix[0].length;
        int left = 0, top = 0, right = m-1, bottom = n-1;
        List<Integer> result = new ArrayList<>();
        while (result.size()< n*m) {
            for (int i = left; i <= right&&result.size()<(n*m); i++) {
                int cur = matrix[top][i];
                result.add(cur);
            }
            top++;
            for (int j = top; j <= bottom&&result.size()<(n*m); j++) {
                int cur = matrix[j][right];
                result.add(cur);
            }
            right--;
            for (int k = right; k >= left&&result.size()<(n*m); k--) {
                int cur = matrix[bottom][k];
                result.add(cur);
            }
            bottom--;
            for (int z = bottom; z >= top&&result.size()<(n*m); z--) {
                int cur = matrix[z][left];
                result.add(cur);
            }
            left++;
        }
        return result;
    }
}
