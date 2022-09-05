// SNHU IT 145
// Module 5 Milestone
// Driver.java
// Modifications: Jen Nadeau

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	// Create Scanner object
	private static Scanner scanner = new Scanner(System.in);
	
	// ArrayList for dogs
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)

    // ArrayList for monkeys
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
             
    public static void main(String[] args) {
    	
    	String menuChoice = ""; // local variable

        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
        // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        while (!menuChoice.equalsIgnoreCase("q")) {
        	displayMenu();
        	menuChoice = scanner.nextLine();	// Get menu choice from user
        	switch (menuChoice) {
        		case "1":
        			intakeNewDog(scanner);
        			break;
        		case "2":
        			intakeNewMonkey(scanner);
        			break;
        		case "3":
        			reserveAnimal(scanner);
        			break;
        		case "4":
        			printAnimals('4');
        			break;
        		case "5":
        			printAnimals('5');
        			break;
        		case "6":
        			printAnimals('6');
        			break;
        		default:
        			if(!menuChoice.equalsIgnoreCase("q")) {
        				System.out.println("Invalid input, please try again.");
        			}
        		break;
        	}
        }

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", true, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Bob", "2", "24.2", "20.2", "Capuchin", "Male", "4", "30", "05-05-2021", "United States", "in service", true, "United States");
    	Monkey monkey2 = new Monkey("Linda", "7", "25.7", "22.2", "Macaque", "Female", "5", "27", "09-03-2021", "United States", "intake", false, "United States");
    	Monkey monkey3 = new Monkey("Louise", "4", "20.3", "19.1", "Tamarin", "Female", "3", "10", "07-21-2021", "United States", "in service", false, "United States");
    
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog: dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; // returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        // Prompt and get dog's breed from user
        System.out.println("What is the new dog's breed?");
        String breed = scanner.nextLine();
            
        // Prompt and get dog's gender from user
        System.out.println("What is the new dog's gender?");
        String gender = scanner.nextLine();
            
        // Prompt and get dog's age from user
        System.out.println("What is the new dog's age?");
        String age = scanner.nextLine();
            
        // Prompt and get dog's weight from user
        System.out.println("What is the new dog's weight?");
        String weight = scanner.nextLine();
            
        // Prompt and get dog's acquisition date from user
        System.out.println("What is the new dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
            
        // Prompt and get dog's acquisition country from user
        System.out.println("What is the new dog's acquisition country?");
        String acquisitonCountry = scanner.nextLine();
            
        // Prompt and get dog's training status from user
        System.out.println("What is the new dog's training status (Phase I, Phase II, Phase III, Phase IV, Phase V, or in-service?");
        String trainingStatus = scanner.nextLine();
            
        // Prompt and get dog's reserved status from user
    	System.out.println("Is the new dog reserved? True or false?");
        boolean reserved = scanner.nextBoolean();
    	scanner.nextLine();
        
        // Prompt and get dog's in-service country
        System.out.println("What is the new dog's in service country?");
        String inServiceCountry = scanner.nextLine();
        
        // Create new dog object with all data for attributes/instance variables
        Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitonCountry, trainingStatus, reserved, inServiceCountry);
   
        // Add the new dog to the dog list
        dogList.add(dog);
        System.out.println("Dog has been added to system.");
        
    }

    // Complete intakeNewMonkey
    // Instantiate and add the new monkey to the appropriate list
    // For the project submission you must also  validate the input
    // to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        // Prompt and get monkey's name from user
        System.out.println("What is the new monkey's name?");
        String name = scanner.nextLine();
            
        // Input validation to make sure monkey is not already in system
        for (Monkey monkey: monkeyList) {
        	if (monkey.getName().equalsIgnoreCase(name)) {
        		System.out.println("\n\nThis monkey is already in our system.\n\n");
        		return; // returns to menu
            }
        }
            
        // Prompt and get monkey's tail length from user
        System.out.println("What is the new monkey's tail length?");
        String tailLength = scanner.nextLine();
            
        // Prompt and get monkey's height from user
        System.out.println("What is the new monkey's height?");
        String height = scanner.nextLine();
            
        // Prompt and get monkey's body length from user
        System.out.println("What is the new monkey's body length?");
        String bodyLength = scanner.nextLine();
            
        // Prompt and get monkey's species from user
        System.out.println("What is the new monkey's species?");
        String species = scanner.nextLine();
        
        // Input validation for species type
        while (!(Arrays.asList("Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin").contains(species))) {
        	System.out.println("Ineligible monkey species. Eligible monkey species: Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin");
        	System.out.println("Enter an eligible monkey species: ");
        	species = scanner.nextLine();
        }      
      
        // Prompt and get monkey's gender from user
        System.out.println("What is the new monkey's gender?");
        String gender = scanner.nextLine();
            
        // Prompt and get monkey's age from user
        System.out.println("What is the new monkey's age?");
        String age = scanner.nextLine();
            
        // Prompt and get monkey's weight from user
        System.out.println("What is the new monkey's weight?");
        String weight = scanner.nextLine();
            
        // Prompt and get monkey's acquisition date from user
        System.out.println("What is the new monkey's acquisition date?");
        String acquisitionDate = scanner.nextLine();
            
        // Prompt and get monkey's acquisition country from user
        System.out.println("What is the new monkey's acquisition country?");
        String acquisitonCountry = scanner.nextLine();
            
        // Prompt and get monkey's training status from user
        System.out.println("What is the new monkey's training status (Phase I, Phase II, Phase III, Phase IV, Phase V, or in-service?");
        String trainingStatus = scanner.nextLine();  
            
        // Prompt and get monkey's reserved status from user 
        System.out.println("Is the new dog reserved? True or false?");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine();
    	
    	// Prompt and get monkey's in-service country
        System.out.println("What is the new monkey's in service country?");
        String inServiceCountry = scanner.nextLine();
        
        // Create new monkey object with all data for attributes/instance variables
        Monkey monkey = new Monkey(name, tailLength, height, bodyLength, species, gender, age, weight, acquisitionDate, acquisitonCountry, trainingStatus, reserved, inServiceCountry);
   
        // Add the new monkey to the monkey list
        monkeyList.add(monkey);
        System.out.println("Monkey has been added to system.");
    } 
        

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        // Prompt user for animal type and in service country
    	System.out.println("What is the animal type? Dog or Monkey?");
    	String animalType = scanner.nextLine();   	
    	System.out.println("What is the animal's in service country?");
        String inServiceCountry = scanner.nextLine();
        
        // Check for Monkey availability and reserve first available
        boolean reservation = false;
        if (animalType.equalsIgnoreCase("Monkey")) {    	
        	for (Monkey monkey: monkeyList) {
        		if (monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && monkey.getReserved() == false && monkey.getTrainingStatus() == "in service") {
        			monkey.setReserved(true);
        			System.out.println("You have reserved " + monkey.toString());
        			reservation = true;
        			return;
        		}      	
        	}
        	if (reservation == false) {
        		System.out.println("No Monkey is available to reserve at this service location.");
        	}
        }
        
        // Check for Dog availability and reserve first available
        if (animalType.equalsIgnoreCase("Dog")) { 
        	for (Dog dog: dogList) {
        		if (dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && dog.getReserved() == false && dog.getTrainingStatus() == "in service") {
        			dog.setReserved(true);
        			System.out.println("You have reserved " + dog.toString());
        			reservation = true;
        			return;
        		}     		
        	}
        	if (reservation == false) {
        		System.out.println("No Dog is available to reserve at this service location.");
        	}
        }
        else {
        	System.out.println("Invalid Animal Type. Please reselect from main menu.");
        }
    }

    // Complete printAnimals
    // Include the animal name, status, acquisition country and if the animal is reserved.
    // Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved 
    // Remember that you only have to fully implement ONE of these lists. 
    // The other lists can have a print statement saying "This option needs to be implemented".
    // To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals(char menuChoice) {
        // Prints list of all dogs
    	if (menuChoice == '4') {
        	for (int i = 0; i < dogList.size(); i++) {
        		System.out.println(dogList.get(i).toString());
        	}
        }
    	
    	// Prints list of all monkeys
        else if (menuChoice == '5') {
        	for (int i = 0; i < monkeyList.size(); i++) {
        		System.out.println(monkeyList.get(i).toString());
        	}
        }
    	
    	// Prints a list of all animals that are in service and not reserved
        else if (menuChoice == '6') {
            // Iterates through dog list to find dogs who are in service and available
            for (int i = 0; i < dogList.size(); i++) {
            	if (dogList.get(i).getTrainingStatus().equals("in service") && dogList.get(i).getReserved()== false) {
                    // Prints dogs that are in service and available
                    System.out.println(dogList.get(i).toString());
                }
            
            }
            // Iterates through monkey list to find monkeys who are in service and available
            for (int i = 0; i < monkeyList.size(); i++) {
                if (monkeyList.get(i).getTrainingStatus().equalsIgnoreCase("in service") && monkeyList.get(i).getReserved()== false) {
                    // Prints monkeys that are in service and available
                    System.out.println(monkeyList.get(i));
                }
            }
        }
    }
}