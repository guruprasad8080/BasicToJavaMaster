package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Record <E>{
    List<E> record=new ArrayList<>();

    @Override
    public String toString(){
        return "Record[record="+record+"]";
    }
    public void add(E e){
        record.add(e);
    }
    public void display(Record<? extends Student> record){
        System.out.println("Student record:"+record);
    }
}
