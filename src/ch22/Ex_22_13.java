package ch22;

public class Ex_22_13 {

    public static void main(String[] args) {
        int n = 3; int m = 5;
        int[][] a = fill(n, m);
        output(a);
        int s = sum(a);
        System.out.println(s);
    }

    public static int[][] fill(int n, int m) {
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random()*10);
            }
        }
        return a;
    }

    public static void output(int[][] m) {
        for (int[] row: m) {
            for (int value: row)
                System.out.printf("%3d", value);
            System.out.println();
        }
    }

    public static int sum(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m[0].length; i++) {
            sum += m[0][i];
            sum += m[m.length - 1][i];
        }
        for (int i = 1; i < m.length - 1; i++) {
            sum += m[i][0];
            sum += m[i][m[0].length - 1];
        }

        return sum;
    }
}
