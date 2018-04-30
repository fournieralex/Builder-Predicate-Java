package com.company;


public class Surfer {

    private final String name;
    private  final int age;
    private final int yearspro;
    private final String stance;
    private  final String homecountry;
    private final String currentcountry;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStance() {
        return stance;
    }

    public int getYearspro() {
        return yearspro;
    }

    public String getHomeCountry() {
        return homecountry;
    }

    public String getCurrentCountry() {
        return currentcountry;
    }



    public static class SurferBuilder {

        private String name;
        private int age;
        private int yearspro;
        private String stance;
        private String homecountry;
        private String currentcountry;



        public SurferBuilder Age(int a) {
            this.age = a;
            return this;

        }

        public SurferBuilder Name(String n) {
            this.name = n;
            return this;

        }

        public SurferBuilder YearsPro(int yp) {
            this.yearspro = yp;
            return this;
        }

        public SurferBuilder Stance(String s) {
            this.stance = s;
            return this;
        }

        public SurferBuilder HomeCountry(String h) {
            this.homecountry = h;
            return this;
        }

        public SurferBuilder CurrentCountry(String cc) {
            this.currentcountry = cc;
            return this;

        }


        public Surfer build() {
            return new Surfer(this);
        }




    }
    @Override
    public String toString(){
        return String.format("Surfer{Name:%s,Age:%d,Stance:%s,YearsPro:%d,HomeCountry:%s, CurrentCountry:%s" ,
                name,age,stance,yearspro,homecountry,currentcountry);
    }

    private Surfer(SurferBuilder sb) {
        this.name = sb.name;
        this.age = sb.age;
        this.stance = sb.stance;
        this.yearspro = sb.yearspro;
        this.homecountry = sb.homecountry;
        this.currentcountry = sb.currentcountry;


    }




}