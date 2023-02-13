package ch22;

public class Ex_22_5 {
    public static void main(String[] args) {
        int[][] a = fill(6, 14, 30, 125);
        output(a);
    }

    public static int[][] fill(int row, int col, int min, int max)
    {
        int[][] m = new int[row][col];
        for (int i = 0; i < row; i ++) {
            for (int j = 0; j < col; j ++) {
                m[i][j] = min + (int)((max - min + 1) * Math.random());
            }
        }
        return m;
    }

    public static void output(int[][] m) {
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[0].length; j++)
            {
                System.out.printf("%4d", m[i][j]);
            }
            System.out.println();
        }
    }
}
