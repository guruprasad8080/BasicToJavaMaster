package com.java.generics;

public class GenericsExamples1 {
    public static <E> void Display(E[] list){
        for (int i=0;i<list.length;i++){
            System.out.println(list[i]+",");
        }
    }

    public static void main(String[] args) {

        String[] cities={"Bengaluru","Chennai"};
        Integer[] codes={12,14,15};
        GenericsExamples1.Display(codes);
        GenericsExamples1.Display(cities);

    }
}
