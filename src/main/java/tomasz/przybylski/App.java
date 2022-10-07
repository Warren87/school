package tomasz.przybylski;

public class App {

    public static void main(String[] args) {
        String[] years = {"2022/2023",
                "2567/1000",
                "2023/2024",
                "LAST YEAR!!!"};

        for (int i = 0; i < years.length; i++) {
            System.out.println(i);
            printMessage(years[i]);
        }
    }

    static void printMessage(String year) {

        System.out.println("Witajcie uczniowie!");
        System.out.println("W nowym roku " + year);
        System.out.println("W roku " + year + " będzie wesoło");
    }

}
