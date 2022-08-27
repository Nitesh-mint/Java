class Car{
    String brand;
    String color;
    int no_of_wheels;
    int no_of_doors;
    int price;
    float rating;

    void validate(){
        System.out.println("------Checking for Brand Name--------");
        if (brand == "Nissan"){
            System.out.println("The Brand is Authentic.Congratulations!");
        }
    }
}



public class carClass {
    public static void main(String args[]){
        //defining new car objects
        Car terrano = new Car();
        terrano.brand = "Nissan";
        terrano.color = "Black";
        terrano.no_of_wheels = 4;
        terrano.no_of_doors = 4;
        terrano.rating  = 9.7f;

        terrano.validate();
        
    }
}
