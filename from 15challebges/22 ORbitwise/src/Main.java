
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to or bitwise operator");
        System.out.println("please enter the first number");
        int num1 = input.nextInt();
        System.out.println("please enter the second number ");
                int num2 = input.nextInt();
                 int result =  num1 | num2;
             System.out.println("result is " +result);
        }
    }
