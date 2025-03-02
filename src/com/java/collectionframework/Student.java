package com.java.collectionframework;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int totalMarks;

    public Student(int id, String name, int totalMarks) {
        this.id = id;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    // Comparable implementation: Sorting by name
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', totalMarks=" + totalMarks + "}";
    }
}
