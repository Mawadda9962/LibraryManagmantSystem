package Entites;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String libraryCode;
    private  String libraryName;
    List<Member> members = new ArrayList<>();
    List<LibraryItems> libraryItems = new ArrayList<>();

    public Library(String libraryCode, String libraryName, List<Member> members, List<LibraryItems> libraryItems) {
        this.libraryCode = libraryCode;
        this.libraryName = libraryName;
        this.members = members;
        this.libraryItems = libraryItems;
    }

    public String getLibraryCode() {
        return libraryCode;
    }

    public void setLibraryCode(String libraryCode) {
        this.libraryCode = libraryCode;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<LibraryItems> getLibraryItems() {
        return libraryItems;
    }

    public void setLibraryItems(List<LibraryItems> libraryItems) {
        this.libraryItems = libraryItems;
    }
}
