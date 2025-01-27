package com.linkedin.collections;

public class Main {
    public static void main(String[] args) {
        printGuitarMake(new Guitar("Fender", "Strat", 6));
    }

    public static void printGuitarMake(Guitar guitar){
        System.out.println(guitar.getMake());
        System.out.println("MyG make : " + myG().getMake());
    }

    public static Guitar myG(){
        return new Guitar("Gibson", "Les Paul", 6);
    }
}
