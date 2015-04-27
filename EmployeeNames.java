import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
class Employee implements Comparable<Object> {
    String firstName;
    String lastName;
    String middleInitial;
    int age;
    boolean status;

     
    public Employee(String firstName, String lastName,String middleInitial,
int age, boolean status ) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.middleInitial=middleInitial;
        this.age=age;
        this.status=status;
    }

    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee)o; 
        return this.age-emp.age;
        	
    }
}
