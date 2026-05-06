package Services;

import Entites.Books;
import Entites.LibraryItems;
import Entites.Magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryItemService{
    static List<LibraryItems> LibraryItems = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public Object addItem() {

        System.out.println("Adding New Item");
        System.out.println("Please Enter Item ID: ");
        String newItemId = scanner.nextLine();

        System.out.println("Please Enter the item title: ");
        String itemTitle = scanner.nextLine();

        System.out.println("Please enter the item type: ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("book")) {
            System.out.println("please enter the author: ");
            String author = scanner.nextLine();
            System.out.println("Please Enter the ISBM: ");
            String isbn = scanner.nextLine();
            return new Books(newItemId, itemTitle, author, isbn);
        } else {
            System.out.println("Please Enter the issue number: ");
            String issueNumber = scanner.nextLine();
            System.out.println("Please enter the publisher");
            String publisher = scanner.nextLine();
            return new Magazine(newItemId, itemTitle, issueNumber, publisher);
        }

    }

    public List<LibraryItems> addNewItem(){
        Boolean contine = true;
        while (contine){
            LibraryItems.add((LibraryItems) addItem());
            System.out.println("Enter q to exit");
            if(scanner.nextLine().equalsIgnoreCase("q")){
                contine = false;
            }
        }
        return LibraryItems;

    }

    public boolean findItemById(){
        System.out.println("Please Enter the item ID that ");
    }




}
