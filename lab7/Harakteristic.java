package lab7;

class Harakteristic extends Dog {
    private String name;
    public Harakteristic(String size,String colorWool,String breed, String name){
        super(size,colorWool,breed);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void getInfo(){
        System.out.println("Dog's breed is " + this.getBreed() + " ,name is " + this.getName() + " ,color of wool is " +
                this.getColorWool() + " ,and size is " + this.getSize());;
    }
}
