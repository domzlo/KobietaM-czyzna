package com.company;
import java.util.ArrayList;

public class CałaRodzina {

        public static void main(String[] args) {
            Mężczyzna tata = new Mężczyzna("Jan", "Kowalski", 90, 160);
            Kobieta mama = new Kobieta("Barbara", "Kowalska", 65, 150);

            Rodzina rodzina = new Rodzina(mama, tata);
        }
    }
