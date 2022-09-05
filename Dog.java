// Jen Nadeau
// SNHU IT 145
// Module 5 Milestone
// Dog.java inherits from RescueAnimal
// Modifications: Jen Nadeau

public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "; Breed: " + breed + "; Gender: " + gender + "; Age: " + age + "; Weight: " + weight + "; Acquisition Date: " + acquisitionDate + "; Acquisition Country: " + acquisitionCountry + "; Training Status: " + trainingStatus + "; Reserved: " + reserved + "; In-service Country: " + inServiceCountry; 
    }
}
