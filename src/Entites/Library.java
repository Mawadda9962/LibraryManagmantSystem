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


}
