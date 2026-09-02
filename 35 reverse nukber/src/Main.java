import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the digit");
        int num = input.nextInt();
        int resverse =reverse(num);
        System.out.println(resverse);
    }
    public static int reverse(int num){
        int newNum =0;
        while(num>0){
            int digit = num%10;
            newNum = newNum *10 + digit;
            num/= 10;
        }


      return newNum ;
    }



}