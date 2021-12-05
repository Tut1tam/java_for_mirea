import java.io.Serializable;

public final class Customer implements Serializable {

    private String firstName;
    private String secondName;
    private int age;
    private Address address;

    public final static Customer MATURE_UNKNOWN_CUSTOMER = new Customer(null, null, 21, null);
    public final static Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer(null, null, 0, null);

    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public boolean isMature() {
        return age >= 21;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}