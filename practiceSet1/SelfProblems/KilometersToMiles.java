package practiceSet1.SelfProblems;
import java.util.*  ;
public class KilometersToMiles {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter kilometers");
      double  kilometers = sc.nextDouble();
      double miles = kilometers * 0.621371 ;
      System.out.print("Miles = "+ miles);

    }
}
