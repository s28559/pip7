import java.util.Scanner;

public class SecretStudent {

    private String name = "default Secret name";
    private String surname = "default Secret surname";
    private int index = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Imię nie może być puste");
        } else {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.isEmpty()) {
            System.out.println("Nazwisko nie może być puste");
        } else {
            this.surname = surname;
        }

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void readFromScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        this.name = sc.nextLine();
        System.out.println("Podaj swoje nazwisko");
        this.surname = sc.nextLine();
        System.out.println("Podaj numer indexu");
        this.index = sc.nextInt();
    }

    public void print() {
        System.out.println(name + " " + surname + " " +"s"+index);
    }

}