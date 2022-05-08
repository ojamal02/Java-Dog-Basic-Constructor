import java.util.*;

public class Dog {

    String name;
  int age;
  boolean trained;

  public Dog(String name,int age,boolean trained){
    this.name = name;
    this.age = age;
    this.trained = trained;
  }
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String nameInput;
    int ageInput;
    boolean trainedInput;

    System.out.println("<=====================>");
    System.out.println("enter dog's name");
    nameInput = scan.next();
    System.out.println("enter dog's age");
    ageInput = scan.nextInt();
    System.out.println("enter if your dog is trained (true or false)");
    trainedInput = scan.nextBoolean();
    System.out.println("<========================>");
    Dog myDog = new Dog(nameInput,ageInput,trainedInput);
    System.out.println("Your dog is named " + myDog.name);
    System.out.println("Your dog is " + myDog.age + " years old");
    System.out.println("Your dog is trained? " + myDog.trained);
    scan.close();
    
  }
}