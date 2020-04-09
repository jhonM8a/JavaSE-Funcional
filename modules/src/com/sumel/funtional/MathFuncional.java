package com.sumel.funtional;

import java.util.function.Function;

public class MathFuncional {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer num) {
                return num*num;
            }
        };
        System.out.println(square.apply(5));

    }
}
