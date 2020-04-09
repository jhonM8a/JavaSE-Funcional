package com.sumel.project;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {
    static void showHelp(CLIArguments cliArguments){
        /**
         * Consumer ->Realizar operaciones sobre un tipo de datos.
         *  Por ejemplo tener una lista de datos y por cada
         *  dato en esa lista vamos consumiendo y operando
         *  sobre el: lista de archivos para borrar archivos
         * */
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if(cliArguments1.isHelp()){
                System.out.println("Manual solicitado");
            }
        };
        consumerHelper.accept(cliArguments);
    }

    static CLIArguments generateCLI(){
        /**
         * Supplier->Una interfaz generica
         * que genera datos de un cierto tipo.
         * Algunas utilidades podrian ser
         * genera configuraciones bajo demanda o
         * crear archivos bajo demanda
         * */
        Supplier<CLIArguments> generator = () -> new CLIArguments();
        return generator.get();
    }
}
