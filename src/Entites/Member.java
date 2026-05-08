package Entites;

import java.util.List;

public class Member {
    private String ID;
    private String name;
    private Address address;

    public Member(String ID, String name, Address address) {
        this.ID = ID;
        this.name = name;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "Member{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
