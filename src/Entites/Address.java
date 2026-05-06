package Entites;

public class Address {
    private String Street;
    private String City;
    private String postalCode;

    public Address(String street, String city, String postalCode) {
        Street = street;
        City = city;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", City='" + City + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
