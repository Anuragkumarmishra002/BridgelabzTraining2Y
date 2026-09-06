package practiceSet1.SelfProblems;
import java.util.* ;
public class SimpleInterest {
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in) ;
        System.out.println("Enter the principal amount");
        double principal = sc.nextDouble();
        System.out.println("Enter rate");
        double rate = sc.nextDouble();
        System.out.println("Enter time");
        double time = sc.nextDouble() ;
        double si = (principal * rate * time) / 100 ;
        System.out.printf("Simple Interesr =%.2f",si);
    }

}
