package tomasz.przybylski;

public class Employee {

    String firstName;

    String lastName;

    String position;

    public Employee(String firstName,String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String fullInfo(){
        return firstName + " " + lastName + " " + position;
    }

    @Override
    public String toString() {
        return fullInfo();
    }
}
