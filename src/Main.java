import java.util.Scanner;

/**
 * Created by stephenboynton on 6/30/17.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] firstArray = getArray(5);

        printArray(firstArray);
        int [] secondArray = sortArray(firstArray);
        printArray(secondArray);

    }

    public static int[] getArray(int number) {
        System.out.println("Please enter " + number + " integers.");
        int[] values = new int[number];

        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortArray (int[] array) {
        int[] sort = new int[array.length];
        printArray(sort);
        for (int i = 0; i < array.length; i++) {
            sort[i] = array[i];
        }
        printArray(sort);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sort.length -1; i++) {
                if (sort[i] < sort[i + 1]) {
                    temp = sort[i];
                    sort[i] = sort[i+1];
                    sort[i+1] = temp;
                    flag = true;
                    printArray(sort);
                    System.out.println("==============");
                }
            }
        }


        return sort;
    }

    public static void printArray(int[] array) {

        for (int i = 0, len = array.length; i < len; i++) {
            System.out.println(array[i]);
        }
    }


}
