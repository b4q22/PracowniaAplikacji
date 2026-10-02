import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // zad 1
        System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");
        // zad2
        String imie = "Oskar";
        int rok = 2007;
        double przecinek = 0.66;
        int rok_teraz = LocalDate.now().getYear();
        // zad 3
        System.out.println("Mam na imię " +imie+ ", mam " +(rok_teraz-rok)+ " lat  i będę pisać maturę za " +przecinek+ " roku.");
        // zad 4
        Scanner wpisanie = new Scanner(System.in);
        System.out.println("Ile jest stopni na dworze?");
        double stopnie_c = wpisanie.nextDouble();
        double stopnie_f = (stopnie_c * 1.8) + 32;
        System.out.println(stopnie_f);
        // zad 5
        Scanner boki = new Scanner(System.in);
        System.out.println("Podaj bok A: ");
        double a = boki.nextDouble();

        System.out.println("Podaj bok B: ");
        double b = boki.nextDouble();

        System.out.println("Podaj bok C: ");
        double c = boki.nextDouble();

        double obw = a+b+c;
        System.out.println(obw);

        // zad 6

        Scanner ala = new Scanner(System.in);
        System.out.println("Podaj pierwsze slowo");
        String pierwsze = ala.next();

        System.out.println("Podaj drugie slowo");
        String drugie = ala.next();

        System.out.println("Podaj trzecie slowo");
        String trzecie = ala.next();

        System.out.println(trzecie+","+drugie+","+pierwsze);
        // zad 7
        Scanner litery = new Scanner(System.in);
        System.out.println("Wpisz slowo");
        String slowo = litery.next();
        int litery_w_slowie = slowo.length();
        System.out.println(litery_w_slowie);
        // zad 8
        int x = 5;
        int y = 2;
        double wynik = (double) x / y;
        System.out.println(wynik);
        // zad 9
        Scanner duze = new Scanner(System.in);
        System.out.println("Wpisz slowo do zamiany");
        String slowo_do_zmiany = duze.next();
        String slowo_zmienione = slowo_do_zmiany.toUpperCase();
        System.out.println(slowo_zmienione);

        // zad 10
        Scanner kolo = new Scanner(System.in);
        System.out.println("Wpisz promien kola");
        int promien = kolo.nextInt();
        double pole = Math.PI * (promien * promien);
        System.out.println(pole);
    }
}
