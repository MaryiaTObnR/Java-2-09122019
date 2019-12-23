package Lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class phone_book {
    private static int n = 20;
    private static int i;
    private static String p_number = "";


    public static void main(String[] args) throws IOException {
        HashMap<String, HashSet<String>> hm = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            HashSet<String> number = new HashSet<>(n);
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            String Surname = reader1.readLine();
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
            p_number = reader2.readLine();
            number.add(p_number);
            number.hashCode();
            hm.put(Surname,number);
        }

        System.out.print("Поиск номера телефона ");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        String Surname_X = reader3.readLine();
        System.out.println(Surname_X + ": ");
     for (Map.Entry<String,HashSet<String>> o:hm.entrySet()) {
        System.out.println(o.getKey() + ": " + o.getValue());
         if (o.getKey().equals(Surname_X)) {
             System.out.println(o.getValue());
         }
         System.out.println(" ");}
        }
        @Override
    public int hashCode() {
        return p_number.hashCode();
        }
    }


