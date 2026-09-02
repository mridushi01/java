import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.println("welcome to gcd ");

        System.out.println("enetr the first number ");
        int num = input.nextInt();
        System.out.println("enetr the second number ");
        int num2= input.nextInt();
        int GCD =GCD(num,num2);
        System.out.println( GCD);

    }
    public static int GCD (int num1 , int num2){
        int gcd =1;
int i = 2;
int least = least(num1 ,num2 );
while(i<=least){
    if(num1 % i ==0 && num2 % i==0){
        gcd = i;
        System.out.println();
    }
        i++;

}
        return gcd;
    }
    public static int least( int num1 , int num2 ){
        if (num1<num2){
            return num1;
        }
        else {
            return num2 ;

        }
    }



}