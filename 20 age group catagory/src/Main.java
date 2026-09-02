import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to age world");
        System.out.println("please enter your current age ");
        int age = input.nextInt();

        if(age>=60){
            System.out.println("senior citizen");
        }
        else if (age >= 20 ){
            System.out.println("adult");
        }
        else if (age >=13){
            System.out.println("teen");
        }
        else if (age >=0){
            System.out.println("child");
        }

        else {
            System.out.println("age is not applicable");
        }}
    }
