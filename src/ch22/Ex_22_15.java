package ch22;

import java.util.Arrays;

public class Ex_22_15 {
    public static void main(String[] args) {
        int n = 5, m = 7;
        int[][] a = new int[n][m];
        int k = (int) (Math.random() * a.length);
        System.out.println("Random number between 0 and " + (a.length - 1) + ": " + k);
        a = build(n, m);
        output(a);
        int[] b = evenArr(a, k);
        System.out.println(b.length);
        System.out.println(Arrays.toString(b));
    }

    public static int[] evenArr (int[][] ar, int k) {
        int count = 0;
        for (int j = 0; j < ar[0].length; j++)
            if (ar[k][j] % 2 == 0)
                count++;
        int[] b = new int[count];
        count = 0;
        for (int j = 0; j < ar[0].length; j++)
            if (ar[k][j] % 2 == 0) {
                b[count] = ar[k][j];
                count++;
            }



        return b;
    }

    public static void output (int[][] a) {
        for (int[] row: a) {
            for (int value: row)
                System.out.printf("%2d", value);
            System.out.println();
        }
    }

    public static int[][] build(int n, int m) {
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = (int) (Math.random() * 10);
        return a;
    }
}
