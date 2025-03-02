package com.java.collectionframework;

import java.util.TreeSet;

public class TreeSetSortingExample {

    public static void main(String[] args) {
        TreeSet<Student> studentByName=new TreeSet<>();

        studentByName.add(new Student(101,"Guru",99));
        studentByName.add(new Student(101,"Prasad",85));
        studentByName.add(new Student(101,"Sneha",78));
        studentByName.add(new Student(101,"Karan",88));
        studentByName.add(new Student(101,"Amit",75));

        System.out.println("Students sorted by Name (Comparable):");
        for(Student s: studentByName){
            System.out.println(s);
        }

        TreeSet<Student> studentsByMarks=new TreeSet<>(new SortByTotalMarks());
        studentsByMarks.addAll(studentByName);

        System.out.println("Students sorted by Total Marks (Comparator):");
        for(Student s: studentsByMarks){
            System.out.println(s);
        }

    }
}
