import java.io.Serializable;

public final class Address implements Serializable {

    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private int apartmentNumber;

    public final static Address UNKNOWN_ADDRESS = new Address();

    public Address() {

    }

    public Address(
            String cityName,
            int zipCode,
            String streetName,
            int buildingNumber,
            char buildingLetter,
            int apartmentNumber
    ) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", zipCode=" + zipCode +
                ", streetName='" + streetName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", buildingLetter=" + buildingLetter +
                ", apartmentNumber=" + apartmentNumber +
                '}';
    }
}