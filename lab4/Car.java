package lab4;

class Car implements Nameable{
    private String model;
    private String number;
    public Car(String model, String number){
        this.model=model;
        this.number=number;
    }
    public String getName(){
        return this.model + ' ' + this.number;
    }
}
