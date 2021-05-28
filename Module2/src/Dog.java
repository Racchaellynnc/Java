public class Dog extends Pet  {

    private int dogSpaceNbr;
    private double dogWeight;
    private String grooming;
    private String petType;

    // Constructor:
    
    public Dog(String petName, int petAge, int dayStay, double amountDue) {

        super(petName, petAge, dayStay, amountDue);

    }
    
    
    // Constructor:
    
    public Dog(int dogSpaceNbr, double dogWeight, String grooming, String petName, int petAge, int dayStay, double amountDue) {

        super(petName, petAge, dayStay, amountDue);

        this.dogSpaceNbr = dogSpaceNbr;
        this.dogWeight = dogWeight;
        this.grooming = grooming;

    }
    
      

    

    @Override
    public String toString() {
        super.toString();
        return "Dog{" + "dogSpaceNbr=" + dogSpaceNbr + ", dogWeight=" + dogWeight + ", grooming=" + grooming + ", petType=" + petType + '}';
    }
    
    
    // Setters and getters:
    
    public int getDogSpaceNbr() {
        return dogSpaceNbr;
    }

    public void setDogSpaceNbr(int dogSpaceNbr) {
        this.dogSpaceNbr = dogSpaceNbr;
    }

    public double getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    public String getGrooming() {
        return grooming;
    }

    public void setGrooming(String grooming) {
        this.grooming = grooming;
    }

}