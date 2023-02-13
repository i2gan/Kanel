package ch22;

public class Ex_22_14 {
    public static void main(String[] args) {
        int n = 3, m = 4;
        int[][] a = fill(n, m);
        output(a);
        int[] x = sums(a);
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i] + " ");
    }

    public static int[] sums (int[][] ar) {
        int[] x = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            for (int j = 0; j < ar[0].length; j++)
                sum += ar[i][j];
            x[i] = sum;
        }
        return x;
    }

    public static void output(int[][] ar) {
        for (int[] row: ar) {
            for (int value: row)
                System.out.printf("%2d", value);
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] fill(int n, int m) {
        int[][] ar = new int[n][m];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                ar[i][j] = (int) (Math.random() * 10);
        return ar;
    }
}
