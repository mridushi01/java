import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("welcoem to bus discount center enquiry ");
System.out.println("please your age ");
int age = input.nextInt();
System.out.println("are you female");
boolean female = input.nextBoolean();
if(age<5){
    System.out.println("you got 75% discount");
}
else if(female ){
    System.out.println("you got 50 %discount");
}
else if (age>60&&!female ){
    System.out.println("you got 25% discount");
}
else{
    System.out.println("you got no discount");
}


    }
}
