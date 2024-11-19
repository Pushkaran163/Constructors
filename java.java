public class  java{
    String model;
    int year;

    java(String model, int year){
        this.model = model;
        this.year = year;
    }

    public void displayDetails(){
        System.out.println("Model: " + this.model + ", Year: " + this.year);
    }

    public static void main(String[] args){
        java car1 = new java("abc", 1234);
        car1.displayDetails();
    }
}