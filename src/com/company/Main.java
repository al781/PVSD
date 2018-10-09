package com.company;
import java.util.*;
public class Main
    {

        public static void main(String[] args)
            {
	            Student student1 = new Student(3.7, "Noname");
                Student student2 = new Student(4.0, "Something");
                Student student3 = new Student(4.3, "Alex");
                Student student4 = new Student(2, "Bennett");
                Student[] studentsort = new Student[4];
                studentsort[0] = student1;
                studentsort[1] = student2;
                studentsort[2] = student3;
                studentsort[3] = student4;
                Arrays.sort(studentsort);
                System.out.println("The top three students are:");
                System.out.println(studentsort[0]);
                System.out.println(studentsort[1]);
                System.out.println(studentsort[2]);
            }
    }