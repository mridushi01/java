import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.println("welcone to prime number world ");
        System.out.println("enter the number to check weather it is prime or not ");
        int num = input.nextInt();;
     boolean prime = isPrime(num);
        System.out.println(prime);
    }
    public static boolean isPrime(int num){
        int i =2 ;
        while (i < num){
            if(num % i == 0){
                return false;


            }
            i++;

        }



        return true ;
    }
}