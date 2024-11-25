import java.util.Scanner;

public class w6_ExC {
    public static double angulo(double a, double b, double c) {
        double angulo = (a * a + b * b - c * c) / (2 * a * b);
        angulo = Math.toDegrees(Math.acos(angulo));
        return angulo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            double anguloAB = angulo(a, b, c);
            double anguloAC = angulo(a, c, b);
            double anguloBC = angulo(b, c, a);
            System.out.printf("a=%.2f%n", a);
            System.out.printf("b=%.2f%n", b);
            System.out.printf("c=%.2f%n", c);
            System.out.printf("ang(a,b)=%.2f%n", anguloAB);
            System.out.printf("ang(a,c)=%.2f%n", anguloAC);
            System.out.printf("ang(b,c)=%.2f%n", anguloBC);
        }else
        System.out.println("impossible");
    }
}
