package class_person;

public class PersonMain {
    public static void main(String[] args) {
        System.out.println("****Class Person****");

        var person = new Person("John", "Doe");
        person.showPerson();

        System.out.println("Name: " + person.getName());
        System.out.println("Last Name: " + person.getLastName());

        person.setName("Jane");
        person.setLastName("Doe");

        System.out.println("Name: " + person.getName());
        System.out.println("Last Name: " + person.getLastName());
    }
}
