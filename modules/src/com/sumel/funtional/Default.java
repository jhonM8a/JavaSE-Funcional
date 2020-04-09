package com.sumel.funtional;

public class Default {
    @FunctionalInterface
    interface StringOperation{
        int getAmount();

        default void operate(String text){
            int num = getAmount();
            while (num-- >0){
                System.out.println(text);
            }

        }
    }

    @FunctionalInterface
    interface DoOperation{
        void take(String text);

        default void execute(int x, String text){
            while (x-- >0){
                    take(text);
            }
        }
    }

    public static void main(String[] args) {
        StringOperation six = ()->6;
        six.operate("Jhon");
        DoOperation operationFive = text -> System.out.println("Mario");
        operationFive.execute(5,"ochoa");
    }
}
