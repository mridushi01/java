import java.sql.SQLOutput;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("welcoem to driving licensence portal");
        System.out.println("please enter ypur age ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age>=18){
            System.out.println("your are eligable for driving license ");

        }
        else {
            System.out.println("your are not eligable" );
        }

        }
    }
