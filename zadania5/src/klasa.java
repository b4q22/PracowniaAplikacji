final class klasa {
    klasa() {
    }

    static int wiek() {
        return 18;
    }
    static String imie() {
        return "Oskar";
    }
    static void oblicz(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
    }

    static boolean parzysta(int a) {
        return a % 2 == 0;
    }

    static boolean podzielna(int a) {
        return a % 3 == 0 && a % 5 == 0;
    }

    static int potega(int a) {
        return a * a * a;
    }

    static double pierwiastek(double a) {
        return Math.sqrt(a);
    }

    static boolean trojkat(int a, int b, int c) {
        if (a * a == b * b + c * c) {
            return true;
        } else if (b * b == a * a + c * c) {
            return true;
        } else {
            return c * c == a * a + b * b;
        }
    }

    static char ostatni(String tekst) {
        return tekst.charAt(tekst.length() - 1);
    }

    static int suma(int[] tablica) {
        int suma = 0;

        for(int i = 0; i < tablica.length; ++i) {
            suma += tablica[i];
        }

        return suma;
    }

    static int zlicz(String tekst, char znak) {
        int licznik = 0;

        for(int i = 0; i < tekst.length(); ++i) {
            if (tekst.charAt(i) == znak) {
                ++licznik;
            }
        }

        return licznik;
    }

    void main() {
        System.out.println(wiek());
        System.out.println(imie());
        oblicz(10, 5);
        System.out.println(parzysta(4));
        System.out.println(podzielna(15));
        System.out.println(potega(3));
        System.out.println(pierwiastek((double)25.0F));
        System.out.println(trojkat(3, 4, 5));
        System.out.println(ostatni("Witaj"));
        int[] tablica = new int[]{1, 7, 20, 100};
        System.out.println(suma(tablica));
        System.out.println(zlicz("Ala ma kota", 'a'));
    }
}
