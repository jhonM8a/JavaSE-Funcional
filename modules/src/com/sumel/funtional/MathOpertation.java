package com.sumel.funtional;

import java.util.function.Function;

public class MathOpertation {
    public static void main(String[] args) {
        Function<Integer, Integer> multiByThree = num->{
            System.out.println("Multiplicando x:"+ num+" por 3");
            return num*3;
        };
        /**
         * Cuando se invoca addOneMultyByThree
         * Se esta generando una función intermedia
         * atravez de compose, compose toma una función
         * y la ejecuta primero y despues ejecuta la
         * función sobre la cual se mando a llamar
         * */
        Function<Integer, Integer> addOneMultyByThree  =
                multiByThree.compose(y->{
                    System.out.println("Le agregare 1 a : "+y);
                    return y+1;
                });
        /**
         * Se ejecuta despues de la ejecución de las funciones de addOneMultyByThree
         * */
        Function<Integer, Integer> andSquare = addOneMultyByThree.andThen(x->{
            System.out.println("Estoy elevando :"+x+" Al cuadrado");
           return x*x;
        });

        System.out.println(addOneMultyByThree.apply(5));

        System.out.println(andSquare.apply(3));
    }
}
