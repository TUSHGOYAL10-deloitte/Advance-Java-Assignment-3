package com.company.lambdas;

@FunctionalInterface
interface StringLengthLambda{
    int getLength(String str);
}
public class Question6 {
    public static void main(String[] args) {
        StringLengthLambda stringLengthLambda= (String str)  -> str.length();
        int length=stringLengthLambda.getLength("Welcome");
        System.out.println("length: "+length);
    }
}
