/**
 * 
 */
package com.wipro.java.oops;

/** no constructors
 * getters have a return value
 * setters don't have a return value
 * properties are determined using private fields
 * values are behaviors are determined through setters
 */
//POJO:plain old java object access thru getter/setter


public class Animal {
	
	    private String name; //name of the animal
	    private String species; //Species or type of the animal
	    private int age;  // Age of the animal in years
	    private float weight;  // Weight of the animal
	    private int size;  //size of the animal
	    
	   

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(float weight) {
			this.weight = weight;
		}
		
		 public int getSize() {
				return size;
			}

			public void setSize(int size) {
				this.size = size;
			}

		

	/**
	 * 
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
