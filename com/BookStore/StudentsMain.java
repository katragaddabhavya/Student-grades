package com.BookStore;

public class StudentsMain {
    public static void main(String[] args) {

        Students marks=new Students();

        System.out.println("Marks of Medical Students is: "+marks.calculateMarks(75,66,90,86));
        System.out.println("Marks of Non-Medical Students is: "+marks.calculateMarks(55,65.5f,68));
        System.out.println("Marks of Business Students is: "+marks.calculateMarks(98,89,67));
    }
}