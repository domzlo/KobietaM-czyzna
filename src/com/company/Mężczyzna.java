package com.company;

public class Mężczyzna {

    private String imie, nazwisko;
    private int wiek, wzrost, waga;

    public Mężczyzna(String imie, String nazwisko, int waga, int wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.waga = waga;
        this.wzrost = wzrost;

        if (this.wzrost >= 190) {
            System.out.println("Ten mężczyzna jest wysoki!");
        } else {
            System.out.println("Ten mężczyzna nie jest wysoki!");
        }

    }
}

