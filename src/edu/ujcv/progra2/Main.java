package edu.ujcv.progra2;

import edu.ujcv.progra2.matriz.IGMatR2;
import edu.ujcv.progra2.matriz.IGMatR3;
import edu.ujcv.progra2.matriz.IGMatR4;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;

import java.sql.SQLOutput;
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
        long opcion1, opcion2, ;

        System.out.println("Bienvenido a la Calculadora Suprema de Vectores y Matrices 20000");
        System.out.println("Ingresa si quieres Operaciones Vectoriales o Operaciones Matriciales");
        System.out.println("1) Vectoriales");
        System.out.println("2) Matriciales");
        System.out.print("Opcion: ");
        opcion1 = sc.nextInt();

        if (opcion1 == 1){
            System.out.println("Seleccione que ");
        }

        if (opcion1 == 2){

        }


    }
}
