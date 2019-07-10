package edu.ujcv.progra2;

import edu.ujcv.progra2.matriz.IGMatR2;
import edu.ujcv.progra2.matriz.IGMatR3;
import edu.ujcv.progra2.matriz.IGMatR4;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IGVecR2 vector2 = new IGVecR2();
        IGVecR3 vector3 = new IGVecR3();
        IGVecR4 vector4 = new IGVecR4();
        IGMatR2 matriz2 = new IGMatR2();
        IGMatR3 matriz3 = new IGMatR3();
        IGMatR4 matriz4 = new IGMatR4();
        long opcion1, opcion2, opcion3, opcion4;

        System.out.println("Bienvenido a la Calculadora Suprema de Vectores y Matrices 20000");
        System.out.println("Ingresa si quieres Operaciones Vectoriales o Operaciones Matriciales");
        System.out.println("1) Vectoriales");
        System.out.println("2) Matriciales");
        System.out.print("Opcion: ");
        opcion1 = sc.nextInt();

        if (opcion1 == 1){
            System.out.println("Seleccione la dimension en la que desea trabajar:");
            System.out.println("1) 2 dimensiones");
            System.out.println("2) 3 dimensiones");
            System.out.println("3) 4 dimensiones");
            System.out.print("Opcion: ");
            opcion2 = sc.nextInt();

            if (opcion2 == 1) {
                System.out.println("Seleccione la operacion a realizar:");
                System.out.println("1) Suma");
                System.out.println("2) Resta");
                System.out.println("3) Escalar por Vector");
                System.out.println("4) Producto Punto");
                System.out.println("5) Angulo");
                System.out.println("6) Magnitud");
                System.out.print("Opcion: ");
                opcion3 = sc.nextInt();
            }

                if (opcion3 == 1) {
                    IGVecR2 a = new IGVecR2();
                    System.out.println("Ingrese x1 y y1");
                    a.setX(sc.nextDouble());
                    a.setY(sc.nextDouble());
                    IGVecR2 b = new IGVecR2();
                    System.out.println("Ingrese x2 y y2");
                    b.setX(sc.nextDouble());
                    b.setX(sc.nextDouble());
                    System.out.println("Su resultado es: " + a.suma(b));
                }

                if (opcion3 == 2) {
                    IGVecR2 a = new IGVecR2();
                    System.out.println("Ingrese x1 y y1");
                    a.setX(sc.nextDouble());
                    a.setY(sc.nextDouble());
                    IGVecR2 b = new IGVecR2();
                    System.out.println("Ingrese x2 y y2");
                    b.setX(sc.nextDouble());
                    b.setX(sc.nextDouble());
                    System.out.println("Su resultado es: " + a.resta(b));
                }

                if (opcion3 == 3) {
                    IGVecR2 a = new IGVecR2();
                    System.out.println("Ingrese x1 y y1:");
                    a.setX(sc.nextDouble());
                    a.setY(sc.nextDouble());
                    IGVecR2 b = new IGVecR2();
                    System.out.println("Ingrese x2 y y2:");
                    b.setX(sc.nextDouble());
                    b.setX(sc.nextDouble());
                    System.out.println("Ingrese alph:");
                    double alpha = sc.nextDouble();
                    System.out.println("Su resultado es" + a.escalarPorVector(b));
                }


            }
        }

        if (opcion1 == 2){

        }


    }
}
