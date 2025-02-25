import java.util.Scanner;

public class Quadratic {

       public static double[] solve(double a, double b, double c) {
              double discriminant = (b * b - 4 * a * c);
              if (discriminant > 0) {
                     double[] roots = new double[2];
                     roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
                     roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
                     return roots;
               } else if (discriminant < 0) {
       
                     return null;
              }
              return null;
       }

       public static void main(String[] args) {

              Scanner input = new Scanner(System.in);

              int a, b , c ;

              System.out.print("Enter the value for a as an integer: ");

              a = input.nextInt();

              System.out.print("Enter the value for b as an integer: ");

              b = input.nextInt();

              System.out.print("Enter the value for c as an integer: ");

              c = input.nextInt();

              double[] roots = solve(a, b, c);

              if (roots == null) {
                     System.out.println("This equation does not have REAL roots.");
              } else {
                     System.out.println("x0 = " + roots[0] + " x1 = " + roots[1]);
              }


       }
}