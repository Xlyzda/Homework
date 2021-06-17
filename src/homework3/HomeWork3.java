package homework3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String args[]) {
        one();
        two();
        three();
        four();
        System.out.println(Arrays.toString(five(5, 0)));
        six();
        int[] arr = {1, 3, 5, 7};
        System.out.println(seven(arr));
        eight(2, arr);
    }

    public static void one() {
        int[] one = {0, 1, 1, 0, 1, 1, 1, 0, 0};
        for (int i = 0; i < one.length; i++)
            switch (one[i]) {
                case 0:
                    one[i] = 1;
                    break;
                case 1:
                    one[i] = 0;
                    break;
            }
        System.out.println(Arrays.toString(one));
    }

    public static void two() {
        int[] cent = new int[100];
        for (int i = 0; i < cent.length; i++) cent[i] = i + 1;
        System.out.println(Arrays.toString(cent));
    }

    public static void three() {
        int[] two = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < two.length; i++) if (two[i] < 6) two[i] *= 2;
        System.out.println(Arrays.toString(two));
    }

    public static void four() {
        int[][] tabl = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j || (i == 9 - j))
                    tabl[i][j] = 1;
                System.out.print(tabl[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] five(int len, int initialValue) {
        int[] per = new int[len];
        for (int i = 0; i < len; i++)
            per[i] = initialValue;
        return per;
    }

    public static void six() {
        int[] mm = {1, 2, 8, 5, 4, 8};
        int max = mm[0];
        int min = mm[0];
        for (int i = 0; i < mm.length; i++) {
            if (mm[i] > max) max = mm[i];
            if (mm[i] < min) min = mm[i];
        }
        System.out.println(max + " максимальное число");
        System.out.println(min + " минимальное число");
    }

    public static boolean seven(int[] arr) {
        int sum1 = 0, sum2 = 0;
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[arr.length - 1 - i];
            for (int j = 0; j < arr.length - 1 - i; j++)
                sum1 += arr[j];
            if (sum1 == sum2) result = true;
        }
        return result;
    }

    public static void eight(int n, int[] arr) {
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                int tmp = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = tmp;
            }
        } else {
            for (int j = 0; j > n; j--) {
                int tmp = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}