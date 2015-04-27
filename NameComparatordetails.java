import java.util.*;


public class NameDetails {
	
	public static void main(String args[]){
		ArrayList<Employe> arraylist = new ArrayList<Employe>();
		
		arraylist.add(new Employe("Vin", "Diesel","A",10,true));

		arraylist.add(new Employe("Tom","Cruise","B",45,true));

		arraylist.add(new Employe("Paul","Walker","C",20,false));

		arraylist.add(new Employe("Chris","Kyle","D",60,true));

		arraylist.add(new Employe("Robert","Kent","E",75,false));
		
		System.out.println("Employee name sort:");
		Collections.sort(arraylist,Employe.NameComparator);
		
		for(Employe str:arraylist){
			System.out.println(str);
		}
	}

}
