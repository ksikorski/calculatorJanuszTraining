
import java.util.Scanner;
import java.lang.String;


public class Main {

    /* Kalkulator wykonujący operacje:
     * dodawania, odejmowania, mnożenia, dzielenia.
     */

    public static void main(String[] args)
    {
        int liczbapierwsza;  // liczba, na której będziemy wykonywać operację
        int liczbadruga;     //  liczba, na której będziemy wykonywać operację
        char znak;           // zmienna przechowująca symbol operacji do wykonania
        Scanner odczyt = new Scanner(System.in);      // wczytywanie zmiennych
        System.out.println("Podaj pierwszą liczbę:"); // wyświetla opis
        // liczbapierwsza = odczyt.nextLine(); dla String liczbapierwsza coś nie wychodzi
        liczbapierwsza = odczyt.nextInt();            //odczyt pierwszej liczby
        System.out.println("Podaj drugą liczbę:");
        liczbadruga = odczyt.nextInt();               //odczyt drugiej liczby

        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");
        System.out.println("Dzielenie dwóch liczb - wciśnij /");


        znak = odczyt.next().charAt(0);  // odczyt znaku działania
        switch(znak)     // w zależności od wyboru wykonujemy daną operację
        {
            case '+':    // dodawanie dwóch liczb
            {
                System.out.println(liczbapierwsza + liczbadruga);
                break;
            }
            case '-':    // odejmowanie dwóch liczb
            {
                System.out.println(liczbapierwsza - liczbadruga);
                break;
            }
            case '*':    // mnożenie dwóch liczb
            {
                System.out.println(liczbapierwsza * liczbadruga);
                break;
            }
            case '/':   // sprawdzenie, czy druga zmienna nie jest zerem oraz
            {           // dzielenie dwóch zmiennych
                if(liczbadruga !=0) // wykonujemy jeśli liczba jest różna od zera
                {
                    System.out.println(liczbapierwsza / liczbadruga + "oraz reszty: " +
                            liczbapierwsza % liczbadruga);
                }
                else //wykonujemy jeśli druga liczba jest zerem
                {
                    System.out.println("Nie dzielimy przez zero!!!");
                }
                break;
            }


        }

    }
}