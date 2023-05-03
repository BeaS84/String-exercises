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

        //palindrom
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Napisz string a ja sprawdze, czy jest palindromem");
        String userResponse = scan.nextLine(); //"Kobyła ma mały bok"

        String formattedUserResponse = userResponse.toLowerCase().replace(" ", "");
        String reverse = "";
        for (Integer i = formattedUserResponse.length() - 1; i >= 0; i--) {
            reverse += formattedUserResponse.charAt(i);//to ten sam zapis co reverse =reverse+ userResponse.charAt(i);
        }
        System.out.println(reverse);

        boolean isPalindrome = true;
        for (Integer i = 0; i < formattedUserResponse.length(); i++) {
            if (formattedUserResponse.charAt(i) != reverse.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }
        String messageFormatted = String.format("%s", userResponse);
        if (isPalindrome) {
            System.out.println(messageFormatted + " is a palindrome");
        } else {
            System.out.println(messageFormatted + "is NOT a palindrome");
        }

        // heterogram
        scan2 = new Scanner(System.in);
        System.out.println("Napisz string a ja sprawdze, czy jest heterogramem");
        String heterogramResponse = scan.nextLine(); //"Mateusz"
        boolean isHeterogram = true;
//
        for (Integer i = 0; i < heterogramResponse.length(); i++) {
            Character zero = heterogramResponse.charAt(i);
            Character chariIteration;
            for (Integer j = 0; j < heterogramResponse.length(); j++) {
                if (j == i) {
                    continue;
                } else {
                    chariIteration = heterogramResponse.charAt(j);

                }
                if (zero.equals(chariIteration)) {
                    isHeterogram = false;
                    break;
                }
            }
        }
        if (isHeterogram) {
            System.out.println(heterogramResponse + " is heterogram");
        } else {
            System.out.println(heterogramResponse + " is NOT a heterogram");
        }
        

    }
}
