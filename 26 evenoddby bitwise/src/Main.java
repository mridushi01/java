import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to even or odd  operator");
        System.out.println("please enter the first number");
        int num1 = input.nextInt();

         if((num1 & 1) == 1){
             System.out.println("number is odd" );
         }
         else {
             System.out.println("number is even");
         }
        }
    }
