package com.company;

public class SurferStancePredicate implements SurferPredicate {
    public boolean test(Surfer s){
        return "regular".equals(s.getStance());
    }
}
