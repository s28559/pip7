public class Main {
    public static void main(String args[]) {
        //zad1
        Student st = new Student();
        Student st1 = new Student();

        st.name = "Wiktoria Lasek";
        System.out.println(st1.name + ", " + st.name);
        st.index = 28559;
        System.out.println(st.name + ", " + " index: " + "" + st.index);

        //zad2
        SecretStudent sct = new SecretStudent();
        System.out.println(sct.getName());
        System.out.println(sct.getSurname());
        System.out.println(sct.getIndex());

        //zad3

        sct.setName("Wiktoria");
        sct.setSurname("Lasek");
        sct.setIndex(28559);
        System.out.println(sct.getName());
        System.out.println(sct.getSurname());
        System.out.println(sct.getIndex());
        System.out.println();

        //zad4

        SecretStudent sct1 = new SecretStudent();
        SecretStudent sct2 = new SecretStudent();
        sct1.readFromScanner();
        sct1.print();
        System.out.println();
        sct2.readFromScanner();
        sct2.print();


    }

}
