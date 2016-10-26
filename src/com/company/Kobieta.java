package com.company;

public class Kobieta {

    private String imie, nazwisko;
    private int wiek, wzrost, waga;

    public Kobieta(String imie, String nazwisko, int waga, int wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.waga = waga;
        this.wzrost = wzrost;

        if (this.wzrost >= 160) {
            System.out.println("Ta kobieta jest wysoka!");
        } else {
            System.out.println("Ta kobieta nie jest wysoka!");
        }
    }
}
