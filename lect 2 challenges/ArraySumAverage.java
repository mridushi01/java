import java.util.Scanner;

public class ArraySumAverage {

        public static void main(String[] args) {
            System.out.println("welcome to array and sum and average");
            int[] numarray = UtilityCalss.inputArray() ;
            long sum = sum(numarray);
            int  avg = avaerage(numarray);
            System.out.println(sum);
            System.out.println(avg);
        }
        public static long sum (int[] numarray){
long sum = 0;
int i = 0;

while(i< numarray.length){
    sum+= numarray[i];
    i++;
}
            return sum ;
        }
        public static int avaerage (int[] numarray){
            long sum = sum(numarray);

return (int) (sum/ numarray.length );

        }

}
