package com.sumel.funtional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {
        /**
         * Funcion que trabaja con un tipo
         * definido. Recibe un tipo pero genera
         * un resultado del mismo tipo. Osea que no
         * hay que definir una función con su tipo y
         * su salida
         * */
        UnaryOperator<String> quote =text -> "\""+text + "\"";
        UnaryOperator<String> addMark = text->text+"!";
        System.out.println(quote.apply("Hola Jhon"));
        System.out.println(addMark.apply("Hola"));

        /**
         * Es una funcion que toma dos tipos de datos
         * y genera otro tipo de dato
         * */
        BiFunction<Integer, Integer, Integer> multi  = (x,y)->x*y;
        System.out.println(multi.apply(7,8));
        /**
         * BiOpertator funciona de la misma manera que
         * BiFunction, los dos argumentos
         * Y el resultado va hacer del mismo tipo
         * */
        BinaryOperator<Integer> muiltiBiOperator = (x,y) ->x*y;
        System.out.println(muiltiBiOperator.apply(4,5));
        //Ejemplo BiFunction
        BiFunction<String,Integer, String> letPad = (text, space)->
                String.format("%"+space+"s",text);

        System.out.println(letPad.apply("java",15));
    }
}
