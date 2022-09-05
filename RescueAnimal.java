// SNHU IT 145
// Module 5 Milestone
// RescueAnimal.java
// Modifications: Jen Nadeau

import java.lang.String;

public class RescueAnimal {

    // Instance variables
    protected String name;
    protected String animalType;
    protected String gender;
    protected String age;
    protected String weight;
    protected String acquisitionDate;
    protected String acquisitionCountry;
    protected String trainingStatus;
    protected boolean reserved;
    protected String inServiceCountry;

    // Constructor
    public RescueAnimal() {
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}

	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}

	public boolean getReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public String getInServiceLocation() {
		return inServiceCountry;
	}

	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

	public String getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
}
