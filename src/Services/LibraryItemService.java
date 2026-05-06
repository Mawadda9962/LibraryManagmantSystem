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

    public Boolean findItemById(){
        System.out.println("Please Enter the item ID that to find: ");
        String searchById = scanner.nextLine();

        for (int i = 0; i < LibraryItems.size(); i++){
            LibraryItems item = LibraryItems.get(i);

            if (item.getID().equalsIgnoreCase(searchById)){
                System.out.println(item.getDetails());
                return true;
            }
        }
        System.out.println("Item not found: ");
        return false;
    }

public String findItemThatContain(){
    System.out.println("Please Enter the keyWord to find the item: ");
    String Searching = scanner.nextLine();

    for (int i = 0; i < LibraryItems.size(); i++){
        LibraryItems item = LibraryItems.get(i);

        if (item.getTittle().contains(Searching));
        System.out.println(item.getDetails());
       }
    return Searching;
    }

public List<LibraryItems> getLibraryItems(){
        List<LibraryItems> available = new ArrayList<>();
        for (int i = 0; i < LibraryItems.size(); i++){
            if (LibraryItems.get(i).isAvailable()){
                available.add(LibraryItems.get(i));

            }
        }
        return available;
   }

}
