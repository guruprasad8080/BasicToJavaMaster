package com.java.generics;

public class WildCardsExample {
    /*//Upper-bounded WildCard:
    public static void update(Record<? extends Student> studentRecord){
    }
    //Lower-bounded WildCard:
    public static void update(Record<? super DayScholar> studentRecord){
    }
    //Un-bounded WildCard:
    public static void update(Record<?> studentRecord){
    }*/

    public static void main(String[] args) {
        Record<Student> studentRecord=new Record<>();
        Student student=new Student(101,"Guru");

        Record<DayScholar> dayScholarRecord=new Record<>();
        DayScholar dayScholar=new DayScholar(102,"Prasad",10000f);

        studentRecord.add(student);
        studentRecord.display(studentRecord);

        dayScholarRecord.add(dayScholar);
        dayScholarRecord.display(dayScholarRecord);
    }
}
