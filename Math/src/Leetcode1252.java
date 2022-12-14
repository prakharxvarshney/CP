public class Leetcode1252 {
    public static int oddCells(int m, int n, int[][] indexes) {
        int [][] matrix=new int[m][n];
        for(int i=0;i< indexes.length;i++){
            int row=indexes[i][0];
            int col=indexes[i][1];
            for(int j=0;j<n;j++){
                matrix[row][j]++;
            }
            for(int k=0;k<m;k++){
                matrix[k][col]++;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]%2!=0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int [][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(n,m,indices));
    }
}
