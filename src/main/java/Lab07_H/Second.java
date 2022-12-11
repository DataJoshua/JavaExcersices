package Lab07_H;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        // get user input and show the number of words given
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] words = input.split(" ");
        int len = words.length;

        System.out.println("your phrase has : " + len + " words");

        int count = 0;
        for(String s: words){
            if("red".equalsIgnoreCase(s)){
                count++;
            }
        }

        System.out.println("The word read is repeated : " + count + " times");

        words[2] = "green";

        for(String s: words){
            System.out.print(", " +s);
        }

        System.out.println("");

        // union of the words

        String newString = String.join(", ", words);

        System.out.println(newString);



    }
}
