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
}
