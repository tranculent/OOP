public class David {
    public static void main (String [] args) {
        Person david = new Person();

        david.name = "David";
        david.age = 18;
        david.hasBirthday = true;

        System.out.println("Before change of name: " + david.name);
        david.changeName("Joe");
        System.out.println("After change of name: " + david.name);

        System.out.println("Before birthday: " + david.age);
        if(david.hasBirthday) {
            david.birthday(); // age++
        }
        System.out.println("After birthday: " + david.age);
        david.birthday();
        System.out.println("After birthday: " + david.age);
    }
}