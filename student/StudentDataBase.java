package com.company.lambdas.student;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentDataBase {
    static Predicate<Student> mail = (email) -> email.getEmail().contains("@gmail.com");
    static Predicate<Student> str = (s) -> s.getName().startsWith("P");
    static int s1marks[]={80,80,80,80,80};
    public static Student student1=new Student(1,
            "Tushar Goyal",
            "tushar@gmail.com",
            LocalDate.of(2000,6,13),
            "CSE",
            s1marks);
    static int s2marks[]={70,80,90,85,82};
    public static Student student2=new Student(2,
            "Kartik Singh",
            "kartik@gmail.com",
            LocalDate.of(2000,1,20),
            "CSE",
            s2marks);
    static int s3marks[]={65,72,80,81,89};
    public  static Student student3=new Student(3,
            "Paritosh Omer",
            "ayush.omer@deloitte.com",
            LocalDate.of(1995,4,24),
            "Information Technology",
            s3marks);
    static int s4marks[]={90,90,90,85,85};
    public static Student student4=new Student(4,
            "Prerna Talan",
            "Shoryatalan@gmail.com",
            LocalDate.of(1994,3,8),
            "CSE",
            s4marks);
    static int s5marks[]={81,89,80,75,77};
    public static Student student5=new Student(5,
            "Yash Raj Singh",
            "YashSingh@deloitte.com",
            LocalDate.of(1990,11,20),
            "CSE",
            s5marks);


    public static void main(String[] args) {
        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5);

        //Q1
        List<Student> ans1=samebranch(students,"CSE");
        System.out.println(ans1);

        //Q2
        List<Student> ans2=agelessthan25(students);
        System.out.println(ans2);

        //Q3
        List<Student> ans3=sortstudents(students);
        System.out.println(ans3);

        //Q4
        List<Student> ans4=samebranchwithagelessthan25(students,"CSE");
        System.out.println(ans4);

        //Q5
//        double ans5=averagemarks(students);
//        System.out.println(ans5);

        //Q6
        students.forEach(student -> {
            if(str.test(student)){
                System.out.println(student);
            }
        });

        //Q7

        students.forEach(student -> {
            if(mail.test(student)){
                System.out.println(student);
            }
        });


    }
    public static List<Student> samebranch(List<Student> students,String branch){
        return students.stream().filter((student -> student.getBranch().equals("CSE"))).collect(Collectors.toList());

    }

    public static List<Student> agelessthan25(List<Student> students){
        return students.stream().filter(student -> Period.between(student.getDOB(),LocalDate.now()).getYears()<25).collect(Collectors.toList());
    }


    public static List<Student> sortstudents(List<Student> students){
        return students.stream().sorted(Comparator.comparing(Student::getBranch)).collect(Collectors.toList());
    }

    public static List<Student> samebranchwithagelessthan25(List<Student> students,String branch){
        return students.stream().filter((student -> {return student.getBranch().equals("CSE") && Period.between(student.getDOB(),LocalDate.now()).getYears()<25;})).collect(Collectors.toList());

    }
//
//    public static double averagemarks(List<Student> students){
//        return students.stream().map(averagemarks())
//    }

}
