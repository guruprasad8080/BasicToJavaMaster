package com.java.generics;

public class DayScholar extends Student{

    float stipend;

    public DayScholar(int id, String name,float stipend) {
        super(id, name);
        this.stipend=stipend;
    }

    @Override
    public String toString(){
        return "Id= "+id+" Name= "+name+" Stipend= "+stipend;
    }
}
