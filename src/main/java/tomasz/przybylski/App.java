package tomasz.przybylski;

public class App {

    public static void main(String[] args) {
        String[] years = {"2022/2023", "HBBBSAJHS"};

        for (int i = 0; i < years.length; i++) {
            printMessage(i + " " + years[i]);
            System.out.println("-----");
        }
    }

    static void printMessage(String year) {

        System.out.println("Witajcie uczniowie!");
        System.out.println("W nowym roku " + year);
        System.out.println("W roku " + year + " będzie wesoło");
    }

}
