package com.sumel.funtional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    static List<String> getNames(){
        List<String> list = new LinkedList<>();
        return  list;
    }

    static String mostValubalePlayer(){
        return null;
        //return "";
    }

    static int mostExpesiveItem(){
        return -1;
    }
    //Ahora, los mismo metodos con la clase Optional
    static Optional<List<String>> getOptionalNames(){
        List<String> nameList = new LinkedList<>();
        return Optional.of(nameList);
    }

    static Optional<String> optionalValuablePlayer(){
        //return Optional.ofNullable(null);
        try {
            //Logica que hace algo
            return Optional.of("Jhon");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<String> names = getNames();
        if(names != null){
            //Optional es una forma de operar con un dato que este o no
        }
        /**
         * Con optional ya podemos obtener el valor del tipo que se definio
         * Y se puede operar directamente sobre el
         * */
        Optional<List<String>> optionalNames = getOptionalNames();

        if(optionalNames.isPresent()){

        }
        //namesValue va a existir mientras el valor dentro del Optional este presente.
        //Es decir, si el valor no esta prsente no se va a ejecutar la lambda
        optionalNames.ifPresent(namesValues->namesValues.forEach(System.out::println));
        //Se puede genar un iterador con los elementos de la lista Optional.flapMap
        //Conversión de datos Optional.map
        //---------------------------------------
        Optional<String> valuablePlayer = optionalValuablePlayer();
        //Si no hay String mediante el Supplier damos un valor por defecto
        String nameValuablePLayer = valuablePlayer.orElseGet(()->"No hay");

    }
}
