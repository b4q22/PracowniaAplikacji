import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // zad 1
        Scanner nieparzyste = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita dodatnia:");
        int n1 = nieparzyste.nextInt();
        for (int i = 1; i <= n1; i += 2) {
            System.out.println(i);
        }

        // zad 2
        Scanner potegi = new Scanner(System.in);
        System.out.println("Podaj liczbe n:");
        int n2 = potegi.nextInt();
        int p = 1;
        while (p <= n2) {
            System.out.println(p);
            p *= 2;
        }

        // zad 3
        Scanner suma = new Scanner(System.in);
        int sumaLiczb = 0;
        int liczba;
        do {
            System.out.println("Podaj liczbe (0 konczy):");
            liczba = suma.nextInt();
            sumaLiczb += liczba;
        } while (liczba != 0);
        System.out.println("Suma: " + sumaLiczb);

        // zad 4
        Scanner minmax = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe (0 konczy):");
        int pierwsza = minmax.nextInt();
        if (pierwsza != 0) {
            int min = pierwsza;
            int max = pierwsza;
            int kolejna;
            while ((kolejna = minmax.nextInt()) != 0) {
                if (kolejna < min) {
                    min = kolejna;
                }
                if (kolejna > max) {
                    max = kolejna;
                }
            }
            int sumaMinMax = min + max;
            double srednia = (double) sumaMinMax / 2;
            System.out.println("Suma min i max: " + sumaMinMax);
            System.out.println("Srednia arytmetyczna: " + srednia);
        }

        // zad 5
        Scanner gra = new Scanner(System.in);
        int wylosowana = (int) (Math.random() * 100) + 1;
        int strzal;
        System.out.println("Zgadnij liczbe od 1 do 100:");
        do {
            strzal = gra.nextInt();
            if (strzal > wylosowana) {
                System.out.println("Podales za duza wartosc");
            } else if (strzal < wylosowana) {
                System.out.println("Podales za mala wartosc");
            } else {
                System.out.println("Gratulacje");
            }
        } while (strzal != wylosowana);

        // zad 6
        Scanner prostokat = new Scanner(System.in);
        System.out.println("Podaj znak wypelnienia:");
        char zn = prostokat.next().charAt(0);
        System.out.println("Podaj x:");
        int x = prostokat.nextInt();
        System.out.println("Podaj y:");
        int y = prostokat.nextInt();
        System.out.println("Podaj szerokosc a:");
        int a = prostokat.nextInt();
        System.out.println("Podaj wysokosc b:");
        int b = prostokat.nextInt();

        for (int i = 1; i < y; i++) {
            System.out.println();
        }
        for (int i = 0; i < b; i++) {
            for (int j = 1; j < x; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < a; j++) {
                System.out.print(zn);
            }
            System.out.println();
        }

        // zad 7
        Scanner choinka = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki n:");
        int n = choinka.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // zad 8
        Scanner silniaScanner = new Scanner(System.in);
        System.out.println("Podaj liczbe do silni:");
        int liczbaSilni = silniaScanner.nextInt();
        long wynikSilni = 1;
        for (int i = 1; i <= liczbaSilni; i++) {
            wynikSilni *= i;
        }
        System.out.println("Silnia wynosi: " + wynikSilni);

        // zad 9
        Scanner palindrom = new Scanner(System.in);
        System.out.println("Podaj slowo:");
        String slowo = palindrom.next();
        String odwrocone = "";
        for (int i = slowo.length() - 1; i >= 0; i--) {
            odwrocone += slowo.charAt(i);
        }
        if (slowo.equalsIgnoreCase(odwrocone)) {
            System.out.println("Slowo jest palindromem");
        } else {
            System.out.println("Slowo nie jest palindromem");
        }

        // zad 10
        zewnetrzna:
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            for (int j = 1; j <= 10; j++) {
                System.out.println(j);
                if (j > i) {
                    continue zewnetrzna;
                }
            }
        }
    }
}