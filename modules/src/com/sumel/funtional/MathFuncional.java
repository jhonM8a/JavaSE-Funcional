package com.sumel.funtional;

import java.util.function.Function;
import java.util.function.Predicate;


public class MathFuncional {
    //Clase ejemplo para predicados
    static class Student{
        private double calificacion;

        public Student(double calificacion){
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer num) {
                return num*num;
            }
        };
        /**
         * Es la misma función pero mas legible.
         * Recibe un entero x y le aplica el modulo 2
         * para saber si es para o impar
         * */
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;


        System.out.println(isOdd.apply(3));
        System.out.println(square.apply(5));

        /**
         * Interface Predicate:
         * Es una función que trabaja sobre un Tipo
         * pero genera un boolean, esto testea si algo es valido.
         * Esto genera validaciones rapidas, beneficia al filtrar elementos
         * o verificar si algo tiene datos
         *
         * */
        Predicate<Integer> isEven = x -> x%2 ==0;
        System.out.println("Predicate->isEven: " +isEven.test(4));
        //Ejemplo de uso para verificar que un estudiante aprobo
        Predicate<Student> isApproved = student -> student.calificacion>=3.0;
        System.out.println("Predicate->isApproved: "+isApproved.test(new Student(3.1)));

        /**
         * Elementos para consumir o proveer datos: Consumer y Supplier
         *
         * */

    }
}
