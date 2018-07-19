package days.fifth;

import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) {
        Person person = new Person("Algirdas", "Skrickus", 28,"Kaunas");
        /*person.setName("Algirdas");
        person.setSurname("Skrickus");
        person.setAge(28);
        person.setCity("Kaunas");*/


        System.out.println(person.getName());

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(new Person("Jonas", "Jonaitis", 54, "Pabrade"));

        prin(persons);


        }
    private static void prin(List<Person> persons) {
        for (Person p : persons) {
            System.out.println(p.getCity());
        }
    }
}
