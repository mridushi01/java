import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to GCD");
        System.out.println("enetr the first number ");
        int  num1 = input.nextInt();
        System.out.println("enter the second number ");
        int num2 = input.nextInt();
        int L =GCD(num1 ,num2) ;

        System.out.println("LCM is " +  L);
    }
    public static int GCD(int num1 , int num2 ){
        int i = 1;
        while (i>= num1){
            int f = num1 *i;
            if ( f%num2 == 0)
                return f;

        }
        i++;

return 0;
    }
}