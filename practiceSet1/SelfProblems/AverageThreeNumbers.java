package practiceSet1.SelfProblems;
import java.util.* ;
public class AverageThreeNumbers {
   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number 1");
       double num1 = sc.nextDouble();
       System.out.println("Enter number 2");
       double num2 = sc.nextDouble();
       System.out.println("Enter number 3");
       double num3 = sc.nextDouble();
       double result = (num1 + num1 + num3 )/ 3;
       System.out.printf("Average = %.2f", result);
    }
}
