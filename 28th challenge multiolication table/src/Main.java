import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
greetings();
table();
    }

    public static int  table (){
        System.out.println("plaese enetr the num for multiplication");
        Scanner input  = new Scanner(System.in);
        int num = input.nextInt();
        int i = 0;

        while( i<=10){
          int t=  num * i ;

          System.out.println( num + "*" + i + "="+ t);
          i++;
        }
           return 0;
    }
    public static void greetings(){
        System.out.println("welcome to multiplicayion table ");
    }
}