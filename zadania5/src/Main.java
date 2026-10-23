void main() {
    System.out.println("wiek " + pobierzWiek());
    System.out.println("imię " + pobierzImie());
    dzialania(20, 5);
    System.out.println("czy 4 jest parzysta " + czyParzysta(4));
    System.out.println("czy 15 jest podzielna przez 3 i 5 " + czyPodzielnaPrzez3i5(15));
    System.out.println("2 do potęgi 3 " + doPotegiTrzeciej(2));
    System.out.println("pierwiastek z 16 " + pierwiastekKwadratowy(16));
    System.out.println("czy trójkąt prostokątny (3, 4, 5) " + czyTrojkatProstokatny(3, 4, 5));
    System.out.println("ostatni znak w 'witaj' " + ostatniZnak("witaj"));
    System.out.println("czy 'kajak' to palindrom " + czyPalindrom("kajak"));
    int[] tablica = {1, 7, 20, 100};
    System.out.println("Suma tablicy " + sumaTablicy(tablica));
    int liczbaLiterA = zliczWystapienia("Ala ma kota", 'a');
    System.out.println("Liczba liter 'a' " + liczbaLiterA);
}

// Zadanie 1
public int pobierzWiek() {
    return 19;
}

// Zadanie 2
public String pobierzImie() {
    return "Oskar";
}

// Zadanie 3
public void dzialania(double a, double b) {
    System.out.println("suma " + (a + b));
    System.out.println("różnica " + (a - b));
    System.out.println("iloczyn " + (a * b));
}

// Zadanie 4
public boolean czyParzysta(int liczba) {
    return liczba % 2 == 0;
}

// Zadanie 5
public boolean czyPodzielnaPrzez3i5(int liczba) {
    return liczba % 3 == 0 && liczba % 5 == 0;
}

// Zadanie 6
public double doPotegiTrzeciej(double liczba) {
    return Math.pow(liczba, 3);
}

// Zadanie 7
public double pierwiastekKwadratowy(double liczba) {
    return Math.sqrt(liczba);
}

// Zadanie 8
public boolean czyTrojkatProstokatny(double a, double b, double c) {
    double a2 = a * a;
    double b2 = b * b;
    double c2 = c * c;

    return (a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2);
}

// Zadanie 9
public char ostatniZnak(String teksty) {
    return teksty.charAt(teksty.length() - 1);
}

// Zadanie 10
public boolean czyPalindrom(String tekst) {
    String czysty = tekst.toLowerCase();
    String odwrocony = new StringBuilder(czysty).reverse().toString();
    return czysty.equals(odwrocony);
}

// Zadanie 11
public int sumaTablicy(int[] tablica) {
    int suma = 0;
    for (int liczba : tablica) {
        suma += liczba;
    }
    return suma;
}

// Zadanie 12
public int zliczWystapienia(String tekst, char znak) {
    int licznik = 0;
    for (int i = 0; i < tekst.length(); i++) {
        if (tekst.charAt(i) == znak) {
            licznik++;
        }
    }
    return licznik;
}