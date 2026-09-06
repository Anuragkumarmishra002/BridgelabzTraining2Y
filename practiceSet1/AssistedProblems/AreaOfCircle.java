package practiceSet1.AssistedProblems;
import java.util.* ;
public class AreaOfCircle {
    public  static void  main(String [] args){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();
        double π = 3.14 ;
        double area =  π * (radius * radius);
        System.out.printf("Area = %.2f",area);
    }

}
