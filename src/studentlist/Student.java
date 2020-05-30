package studentlist;

/**
 * This class represents Students in our application
 *
 * @author Sarthak Wadhawan may2020
 */
public class Student {
    
    private String name;
    private String address; 

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress(){
        return address; 
}
}

