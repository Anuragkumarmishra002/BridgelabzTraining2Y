package practiceSet1.AssistedProblems;
import java.util.* ;
public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the temperature in celsius");
        double celsius = sc.nextDouble() ;
        double fahrenheit = (celsius * 9/5) + 32.00 ;
        System.out.printf("Fahrenheit %.2f=", fahrenheit);
    }

}
