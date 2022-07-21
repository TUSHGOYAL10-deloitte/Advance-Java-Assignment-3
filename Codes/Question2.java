package com.company.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Question2 {

            public static void main(String[] args) {
                Predicate<List<Integer>> checkempty=(e)->{if(e.size()==0){
                    return true;}else {return false;}
                };
                List<Integer> list=new ArrayList<>();
                System.out.println(checkempty.test(list));
            }
        }

