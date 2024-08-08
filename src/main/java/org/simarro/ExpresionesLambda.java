package org.simarro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExpresionesLambda {

    //(parametros) -> {cuerpo}

    // ()->5   // sin parametros y una expresion en el cuerpo
    // x ->x*x // un paramtero y una expresion
    // (x,y)-> x+y  // 2 parametros y una expresion en el cuerpo
    // x->{x*=2; retunr x/2}    // un paramtero 2 expreisones
    // (x,y) -> {x*=2; return x/y}   // 2 parametros 2 expresiones
    // (x,y,z) -> x+y*z    // tres parametros y una expresion

    public static void main(String[] args) {

        // expresiones lambda
        Calculadora suma = (a, b) -> a + b;
        Calculadora multiplicacion = (a, b) -> a * b;
        Calculadora resta = (a, b) -> a - b;


        System.out.println("suma: " + suma.operacion(3, 5));
        System.out.println("resta: " + resta.operacion(3, 5));
        System.out.println("multiplicacion: " + multiplicacion.operacion(3, 5));

        //makigas   https://www.youtube.com/watch?v=Axzb-i4PQEg


    }

}