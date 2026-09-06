package practiceSet1.SelfProblems;
import java.util.* ;
public class PerimeterOfRectangle {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        double length = sc.nextDouble() ;
        System.out.println("Enter width");
        double width = sc.nextDouble();
        double perimeter = 2 * ( length + width);
        System.out.printf("Perimeter of rectangle is =%.2f ",perimeter);
    }

}
