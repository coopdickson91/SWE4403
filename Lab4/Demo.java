import java.util.ArrayList;

public class Demo{
    public static void main(String args[]){

        //add Persons to list
        ArrayList<Person> people = new ArrayList<Person>();

        Person person1 = new Person("Cooper Dickson");
        Person person2 = new Person("Ethan Riddell");

        people.add(person1);
        people.add(person2);

        ArrayList<Customer> customers = new ArrayList<Customer>();


        for(int i = 0; i<people.size(); i++){
            customers.add(new PersonAdapter(people.get(i)));
        
        }

        for(int i = 0; i < customers.size(); i++){
            System.out.println(customers.get(i).getFullName());
        }

        // PersonAdapter personAdapter1 = new PersonAdapter(person1);
        // PersonAdapter personAdapter2 = new PersonAdapter(person2);

        // personAdapter1.setFullName();

        // System.out.println(personAdapter1.toString());
    }
        
}