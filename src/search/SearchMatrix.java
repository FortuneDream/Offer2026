package search;

//搜索二维矩阵：看成是一个从小到大排列的一维数组，写一个二分查找
//二维矩阵坐标转化成一位数据的公式 a[i]=matrix[i/n][i%n],n=列
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int left = -1; //这个边界值我其实没太懂为什么是-1，以及为什么要用left + 1 来进行判断
        int right = row * column;
        while (left+1 < right) {
            int mid = (right + left) / 2;
            int cur = matrix[mid / column][mid % column];
            if(cur==target){
                return true;
            }
            if (cur < target) {
                left = mid;
            } else{
                right = mid;
            }
        }
        return false;
    }
}
