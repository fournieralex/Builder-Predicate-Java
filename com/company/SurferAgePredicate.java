package com.company;

public class SurferAgePredicate implements SurferPredicate{

    public boolean test(Surfer s){
        return s.getAge() > 30;

    }
}
