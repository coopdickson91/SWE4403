public class Customer{
    
    private String fname;
    private String lname;

    public Customer(){};

    public Customer(String lname, String fname){
        this.lname = lname;
        this.fname = fname;
    }

    public String getLast(){
        return lname;
    }

    public String getFirst(){
        return fname;
    }

    @Override
    public String toString() {
      return "Customer [last name= " + lname + " first name= " + fname + "]";
   }

    public void setFullName(String lname, String fname){
        this.lname = lname;
        this.fname = fname;
    }

    public String getFullName(){
        return lname + " " + fname;
    }


}