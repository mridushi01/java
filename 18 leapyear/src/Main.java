import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("welcome to leap year world   ");
        System.out.println("please enter teh year ");
      int year =input.nextInt();

        if (year/4 ==0 && year/100 !=0) {

            System.out.println("ywar is leap year");
        }
        else{
            System.out.println("year is leap year");
        }

    }
}


