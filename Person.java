public class Person {
    // instance variables
    int age;
    String name;
    boolean hasBirthday;

    // methods
    void changeName(String n) {
        name = n;
    }

    void birthday() {
        age++;
    }
}