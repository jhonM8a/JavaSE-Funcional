package com.sumel.funtional;

public class Chaining {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hola")
                .append("jhon")
                .append("ochoa");

        Chainer chainer = new Chainer();
        chainer.hayHi().sayBy();
    }

    static class Chainer {
        public Chainer hayHi(){
            System.out.println("Hola");
            return this;
        }

        public  Chainer sayBy(){
            System.out.println("Byt");
            return this;
        }
    }
}
