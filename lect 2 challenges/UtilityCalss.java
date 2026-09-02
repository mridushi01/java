import java.util.Scanner;

public class UtilityCalss {


    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome of sum of aaray and average");
        System.out.println("enetr number of array");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;

        while (i <= size) {
            System.out.println("enetr the number" + (i + 1 + ": "));
            nums[i] = input.nextInt();
            i++;
        }


        return nums;
    }
}
