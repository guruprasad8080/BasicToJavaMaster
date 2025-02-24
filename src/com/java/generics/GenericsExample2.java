package com.java.generics;

public class GenericsExample2 {

    public static <E> void printArray(E[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+",");
        }
    }

    public static void main(String[] args) {
        Integer[] arrInt={10,20,30,40,50};
        Character[] arrChar={'G','U','R','U','P','R','A','S','A','D'};
        Double[] arrDouble={1.5,2.5,100.5,200.5};
        GenericsExample2 ge=new GenericsExample2();
        ge.printArray(arrInt);
        ge.printArray(arrChar);
        ge.printArray(arrDouble);

    }
}
