package HomeWork_04;

import java.util.ArrayList;

public class First {
    public static void main(String args[]){
        int [] arr = new int[21];
        ArrayList<Integer> ranNum = new ArrayList<>();

        // fill the array with numbers from -40 to 40
        for(int i = -40; i <= 40; i++){
            ranNum.add(i);
        }

        // set variables to the lenghts of arr and ranNum
        int arrLen = arr.length;
        int n = ranNum.size();

        for(int i = 0; i < arrLen ; i ++){
            arr[i] = ranNum.get((int)(Math.random() * n));
        }

        System.out.println("random generated array with nums from -40 to 40");
        // a) print all the array
        for(int j : arr){
            System.out.print(j + " ");
        }

        // b) divisible to 5
        System.out.println("\n\nDivisible to 5:");
        for(int j : arr){
            divisibleBy(j, 5);
        }

        // c) less than module 20
        System.out.println("\n\nLess than module 20:");
        for(int j: arr){
            if(j < 20){
                System.out.print(j + " ");
            }
        }

        // d) product of odd number
        System.out.println("\n\nproduct of odd numbers:");
        int productResult = 1;
        for(int j: arr){
            if(j % 2 == 0){
                System.out.print(j + " ");
                productResult *= j;
            }
        }
        System.out.println("\n\nProduct: " +  productResult);

        // e) max even number and his index
        System.out.println("\n\nmax even number and index:");
        System.out.println(getMaxNum(arr));

        // f) new array moved by two positions
        System.out.println("\n\nnew array moved by two positions:");
        System.out.println(moveArrByTwo(arr));

    }

    public static void divisibleBy(int j, int divisible){
        if(j % divisible == 0){
            System.out.print(j + " ");
        }
    }

    public static String getMaxNum(int [] arr){
        // this very confusing pieze of code just verifies if
        // the member in the array is even and then get that value and its index
        int current = -40;
        int index = 0;
        for(int j = 0; j < arr.length ; j ++){
            if(arr[j] % 2 == 0){
                if(arr[j] > current){
                    current = arr[j];
                    index = j;
                }
            }
        }
        return "max: " + current + ", index: " + index;
    }

    public static String moveArrByTwo(int [] arr){
        int [] result = new int[arr.length];
        // we set the first two values of 'result' as the two last values of 'arr'
        result[1] = arr[arr.length - 1];
        result[0] = arr[arr.length - 2];

        // we move two steps each element expect the last two
        int steps = 2;
        for(int i = 0; i < result.length - 2; i ++){
            result[i + steps] = arr[i];
        }

        // create string to display the array
        StringBuilder str = new StringBuilder();

        for(int j: result){
            str.append(j + ",");
        }

        return str + "";
    }
}
