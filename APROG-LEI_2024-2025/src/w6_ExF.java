import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class w6_ExF {
    static final double PI = Math.PI;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String revolutionSolid = sc.nextLine();
        double volume = 0, raio, altura;
        while (!revolutionSolid.equals("end")) {
            if (revolutionSolid.equals("cone") || revolutionSolid.equals("cylinder")) {
                raio = sc.nextDouble();
                altura = sc.nextDouble();
                volume = calculoVolume(revolutionSolid, raio, altura);
            } else {
                if (revolutionSolid.equals("sphere")) {
                    raio = sc.nextDouble();
                    altura = 1;
                    volume = calculoVolume(revolutionSolid, raio, altura);
                }
            }
            System.out.printf("%.2f%n", volume);
            sc.nextLine();
            revolutionSolid = sc.nextLine();
        }
    }

    public static double calculoVolume(String revSol, double raio, double altura) {
        double volume = 0;
        switch (revSol) {
            case "sphere":
                volume = (4.0 / 3.0) * (Math.pow(raio, 3) * altura * PI);
                break;
            case "cylinder":
                volume= Math.pow(raio, 2) * altura * PI;
                break;
            case "cone":
                volume= (1.0 / 3.0) * (Math.pow(raio, 2) * altura * PI);
                break;
        }
        return volume;
    }
}
