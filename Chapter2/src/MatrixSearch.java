import java.util.Scanner;

public class MatrixSearch {
    public static void main(String args[]){
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        Scanner sn = new Scanner(System.in);
        int target = sn.nextInt();
        boolean b = search(matrix, target);
        System.out.print(b);
    }
    static boolean search(int[][] matrix, int target){
        int j = matrix[0].length-1;
        int i = 0;
        while (matrix[i][j]!=target){
            if (matrix[i][j]>target) {
                j--;
            }else if (matrix[i][j]<target) {
                i++;
            }else if (matrix[i][j]==target) {
                return true;
            }
            if (i<0||j<0||i>=matrix[0].length||j>=matrix.length)
                return false;
        }
        return false;
    }
}
