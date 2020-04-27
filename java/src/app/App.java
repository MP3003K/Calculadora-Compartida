package app;

import java.util.Scanner;

public class App {
    public static Scanner teclado = new Scanner(System.in);
    public static double suma (double x, double y) {
        x=x+y;
        return x;
    }
    public static double resta (double x, double y) {
        x=x-y;
        return x;
    }
    public static double multiplicacion (double x, double y) {
        x=x*y;
        return x;
    }
public static double  divicion(double x, double y) {
   
   if(y!=0){
    x=x/y;
   }
    return x;
}
    public static void main(String[] args) throws Exception {
    double x,y;
        System.out.print("x= ");
        x=teclado.nextInt();
        System.out.print("y= ");
        y=teclado.nextInt();
        System.out.println("suma =  "+(int)suma(x, y));
        System.out.println("resta =  "+(int)resta(x, y));
        System.out.println("multiplicacion =  "+multiplicacion(x, y));
         if(y!=0){
            System.out.print("divicion =  ");
            System.out.printf("%.2f",divicion(x, y));
        }
    }
}