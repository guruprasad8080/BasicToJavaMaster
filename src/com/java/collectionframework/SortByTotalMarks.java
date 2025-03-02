package com.java.collectionframework;

import java.util.Comparator;

public class SortByTotalMarks implements Comparator<Student> {

    public int compare(Student s1, Student s2){
        return Integer.compare(s1.getTotalMarks(),s2.getTotalMarks());
    }
}
