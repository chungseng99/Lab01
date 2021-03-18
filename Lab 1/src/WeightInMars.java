import java.util.ArrayList;
import java.util.List;

/*
 * 
 * this class is to calculate weight of a person in mars
 * 
 */
public class WeightInMars {

	/*
	 * Main entry point of program
	 */
	public static void main(String[] args) {
		List<Person> person = new ArrayList<Person>();
		
		//object declaration
		person.add(new Person("Chris",65.6));
		person.add(new Person("Mary",50.2));
		person.add(new Person("Mark",78.3));
		
		
		//print output
		for(Person currentPerson:person) {
		System.out.println("\nName:"  + currentPerson.getName() + "\nWeight in Earth : " + currentPerson.getWeightInEarth()+" kg" + 
				"\nWeight in Mars: "+ currentPerson.WeightCalculator()+ " kg");
		}

	}

}
