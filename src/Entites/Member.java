package Entites;

import java.util.List;

public class Member {
    private String ID;
    private String name;
    private Address address;
    private List borrowItem;

    public Member(String ID, String name, Address address, List borrowItem) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.borrowItem = borrowItem;
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

    public List getBorrowItem() {
        return borrowItem;
    }

    public void setBorrowItem(List borrowItem) {
        this.borrowItem = borrowItem;
    }

    @Override
    public String toString() {
        return "Member{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", borrowItem=" + borrowItem +
                '}';
    }
}
