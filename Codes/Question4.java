package com.company.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question4 {
    public static void main(String[] args) {
        Predicate<String> p = (ls) -> ls.charAt(0)=='G';
        List<String> stringList= Arrays.asList("Goal","Pole","Role");
        for (String k:stringList)
        {
            if(p.test(k))
            {
                System.out.println(k);
            }
        }
    }
}
