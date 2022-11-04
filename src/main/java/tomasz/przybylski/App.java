package tomasz.przybylski;

public class App {

    public static void main(String[] args) {
        String[] years = {"2022/2023", "2033/2044", "LAST YEAR"};

        for (String each : years) {
            printMessage(each);
            System.out.println("---");
        }

    }

    static void printMessage(String year) {

        if("LAST YEAR".equals(year)){
            System.out.println("To niestety ostatni rok");
        } else {
            System.out.println("Witajcie uczniowie!");
            System.out.println("W nowym roku " + year);
            System.out.println("W roku " + year + " będzie wesoło");
        }


    }

}
