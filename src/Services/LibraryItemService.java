package Services;

import Entites.Books;
import Entites.LibraryItems;
import Entites.Magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryItemService extends LibraryItems{
    static List<LibraryItems> LibraryItems = new ArrayList<>();
    LibraryItems libraryItems = new LibraryItems();
    Books books = new Books();
    Magazine magazine = new Magazine();

    Scanner scanner = new Scanner(System.in);

    public LibraryItems addItem(){

        System.out.println("Adding New Item");
        System.out.println("Please Enter Item ID: ");
        String newItemId = scanner.nextLine();

        System.out.println("Please Enter the item title: ");
        String itemTitle = scanner.nextLine();

        System.out.println("Please enter the item type: ");
        String type = scanner.nextLine();

        if(type.equalsIgnoreCase("book")){
            System.out.println("please enter the author: ");
            String author = scanner.nextLine();
            System.out.println("Please Enter the ISBM: ");
            String isbn = scanner.nextLine();
            return new Books(newItemId, itemTitle,author,isbn);
        }

    }


}
