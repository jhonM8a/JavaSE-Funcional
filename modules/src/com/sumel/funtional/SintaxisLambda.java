package com.sumel.funtional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class SintaxisLambda {

    public static void main(String[] args) {

        List<String> cursos = UtilNames.getList("Java", "funcional");

        cursos.forEach(curso-> System.out.println(curso));
        usarZero(()->2);
        usarPredicado(text->text.length()>0);
        usarBiFunction((numX, numY)->numX*numY);
        //Extender la lambda, agregar un cuerpo mas a la funcion
        usarBiFunction((numX,numY)->{
            System.out.println("Num x: "+numX+" " +"Num Y:"+ numY);
            return numX+numY;
        });
        //Una lambda que no recibe ni retorna nada
        usarNada(()->{
            System.out.println("Lambda que no recibe ni retorna nada");
        });

    }

    static void usarZero(ZeroArgumentos zeroArgumentos){
        System.out.println(zeroArgumentos.get());
    }

    static void usarPredicado(Predicate<String> predicate){
        System.out.println(predicate.test("Hola"));
    }

    static void usarBiFunction(BiFunction<Integer, Integer, Integer> biFunction){
        System.out.println(biFunction.apply(10,10));
    }

    static void usarNada(OperarNada operarNada){
        operarNada.nada();
    }
    @FunctionalInterface
    interface  ZeroArgumentos{
        int get();
    }

    @FunctionalInterface
    interface  OperarNada{
        void nada();
    }
}
