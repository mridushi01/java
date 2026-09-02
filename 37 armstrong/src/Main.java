import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("welcoem to armstorng");
        System.out.println("enetr the digit");
        int num = input.nextInt();
boolean isArm = isArm(num);
if (isArm){
    System.out.println("number is armstrong");
}
else{{
    System.out.println("number is not armstrong");
}
}}

    public static boolean isArm(int num){
 int digit = 0;
 while(num>0){
     digit ++;
     num/=10;
 }
        return digit;

    }

}