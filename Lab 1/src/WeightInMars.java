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
		
		Person person1= new Person("Chris",65.6);
		Person person2= new Person("Mary",50.2);
		Person person3= new Person("Mark",78.3);
		
		
		
		System.out.println("Name:"  + person1.getName() + "\nWeight in Earth : " + person1.getWeightInEarth()+" kg" + 
				"\nWeight in Mars: "+ person1.WeightCalculator()+ " kg");
		System.out.println("\nName:"  + person2.getName() + "\nWeight in Earth : " + person2.getWeightInEarth()+" kg" + 
				"\nWeight in Mars: "+ person2.WeightCalculator()+ " kg");
		System.out.println("\nName:"  + person3.getName() + "\nWeight in Earth : " + person3.getWeightInEarth()+" kg" + 
				"\nWeight in Mars: "+ person3.WeightCalculator()+ " kg");

	}

}
