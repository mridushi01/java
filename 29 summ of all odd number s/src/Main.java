import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
greet();
System.out.println("please enetr the num");
int num = input.nextInt();
sum(num);
System.out.println();


    }
    public static void greet(){
        Scanner input = new Scanner(System.in);
        System.out.println( "hello , welcome to world of odd numbers");
        int num = input.nextInt();
        int sum = sum(num);
        System.out.println(sum);
    }
    public static int sum(int num) {


        int i = 1;
        int sum = 0;
        while (num >= i) {
            sum += i;
            i += 2;


        }
        return sum;
    }

}