
public class dogInfo {                         
		   public String name;
		   private int weight;
		   private Boolean grooming;
		   private int spaceNumber;
		   
		   public String getName() {  // Accessor
			  return name;
		   }

		   public void setName(String dogName) {  // Mutator
		      name = dogName;
		   }
		   
		   public void getDogSpaceNumber() {  // Accessor
			  spaceNumber = 0;
		   }

		   public void setDogSpaceNumber(int dogSpaceNumber) {  // Mutator
			  spaceNumber = dogSpaceNumber;
		   }

		   public int getWeight() {  // Accessor
		      return 0;
		   }

		   public void setWeight(int dogWeight) {       // Mutator
			  weight = dogWeight;
		   }
		   
		   public void getGrooming() {  // Accessor
			  grooming = false;
		   }

		   public void setGrooming(Boolean dogGrooming) {       // Mutator
			  grooming = dogGrooming;
		   }
		   public void print() {
			      System.out.println("Full name: " + name);
			      System.out.println("Space number: " + spaceNumber);
			      System.out.println("Weight: " + weight);
			      System.out.println("Grooming: " + grooming);
			   }

}
