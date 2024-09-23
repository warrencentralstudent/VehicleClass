class Main {

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle("Ford", "Fusion");
        System.out.println(myCar.getMake());
        myCar.setMake("Chevy");
        System.out.println(myCar.getMake());
    }
}

class Vehicle {
    //POJO:  Plain Old Java Object
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

   public String getModel() {
        return model;
   }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

}
