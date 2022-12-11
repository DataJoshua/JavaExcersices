package Lab07_H;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println(word.toUpperCase());

        System.out.println(word.replaceAll("min", "max"));

        String wordA = word.replaceAll("1", "5")
                .replaceAll("a", "A")
                .replaceAll("f", "F")
                .replaceAll("g", "G");

        System.out.println(wordA);

        System.out.println(word.replaceAll("ku-ku", ""));


        if(word.matches("(.*)abc(.*)")){
            System.out.println("The word match abc in the index: " + word.indexOf("abc") + "\n");
        }
        else{
            String p1 = word.substring(0, word.length() / 2);
            String p2 = word.substring(word.length() / 2, word.length() - 1);

            System.out.println(p1 + "abc" +  p2);
        }
    }
}
