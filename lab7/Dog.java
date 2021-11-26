package lab7;

public abstract class Dog {
    private String size;
    private String colorWool;
    private String breed;

    public Dog (String size, String colorWool, String breed){
        this.breed = breed;
        this.colorWool = colorWool;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getColorWool() {
        return colorWool;
    }

    public String getBreed() {
        return breed;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColorWool(String colorWool) {
        this.colorWool = colorWool;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public abstract void getInfo();
}
