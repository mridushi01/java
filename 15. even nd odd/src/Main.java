import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to even and odd programme" );
        Scanner input = new Scanner(System.in);
        System.out.println("enetr the digit ");
        int num  = input.nextInt();
      if(num/2==0){
          System.out.println("number is even ");
      }
else{
    System.out.println("number is odd");
      }

        }
    }
