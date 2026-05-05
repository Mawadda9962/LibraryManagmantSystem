package Entites;

import Behaviours.Borrowable;

public class LibraryItems implements Borrowable {
    private String ID;
    private String Tittle;
    private boolean Status;

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
    public void checkOut() {
        if (!Status){
            System.out.println("Already Checked out!");
        }
    }

    @Override
    public void returnItem() {

    }
}
