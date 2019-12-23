package Lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Dublicat {

    private static String word;
    private static int s, i, n = 20;

    private static void Words(List words, String word) {
        words.add(word);
    }

    private static void Unique(List words) {
        s = 1;
        while ((words.indexOf(word) != words.lastIndexOf(word))) {
            if (words.lastIndexOf(word) != -1) {
                words.remove(words.lastIndexOf(word));
            }
            s = s + 1;
        }
        System.out.println("Слово " + word + " встречается " + s + " раз");
    }

    public static void main(String[] args) throws IOException {
        List<String> words = new ArrayList<String>();
        ((ArrayList<String>) words).ensureCapacity(n);
        for (int i = 0; i < n; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String word = reader.readLine();
            Words(words, word);
        }
        System.out.println("Уникальные слова: ");
        while (i < words.size()){
        word = words.get(i);Unique(words);
        i++;
        }
        System.out.println(words);
    }
}

