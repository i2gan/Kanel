package ch22;

public class Ex_22_11 {
    public static void main(String[] args) {
        int n = 5; int m = 3;
        int[][] arr = new int[n][m];
        arr = build(n, m);
        output(arr);
        int k = 3;
        int s = sumK(arr, k);
        System.out.println(s);
        System.out.println();
        sumSt(arr);
    }

    public static int[][] build(int a, int b) {
        int[][] m = new int[a][b];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                m[i][j] = (int) (Math.random() * 10);
        return m;
    }

    public static void output(int[][] m) {
        for (int[] row: m) {
            for (int value: row)
                System.out.printf("%3d", value);
            System.out.println();
        }
    }

    public static int sumK(int[][] m, int k) {
        int sum = 0;
        for (int i = 0; i < m[0].length; i++)
            sum += m[k][i];
        return sum;
    }

    public static void sumSt(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int s = 0;
            s = sumK(m, i);
            System.out.println(s);
        }
    }
}
