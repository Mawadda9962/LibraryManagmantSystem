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
}
