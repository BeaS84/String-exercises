package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Zad 1. Kalkulator: napisz program kalkulator, który wspiera działania dodawania, odejmowania, mnożenia i dzielenia.
        // Użytkownik wpisuje działanie, np 4 + 5 i otrzymuje wynik: 4 + 5 = 9.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz równanie - oddziel spacją znak od liczby");
        String response = scanner.nextLine();

        String[]numberSplit = response.split(" ");
        //wyswietlenie elementów tablicy
//        for (String element:numberSplit) {
//            System.out.println(element);
//        }
        //na zerowym i ostatnim indexie są liczby
        //na pierwszym indexie jest znak
        //pardujemy string na double
        Double number1 = Double.parseDouble(numberSplit[0]);
        Double number2 = Double.parseDouble(numberSplit[2]);

        //wyswietlenie liczb
        System.out.println(number1);
        System.out.println(number2);

        //teraz robimy switcha i jako operator podajemy znak
        switch (numberSplit[1]) {
            // addition
            case "+":
                Double result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            // subtraction
            case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            // multiplication
            case "*":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            // division
            case "/":
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

       // Zad 2. Odkurzacz do spacji: napisz program, który oczyszcza dany tekst ze wszystkich nadmiarowych spacji, pozostawiając tylko pojedyncze między słowami.
        // Np Ala   ma           kota                 -> Ala ma kota
        Scanner scan = new Scanner(System.in);
        System.out.println(" Napisz zdanie zawierające wiele spacji a ja oczyszcze dany tekst ze wszystkich nadmiarowych spacji, pozostawiając tylko pojedyncze między słowami. ");
       String phrase = scan.nextLine();

       //tworzymy wynikowy string
        String text2 = "";

        for (int i = 0; i<phrase.length();i++){
            if(i==phrase.length()-1){
                text2+=phrase.charAt(i);
            } else if (phrase.charAt(i)==' '&& phrase.charAt(i+1)==' ') {
                continue;
            }
            else {
                text2+= phrase.charAt(i);
            }
        }
        System.out.println(text2.trim());

        // Zad 3. Analiza stringów: napisz program, który sprawdza, czy
        // dany string jest palindromem (odczytuje się go tak samo od przodu, jak i od tyłu, np Anna),
        // heterogramem (żadna litera się nie powtarza, np Mateusz),
        // pangramem (zawiera wszystkie litery alfabetu łacińskiego, np The quick brown fox jumps over a lazy dog),
        // oraz, czy dane dwa stringi są anagramami (składają się z tych samych liter, np Tom Marvolo Riddle - I am Lord Voldemort)
    }
}
