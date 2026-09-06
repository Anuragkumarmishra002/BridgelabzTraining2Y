package practiceSet1.AssistedProblems;
import java.util.* ;
public class VolumeOfCylinder {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();
        double volume =  3.14 * (radius * radius) * height ;
        System.out.printf("Volume = %.2f",volume);
    }

}
