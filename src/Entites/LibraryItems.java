package Entites;

import Behaviours.Borrowable;

public class LibraryItems implements Borrowable {
    private String ID;
    private String Tittle;
    private boolean Status;

    public LibraryItems() {

    }

    public String getID() {

        return ID;
    }

    public void setID(String ID) {

        this.ID = ID;
    }

    public String getTittle() {

        return Tittle;
    }

    public void setTittle(String tittle) {

        Tittle = tittle;
    }

    public boolean isStatus() {

        return Status;
    }

    public void setStatus(boolean status) {

        Status = status;
    }

    public LibraryItems(String ID, String tittle, boolean status) {
        this.ID = ID;
        Tittle = tittle;
        Status = status;


    }


    @Override
    public String toString() {
        return "LibraryItems{" +
                "ID='" + ID + '\'' +
                ", Tittle='" + Tittle + '\'' +
                ", Status=" + Status +
                '}';
    }


    public void getDetails() {
        System.out.println("Item Title: " + getTittle());
        System.out.println("Item ID: " + getID());
    }
}
