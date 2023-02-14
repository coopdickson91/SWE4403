public class CustomerAdapter extends Person{

    private Customer customer;

    public CustomerAdapter(Customer customer){
        this.customer = customer;
    }

    public void setFullName(){
        String fullName = customer.getFirst() + " " + customer.getLast();
        super.setFullName(fullName);
    }

    

}