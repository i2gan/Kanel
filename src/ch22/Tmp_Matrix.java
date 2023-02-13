package ch22;

public class Tmp_Matrix {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = (int)(Math.random()*10);

        for (int[] row: a) {
            for (int value: row)
                System.out.print(value + " ");
            System.out.println();
        }
    }
}
