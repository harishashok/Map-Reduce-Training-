import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee("Vin", "Diesel","A",10,true);
        Employee emp2 = new Employee("Tom","Cruise","B",45,true);
        Employee emp3 = new Employee("Paul","Walker","C",20,false);
        Employee emp4 = new Employee("Chris","Kyle","D",60,true);
        Employee emp5 = new Employee("Robert","Kent","E",75,false);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
       
        
        Collections.sort(employees);
         
        for (Employee employee : employees) {
            System.out.println(employee.status + ", " + employee.firstName+"," + employee.lastName+","+employee.middleInitial+","+employee.age );
        }
    }
}
