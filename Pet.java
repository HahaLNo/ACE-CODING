/**
    Pet class (complete comments)
    @author
    @since
*/
public class Pet
{
    private String name;
    private String age;
    private String weight;
    private String animal;
    private String breed; 

    public Pet(String initName, String initAge, String initWeight, String initAnimal, String initBreed){
        name = initName()
        age = initAge()
        weight = initWeight()
        animal = initAnimal()
        breed = initBreed()

    }
    
    public Pet(){
        name = "MaxyPoo"
        age = "69"
        weight = "179"
        animal = "dog"
        breed = "golden retriever"
    }

    public double getWeight();
    String name;

    public int getAge();
    public double getWeight();
    public String getAnimal();
    public String getBreed();

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    public double getWeight(){
        return weight;
    }

    public String getAnimal(){
        return animal;
    }
    public String getBreed(){
        return breed;
    }

    public void setName(String newName){
        name = newName;
    }
   // keep track of the name, age, weight, type of animal, and breed of the pet

   // Write 2 constructors and accessor (get) methods. Use good commenting.

   // Don't forget to complete the main method in the PetTesterClass below!
}
public class PetTesterClass
{
   // main method for testing
   public static void main(String[] args)
   {

    Pet Pet1 = new Pet(initName: "MaxyPoo", initAge: 69, initWeight: 179, initAnimal: "dog", initBreed: "Golden retriever");
      // Create 3 Pet objects and test all your methods

   }
}

