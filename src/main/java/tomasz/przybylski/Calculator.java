package tomasz.przybylski;

public class Calculator {

    static int absoluteNumber(int n) {
        return Math.abs(n);
    }

    public static void main(String[] args) {
        int wynik = absoluteNumber(-20);
        System.out.println(wynik);
    }

}
