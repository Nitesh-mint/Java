class Car{
    void model(String name){
    }
    int price(){
        return 5000000;
    }
}

class overriding extends Car {

    void model(String name){
        String Name = name;
        System.out.println(Name);
    }
    public static void main(String args[]){
        overriding BMW = new overriding();
        BMW.model("BMW");
        System.out.println(BMW.price());
    }
}
