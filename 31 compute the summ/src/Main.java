import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("wlcoem to comput the sum ");

        Scanner input = new Scanner(System.in);

        System.out.println("enter the digit" );
        int num  =  input.nextInt();
        int Csum= ComputeSum(num);
        System.out.println(Csum);
    }
  public static int ComputeSum(int num){
        int sum = 0;

        while (num >= 0){
            sum += num%10;
            num/=10;


        }
        return sum;
  }

}