public class PersonAdapter extends Customer{

    private Person person;

    public PersonAdapter(Person person){
        this.person = person;
    }

    public String getFirst(){
        return person.getFullName().split(" ")[0];
    }

    public String getLast(){
        return person.getFullName().split(" ")[1];
    }

    public String getFullName(){
        return getLast() + " " + getFirst();
        // super.setFullName(getLast(), getFirst());
    }

    @Override
    public String toString() {
      return "Customer [last name= " + getLast() + " first name= " + getFirst() + "]";
   }

    

    

}