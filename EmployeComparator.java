
import java.util.Comparator;

public class Employe {
	String firstName;
	String lastName;
	String middleInitial;
	int age;
	boolean status;
	
	public Employe(String firstName, String lastName,String middleInitial,
			int age, boolean status){
		this.firstName=firstName;
        this.lastName=lastName;
        this.middleInitial=middleInitial;
        this.age=age;
        this.status=status;
	}
	
	public static Comparator<Employe> NameComparator = new Comparator<Employe>(){
	
	public int compare(Employe e1,Employe e2){
			String EmpName1= e1.getEmpname().toUpperCase();
			String EmpName2= e2.getEmpname().toUpperCase();
			
		
			return EmpName1.compareTo(EmpName2);
			
		}

	
	};
	
	@Override
	
	public String toString(){
		return "[status=" +status+ ",firstName= " +firstName+",LastName= " +lastName+ ",MiddleInitial=" + middleInitial+",Age="+age+"]";
	}

	protected String getEmpname() {
		// TODO Auto-generated method stub
		return firstName;
	}

	}

	
	


