import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner input  = new Scanner(System.in);
        System.out.println("welcome to greatest number  ");
System.out.println("please enter first number ");
int num1 = input.nextInt();
        System.out.println("please enter 2nd number ");
        int num2 = input.nextInt();
        System.out.println("please enter f3rd number ");
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3) {

            System.out.println("greatest number is :" + num1);
        }

            else if (num2>num1&&num2>num3){
                System.out.println("greateset number is :"+num2);
            }
            else{
                System.out.println("the gratest number is :" +num3);
        }

        }
    }
