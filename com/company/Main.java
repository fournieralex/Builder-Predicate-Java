package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Surfer s1 = new Surfer.SurferBuilder().Age(45).CurrentCountry("Istanbul").YearsPro(12).Stance("goofy").HomeCountry("Spain").Name("Kelley Slater")
                .build();
        Surfer s2 = new Surfer.SurferBuilder().Age(30).CurrentCountry("United States").YearsPro(6).Stance("regular").HomeCountry("Spain").Name("Johnny Sparks")
                .build();
        Surfer s3 = new Surfer.SurferBuilder().Age(26).CurrentCountry("United States").YearsPro(6).Stance("goofy").HomeCountry("United States").Name("Alex Fournier")
                .build();
        Surfer s4 = new Surfer.SurferBuilder().Age(40).CurrentCountry("Pluto").YearsPro(99).Stance("goofy").HomeCountry("United States").Name("King Neptune")
                .build();
        Surfer s5 = new Surfer.SurferBuilder().Age(24).CurrentCountry("Japan").YearsPro(1).Stance("regular").HomeCountry("Australia").Name("Mick Fanning")
                .build();

        ArrayList<Surfer> surferlist = new ArrayList<>();

        surferlist.add(s1);
        surferlist.add(s2);
        surferlist.add(s3);
        surferlist.add(s4);
        surferlist.add(s5);


        List<Surfer> surferAgeStanceList = filterSurfers(surferlist, new SurferAgeStancePredicate());
        for (Surfer s : surferAgeStanceList) {
            System.out.println(s);
        }


    }










    public static List<Surfer> filterSurfers (List <Surfer> surfers,  SurferPredicate sp){

        List<Surfer> result = new ArrayList<>();
        for (Surfer surfer : surfers) {
            if (
                    sp.test(surfer))
                result.add(surfer);

        }
        return result;

    }
}




