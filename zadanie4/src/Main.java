import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // zad 1
        int[] tabParzysta = {2, 4, 6, 8};
        int[] tabNieparzysta = {1, 3, 5, 7, 9};

        System.out.println("Co drugi element pierwszej tablicy:");
        for (int i = 0; i < tabParzysta.length; i += 2) {
            System.out.println(tabParzysta[i]);
        }

        System.out.println("Co drugi element drugiej tablicy:");
        for (int i = 0; i < tabNieparzysta.length; i += 2) {
            System.out.println(tabNieparzysta[i]);
        }

        // zad 2
        int[] tabLiczb = {15, 8, 42, 4, 23, 16};
        int max = tabLiczb[0];
        for (int i = 1; i < tabLiczb.length; i++) {
            if (tabLiczb[i] > max) {
                max = tabLiczb[i];
            }
        }
        System.out.println("Najwieksza liczba w tablicy to: " + max);

        // zad 3
        String[] slowaTab = {"java", "programowanie", "komputer"};
        for (String s : slowaTab) {
            System.out.println(s.toUpperCase());
        }

        // zad 4
        String[] slowaPiec = new String[5];
        System.out.println("Podaj 5 slow:");
        for (int i = 0; i < 5; i++) {
            slowaPiec[i] = sc.next();
        }
        for (int i = 4; i >= 0; i--) {
            String slowo = slowaPiec[i];
            String odwrocone = "";
            for (int j = slowo.length() - 1; j >= 0; j--) {
                odwrocone += slowo.charAt(j);
            }
            System.out.println(odwrocone);
        }

        // zad 5
        int[] liczbyZad5 = new int[8];
        System.out.println("Podaj 8 liczb:");
        for (int i = 0; i < 8; i++) {
            liczbyZad5[i] = sc.nextInt();
        }
        for (int i = 0; i < liczbyZad5.length - 1; i++) {
            for (int j = 0; j < liczbyZad5.length - 1 - i; j++) {
                if (liczbyZad5[j] > liczbyZad5[j + 1]) {
                    int temp = liczbyZad5[j];
                    liczbyZad5[j] = liczbyZad5[j + 1];
                    liczbyZad5[j + 1] = temp;
                }
            }
        }
        System.out.print("Posortowana tablica: ");
        for (int i = 0; i < liczbyZad5.length; i++) {
            System.out.print(liczbyZad5[i] + (i < liczbyZad5.length - 1 ? ", " : ""));
        }
        System.out.println();

        // zad 6
        int[] liczbyZad6 = new int[5];
        System.out.println("Podaj 5 liczb do silni:");
        for (int i = 0; i < 5; i++) {
            liczbyZad6[i] = sc.nextInt();
        }
        for (int l : liczbyZad6) {
            long silnia = 1;
            for (int i = 1; i <= l; i++) {
                silnia *= i;
            }
            System.out.println("Silnia z " + l + " wynosi: " + silnia);
        }

        // zad 7
        String[] t1 = {"kot", "pies", "dom"};
        String[] t2 = {"kot", "pies", "dom"};
        boolean takieSame = true;
        if (t1.length != t2.length) {
            takieSame = false;
        } else {
            for (int i = 0; i < t1.length; i++) {
                if (!t1[i].equals(t2[i])) {
                    takieSame = false;
                    break;
                }
            }
        }
        if (takieSame) {
            System.out.println("Tablice sa takie same");
        } else {
            System.out.println("Tablice nie sa takie same");
        }

        // zad 8
        int[] tab8 = new int[10];
        for (int i = 0; i < tab8.length; i++) {
            tab8[i] = (int) (Math.random() * 21) - 10;
        }
        System.out.print("Zawartosc tablicy: ");
        for (int i = 0; i < tab8.length; i++) {
            System.out.print(tab8[i] + " ");
        }
        System.out.println();

        int min8 = tab8[0];
        int max8 = tab8[0];
        int suma8 = 0;
        for (int i = 0; i < tab8.length; i++) {
            if (tab8[i] < min8) min8 = tab8[i];
            if (tab8[i] > max8) max8 = tab8[i];
            suma8 += tab8[i];
        }
        double srednia8 = (double) suma8 / tab8.length;

        int mniejsze = 0;
        int wieksze = 0;
        for (int i = 0; i < tab8.length; i++) {
            if (tab8[i] < srednia8) mniejsze++;
            if (tab8[i] > srednia8) wieksze++;
        }

        System.out.println("Najmniejszy element: " + min8);
        System.out.println("Najwiekszy element: " + max8);
        System.out.println("Srednia arytmetyczna: " + srednia8);
        System.out.println("Mniejszych od sredniej: " + mniejsze);
        System.out.println("Wiekszych od sredniej: " + wieksze);

        System.out.print("Tablica w odwrotnej kolejnosci: ");
        for (int i = tab8.length - 1; i >= 0; i--) {
            System.out.print(tab8[i] + " ");
        }
        System.out.println();

        // zad 9
        int[] tab9 = new int[20];
        for (int i = 0; i < tab9.length; i++) {
            tab9[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.print("Wylosowana tablica: ");
        for (int i = 0; i < tab9.length; i++) {
            System.out.print(tab9[i] + " ");
        }
        System.out.println();

        for (int num = 1; num <= 10; num++) {
            int licznik = 0;
            for (int i = 0; i < tab9.length; i++) {
                if (tab9[i] == num) {
                    licznik++;
                }
            }
            System.out.println("Liczba " + num + " powtarza sie " + licznik + " razy.");
        }
    }
}