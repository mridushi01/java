import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
System.out.println("welcome to simple intrest ");
System.out.println("please enter principle , time, rate ");
Scanner input = new Scanner(System.in);
double p = input.nextDouble();
        double t = input.nextDouble();
        double r= input.nextDouble();
        double si= (p*r*t)/100;
        System.out.println("simple intrest is " + si);

        }

}