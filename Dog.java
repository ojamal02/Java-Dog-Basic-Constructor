// importing the Scanner so it can be used to collect input
import java.util.*;

public class Dog {

// establishing basic instance variables for class
  String name;
  int age;
  boolean trained;

// Dog constructor that takes in a String, int, and boolean and sets those to the instance variables for the class    
  public Dog(String name,int age,boolean trained){
    this.name = name;
    this.age = age;
    this.trained = trained;
  }
    
  public static void main(String[] args){
     
// Creating a scanner object to collect user input
    Scanner scan = new Scanner(System.in);
      
// Setting up variables to store user input 
    String nameInput;
    int ageInput;
    boolean trainedInput;

 // Collecting user input and assigning it to the variables established above
    System.out.println("<=====================>");
    System.out.println("enter dog's name");
    nameInput = scan.next();
    System.out.println("enter dog's age");
    ageInput = scan.nextInt();
    System.out.println("enter if your dog is trained (true or false)");
    trainedInput = scan.nextBoolean();
      
 // Calling the Dog constructor and using input storage variables as constructor arguments
    System.out.println("<========================>");
    Dog myDog = new Dog(nameInput,ageInput,trainedInput);
    System.out.println("Your dog is named " + myDog.name);
    System.out.println("Your dog is " + myDog.age + " years old");
    System.out.println("Your dog is trained? " + myDog.trained);
      
  // Closing Scanner object since it is no longer needed
    scan.close();
    
  }
}
