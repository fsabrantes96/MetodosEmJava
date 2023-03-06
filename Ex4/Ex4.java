package Ex4;

import org.w3c.dom.ls.LSOutput;

public class Ex4 {
    public static void area(double baseMenor, double baseMaior, double altura){
        System.out.println("A area do trapezio é: " + (baseMaior + baseMenor) * altura / 2);
    }

    public static void area (double lado) {
        System.out.println("A area do quadrado é: " + (lado * lado));
    }

    public static void area(double lado1, double lado2) {
        System.out.println("A area do retangulo é: " + (lado1*lado2));
    }

    public static void area (float diagonal1, float diagonal2){
        System.out.println("Area do losango: " + (diagonal1 * diagonal2)/2);
    }
}
