
class Employee implements Comparable<Employee> {
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
    
    public String getFirstName(){
    	return firstName;
    }
    
    public void setFirstName(String firstName){
    	this.firstName= firstName;
    }
    
    public String getLastName(){
    	return lastName;
    }
    
    public void setLastName(String lastName){
    	this.lastName= lastName;
    }
    
    public String getMiddleInitial(){
    	return middleInitial;
    }
    
    public void setMiddleInitial(String middleInitial){
    	this.middleInitial= middleInitial;
    }
    
    public int getAge(){
    	return age;
    }
    
    public void setAge(int age){
    	this.age= age;
    }
    
    public boolean getStatus(){
    	return status;
    }
    
    public void setStatus(boolean status){
    	this.status= status;
    }
  
    public int compareTo(Employee compareEmployee) {
        int compareAge = ((Employee) compareEmployee).getAge();
        return this.age - compareAge;

    }
}

	
		
	
 

