package Assignment5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraCredit {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;      //# of rows in matrix
        int n = matrix[0].length;   //# of columns in matrix
        int t = 0;                  //index of top-most row
        int b = m - 1;                //index of bottom-most row
        int l = 0;                  //index of left-most column
        int r = n - 1;                //index of right-most column
        int dir = 0;                //direction: 0 left to right; 1 top to bottom
        //           2 right to left; 3 bottom to top
        List<Integer> result = new ArrayList<>();

        while (l <= r && t <= b) {
            if (dir == 0) {
                for (int i = l; i <= r; i++) {
                    result.add(matrix[t][i]);
                }
                t++;
            } else if (dir == 1) {
                for (int i = t; i <= b; i++) {
                    result.add(matrix[i][r]);
                }
                r--;
            } else if (dir == 2) {
                for (int i = r; i >= l; i--) {
                    result.add(matrix[b][i]);
                }
                b--;
            } else {
                for (int i = b; i >= t; i--) {
                    result.add(matrix[i][l]);
                }
                l++;
            }
            dir = (dir + 1) % 4;
        }
        return result;
    }


    public static void main(String[] Args) {

        ExtraCredit E = new ExtraCredit();
        int[][] M = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(E.spiralOrder(M));

        }
}
