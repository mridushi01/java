import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to fibnonacci series");
        System.out.println("enter the digit ");
int num = input.nextInt();
fibo(num);
    }
    public static void fibo(int num) {

        if (num == 0) {
            System.out.println("0");
        }

        int first = 0;
        int second = 1;
        System.out.println("1");
        while (first + second <= num) {

            int third = first + second;
            System.out.print(third + "");

            first = second;
            second = third;


        }


    }
}