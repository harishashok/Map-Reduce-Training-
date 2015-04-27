import java.util.Arrays;

public class SortEmployeeName {

	public static void main(String args[]){
		Employee[] employees = new Employee[5];
		
		Employee emp1= new Employee("Vin", "Diesel","A",10,true);
		Employee emp2 = new Employee("Tom","Cruise","B",45,true);
        Employee emp3 = new Employee("Paul","Walker","C",20,false);
        Employee emp4 = new Employee("Chris","Kyle","D",60,true);
        Employee emp5 = new Employee("Robert","Kent","E",75,false);
        
        employees[0]= emp1;
        employees[1]= emp2;
        employees[2]= emp3;
        employees[3]= emp4;
        employees[4]= emp5;
        
        Arrays.sort(employees);

        for(Employee temp: employees){
        //System.out.println(temp.status + ", " + temp.firstName+"," + temp.lastName+","+temp.middleInitial+","+temp.age );    
        //System.out.println("employees" + ":" + temp);
        	System.out.println("Employees" + ":"+ temp.getFirstName()+","+temp.getLastName()+","+temp.getMiddleInitial()+","+temp.getAge()+","+temp.getStatus());
        }
	}
	
}
