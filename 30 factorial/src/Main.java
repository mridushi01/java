import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enetr the number for factorial");
        int num = input.nextInt();
        long  ans = fact (num);
        System.out.println( ans);
System.out.println();
        }
        public static long   fact( int num ){
 int i = 1;
  long f = 1;
  while(i<=num){
      f *=i ;
i++;
  }
        return f;


        }
    }
