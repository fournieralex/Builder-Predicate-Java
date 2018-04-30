package com.company;

public class SurferAgeStancePredicate implements SurferPredicate{

    public boolean test(Surfer surfer){
       return "regular".equals(surfer.getStance()) && surfer.getAge() > 20;
    }
}
