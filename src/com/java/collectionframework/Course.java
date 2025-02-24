package com.java.collectionframework;

public class Course implements Comparable{
    int id;
    String name;

    public Course(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString(){
        return "Id= "+id+" Name= "+name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
