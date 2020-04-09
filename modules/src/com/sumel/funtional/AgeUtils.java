package com.sumel.funtional;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {
    public static void main(String[] args) {
        Function<Integer, String> addZero = (number)-> number<10 ? "0"+number:String.valueOf(number);

        ThreeFuction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) ->LocalDate.parse(year+"-"+
                        addZero.apply(month)+"-"+addZero.apply(day));

        ThreeFuction<Integer, Integer, Integer, Integer> calculateAge =
                (day,month, year) -> Period.between(
                        parseDate.apply(day,month,year),LocalDate.now()).getYears();

        System.out.println(calculateAge.apply(10,10,1992));
    }

    /**
     * Esta notación permite crear tipos propios interfaces funcionales
     * Con esto generamos nuestros propias funciones dada ciertos datos
     * o una strucutura.
     * Pero la interfaz debe de ser SAM.
     * */
    @FunctionalInterface
    interface  ThreeFuction<T, U, V, R> {
        //Se define función que recibe 3 parametros
        R apply(T t, U u, V v);
    }
}
