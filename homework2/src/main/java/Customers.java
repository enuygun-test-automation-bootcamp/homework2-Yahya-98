import java.util.ArrayList;

public class Customers {

    public String firstName;
    public String lastName;
    public ArrayList<String> customerList = new ArrayList<>();
    public Customers(String firstName){

        this.firstName = firstName;
    }
    // Customer list
    public Customers(){
        customerList.add("Cierra");
        customerList.add("Alden");
        customerList.add("Kierra");
    }
}
