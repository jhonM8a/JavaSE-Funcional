package com.sumel.funtional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UtilNames {

    public static void main(String[] args) {
        List<String> profesores = getList("Nicolas", "Juan", "Jhon");

        Consumer<String> printerProfessorsRedundancy = text-> System.out.println(text);
        profesores.forEach(printerProfessorsRedundancy);
        System.out.println("--------------------------------------------------");
        /**
         * Se usa el operador de referencia
         * para poder usar ya los metodos
         * definidos en alguna clase statica u objeto
         * y no tener que crear funciones .
         *
         * Para pder utilizar metodos como funciones
         * Solo deben cumplir con la misma cantidad y tipo
         * de parametros para poder generar el mismo resultado
         * */
        profesores.forEach(System.out::println);
    }

   public static <T> List<T> getList(T...elements){
        return Arrays.asList(elements);
    }
}
