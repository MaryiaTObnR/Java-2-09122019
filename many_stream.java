package Lesson_5;

public class many_stream {
    static final int size = 10000;
    static final int h = size / 2;
   static float [] arr = new float[size];
    private static void Single_stream(float[] arr) {
        //Преобразование массива
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0/4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - 5);
    }
    private static void Double_stream(float[] arr) {
float[] a1 = new float[h];
float[] a2 = new float[h];
long b1 = System.currentTimeMillis();
System.arraycopy(arr,0,a1, 0,h );
System.arraycopy(arr,h, a2, 0, h);
long b2 = System.currentTimeMillis();
//Разбиение массива на два
        for (int i = 0; i < h; i++) {
            a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0/4f + i / 2));
        }
        long b3 = System.currentTimeMillis();
        for (int i = 0; i < h; i++) {
            a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0/4f + i / 2));
        }
        long b4 = System.currentTimeMillis();
        // Склейка массива
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long b5 = System.currentTimeMillis();
        System.out.println(b5-b1);
    }
    public static void main(String[] args) {
        // Исходный массив
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        Single_stream(many_stream.arr);
        Double_stream(many_stream.arr);
    }
}

