package com.java.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample1 {
    public static void main(String[] args) {
        ArrayList<Course> courseList=new ArrayList<>();
        courseList.add(new Course(101,"Java"));
        courseList.add(new Course(102,"Angular"));
        courseList.add(new Course(103,"SpringBoot"));

        Collections.sort(courseList);
        System.out.println(courseList);
    }

}
