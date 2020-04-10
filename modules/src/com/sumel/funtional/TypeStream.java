package com.sumel.funtional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TypeStream {
    public static void main(String[] args) {
        IntStream infinitStream = IntStream.iterate(0, x->x+1);
        infinitStream.limit(10)
                .parallel()
                .filter(x->x%2==0)
                .forEach(System.out::println);
        
    }
}
