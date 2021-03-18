/*
 * 
 * this class is to create person
 * 
 */
package Exercise7;

public class Person {

	//attribute 
		private String name;
		private double weightInEarth;
		private double weightInMars;

		//constructor
		public Person(String name, double weightInEarth) {

			this.name=name;
			this.weightInEarth=weightInEarth;

		}

		//setter 
		public void setName(String name) {

			this.name=name;

		}

		//getter
		public String getName() {

			return name;

		}

		//setter
		public void setWeightInEarth(double weightInEarth) {

			this.weightInEarth=weightInEarth;

		}

		//getter
		public double getWeightInEarth() {

			return weightInEarth;

		}

		public double WeightCalculator() {

			weightInMars=weightInEarth*0.38;
			return weightInMars;
		}
	
}
