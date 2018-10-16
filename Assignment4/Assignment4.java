import java.util.Arrays;

public class Assignment4 {

    /**
     * The deadline of assignment4 is 10/12/2018 23:59 PST.
     * Please feel free to contact Zane and Amanda for any questions.
     */

    /*
     * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     * s = "leetcode" return 0.
     * s = "loveleetcode" return 2.
     */
    
    //score 2/2 
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++){
            if(s.substring(i+1).contains(s.substring(i,i+1)) || s.substring(0,i).contains(s.substring(i,i+1))){
                continue;
            }else{
                return i;
            }
        }
        return -1;
    }

    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {

        while(n>9){
            int m = n;
            int sum = 0;
            while(m>0) {
                sum += m % 10;
                m = m / 10;
            }
            n = sum;
        }
        return n;
    }

    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    //score 1.5/2  wrong answer 
    public void moveZeroes(int[] nums) {
        int count = 0;
        int[] result = new int[nums.length];
        for(int i=0; i< nums.length;i++){
            if(nums[i]!=0){
                result[count++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }

    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
    
    //score 2/2 
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			                  [4,5,6],
  			                  [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								                                 [8,5,2],
  								                                 [9,6,3] ],
     */



//score 2/2 
    public int[][] rotate(int[][] matrix) {

        int totalRowsOfRotatedMatrix = matrix[0].length; //Total columns of Original Matrix
        int totalColsOfRotatedMatrix = matrix.length; //Total rows of Original Matrix

        int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotatedMatrix[j][ (totalColsOfRotatedMatrix-1)- i] = matrix[i][j];
            }
        }
        return rotatedMatrix;


    }

    public void printMatrix(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }


public static void main(String[] Args) {
    Assignment4 A4 = new Assignment4();

    System.out.println("--------Test Case of problem1-------");
    System.out.println(A4.firstUniqChar("eeaavv"));
    System.out.println(A4.firstUniqChar("leetcode"));
    System.out.println(A4.firstUniqChar(""));
    System.out.println("--------Test Case of problem2-------");
    System.out.println(A4.addDigits(4));
    System.out.println(A4.addDigits(921));
    System.out.println("--------Test Case of problem3-------");
    int[] S = new int[]{0,11,0,3,12};
    A4.moveZeroes(S);
    System.out.println("--------Test Case of problem4-------");
    System.out.println(A4.longestPalindrome("abbac"));
    System.out.println(A4.longestPalindrome("a"));
    System.out.println("--------Test Case of problem5-------");
    int[][] M = {{1,2,3},{4,5,6},{7,8,9}};
    A4.printMatrix(A4.rotate(M));
    System.out.println("------------------------------------");
    int[][] M1 = {{1,2},{3,4},{5,6}};
    A4.printMatrix(A4.rotate(M1));

}

}

