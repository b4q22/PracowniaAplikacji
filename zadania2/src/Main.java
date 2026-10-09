import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // zad 1
        Scanner podzielnosc = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int liczba = podzielnosc.nextInt();

        if (liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }

        // zad 2
        Scanner trojkat = new Scanner(System.in);
        System.out.println("Podaj bok A:");
        double a = trojkat.nextDouble();

        System.out.println("Podaj bok B:");
        double b = trojkat.nextDouble();

        System.out.println("Podaj bok C:");
        double c = trojkat.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Mozna zbudowac trojkat");
        } else {
            System.out.println("Nie mozna zbudowac trojkata");
        }

        // zad 3
        Scanner dwojka = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        double num1 = dwojka.nextDouble();

        System.out.println("Podaj druga liczbe:");
        double num2 = dwojka.nextDouble();

        if (num1 > num2) {
            System.out.println("Najwieksza to: " + num1);
        } else if (num2 > num1) {
            System.out.println("Najwieksza to: " + num2);
        } else {
            System.out.println("Liczby sa rowne");
        }

        // zad 4
        Scanner trojka = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        double x1 = trojka.nextDouble();

        System.out.println("Podaj druga liczbe:");
        double x2 = trojka.nextDouble();

        System.out.println("Podaj trzecia liczbe:");
        double x3 = trojka.nextDouble();

        if (x1 >= x2 && x1 >= x3) {
            System.out.println("Najwieksza to: " + x1);
        } else if (x2 >= x1 && x2 >= x3) {
            System.out.println("Najwieksza to: " + x2);
        } else {
            System.out.println("Najwieksza to: " + x3);
        }

        // zad 5
        Scanner miesiac = new Scanner(System.in);
        System.out.println("Podaj numer miesiaca:");
        int m = miesiac.nextInt();

        switch (m) {
            case 1:
                System.out.println("Styczen");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecien");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpien");
                break;
            case 9:
                System.out.println("Wrzesien");
                break;
            case 10:
                System.out.println("Pazdziernik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzien");
                break;
            default:
                System.out.println("Nieprawidlowy numer miesiaca");
                break;
        }

        // zad 6
        Scanner sprawdzImie = new Scanner(System.in);
        String mojeImie = "Oskar";
        System.out.println("Podaj imie:");
        String imie = sprawdzImie.next();

        if (imie.equalsIgnoreCase(mojeImie)) {
            System.out.println("Masz takie samo imie jak ja");
        } else {
            System.out.println("Masz inne imie niz ja");
        }

        // zad 7
        Scanner wiekScanner = new Scanner(System.in);
        System.out.println("Podaj wiek:");
        int wiek = wiekScanner.nextInt();

        boolean czyPelnoletni = wiek >= 18;
        System.out.println(czyPelnoletni);

        // zad 8
        Scanner przestepny = new Scanner(System.in);
        System.out.println("Podaj rok:");
        int rok = przestepny.nextInt();

        if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
            System.out.println("Rok przestepny");
        } else {
            System.out.println("Rok nieprzestepny");
        }

        // zad 9
        Scanner bmiScanner = new Scanner(System.in);
        System.out.println("Podaj wage w kg:");
        double waga = bmiScanner.nextDouble();

        System.out.println("Podaj wzrost w metrach:");
        double wzrost = bmiScanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("waga prawidlowa");
        } else if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else {
            System.out.println("nadwaga");
        }

        // zad 10
        Scanner agd = new Scanner(System.in);
        double cena;
        do {
            System.out.println("Podaj cene towaru (od 100 do 10000 zl):");
            cena = agd.nextDouble();
        } while (cena < 100 || cena > 10000);

        int raty;
        do {
            System.out.println("Podaj liczbe rat (od 6 do 48):");
            raty = agd.nextInt();
        } while (raty < 6 || raty > 48);

        double procent;
        if (raty <= 12) {
            procent = 0.025;
        } else if (raty <= 24) {
            procent = 0.05;
        } else {
            procent = 0.10;
        }

        double rata = (cena + (cena * procent)) / raty;
        System.out.println("Miesieczna rata wynosi: " + rata);

        // zad 11
        Scanner calc = new Scanner(System.in);
        System.out.println("Program kalkulator do wykonywania operacji +, -, *, / na dwoch liczbach.");

        System.out.println("Podaj pierwsza liczbe:");
        double kalk1 = calc.nextDouble();

        System.out.println("Podaj symbol operacji (+, -, *, /):");
        char op = calc.next().charAt(0);

        System.out.println("Podaj druga liczbe:");
        double kalk2 = calc.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Wynik: " + (kalk1 + kalk2));
                break;
            case '-':
                System.out.println("Wynik: " + (kalk1 - kalk2));
                break;
            case '*':
                System.out.println("Wynik: " + (kalk1 * kalk2));
                break;
            case '/':
                if (kalk2 == 0) {
                    System.out.println("Nie mozna dzielic przez zero");
                } else {
                    System.out.println("Wynik: " + (kalk1 / kalk2));
                }
                break;
            default:
                System.out.println("Bledny symbol operacji");
                break;
        }
    }
}