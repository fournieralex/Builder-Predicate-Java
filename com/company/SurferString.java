package com.company;

public class SurferString implements SurferStringPredicate {

    public String accept(Surfer s){
        String SurferAge = s.getAge() > 40 ? "old":
        return s.getName() + " " + "is" + SurferAge ;

    }


}
