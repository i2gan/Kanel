package ch22;

public class Ex_22_6 {
    public static void main(String[] args) {
        int[][] m = new int[3][4];
        fill(m);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.printf("%3d", m[i][j]);
            System.out.println();
        }
        System.out.println(7 % 10);
    }

    public static int[][] fill(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = 1;
        }
        return a;
    }
}
