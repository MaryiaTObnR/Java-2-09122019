package Lesson_2;

import static java.util.UUID.randomUUID;

public class Main {
    private static String[][] mas = new String[4][4];
    private static Integer[][] d_mas = new Integer[4][4];
    private static Integer s = 0;
    private static Integer i, j;
    private static Integer n = 4;

    public static void Str_massive(int i0, int j0) {
        int a;
        // генерация строк из цифр
        a = (int) (Math.random() * 100);
        mas[i0][j0] = String.valueOf(a);
        // генерация строк, которые в int не преобразуются
        mas[i0][j0 + 1] = randomUUID().toString().replace("-", "");
    }

    private static boolean checkString(int i, int j) {
        try {
            d_mas[i][j] = Integer.parseInt(mas[i][j]);
        } catch (NumberFormatException e) {
            System.out.println("MyArrayDataException at: line " + i + " and column  " + j);
            return true;
        }

        return false;
    }

    public static void Transport(int i, int j) {

        d_mas[i][j] = Integer.parseInt(mas[i][j]);
        s = s + d_mas[i][j];

    }

    public static void main(String[] args) {
        System.out.println("Массив строк:");

        for (int i0 = 0; i0 <= n; i0++) {
            for (int j0 = 0; j0 <= n; j0 += 2) {
                Str_massive(i0, j0);
                try {
                    Str_massive(i0, n );
                    Str_massive(n , j0);
                } catch (Exception e) {
                    n = 4;
                    System.out.println("");
                    System.out.println("MyArraySizeException");
                }
                if (j0 < n - 1) {
                    System.out.print(" " + mas[i0][j0] + "    " + mas[i0][j0 + 1] + " ");
                } else {
                    if (j0 == n - 1) {
                        System.out.println(" " + mas[i0][j0] + "    " + mas[i0][j0 + 1] + " ");
                    }
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    checkString(i, j);
                    Transport(i, j);
                } catch (NumberFormatException e) {
                }
            }
        }
        System.out.println("Сумма цифр в массиве равна - " + s);
    }
}