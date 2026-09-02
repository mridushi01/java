import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("welcome to perimeter calculator");
     System.out.println("enter all perimeters");
     double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        System.out.println("addition of all perimetr some are " +(a+b+c+d));

    }
}