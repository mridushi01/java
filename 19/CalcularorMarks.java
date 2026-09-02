import java.util.Scanner;


public class CalcularorMarks{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to marks calculator");
        System.out.println("please enter the marks");
        int marks = input.nextInt();

        if(marks>90){
            System.out.println("grade is A");
        }
        else if (marks >60){
            System.out.println("grade is C");
        }
        else if (marks >75){
            System.out.println("grade is b");
        }
        else if (marks >30){
            System.out.println("grade is d");
        }
        else if (marks <30){
            System.out.println("grade is f");
        }
        else {
            System.out.println("not applicable");
        }
    }


}
