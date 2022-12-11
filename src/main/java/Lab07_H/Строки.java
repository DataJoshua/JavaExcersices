package Lab07_H;

public class Строки {
    public static void main(String[] args) {
        String mainInput = "123abc-S-s-+++SSSaaaAAAssss5678";

        int counts = 0;  int countS = 0;  int countDigit = 0; int countLetter = 0;

        char [] input = mainInput.toCharArray();

        for(char c: input){
            switch (c){
                case 's': counts++;
                break;
                case 'S': countS++;
                break;
            }
            if(Character.isDigit(c)){
                countDigit++;
            }
            else if (Character.isLetter(c)){
                String letter = String.valueOf(c);
                String upCase = letter.toUpperCase();
                if(letter == upCase){
                    countLetter++;
                }
            }
        }

        System.out.println("Count of letter s");
        System.out.println(counts);

        System.out.println("Count of letters S");
        System.out.println(countS);

        System.out.println("count both s and S");
        System.out.println(countS + counts);

        System.out.println("Count letters");
        System.out.println(countLetter);

        System.out.println("Count Digits");
        System.out.println(countDigit);
    }
}
