package Services;

import Entites.Books;
import Entites.Library;
import Entites.LibraryItems;
import Entites.Magazine;

import java.util.ArrayList;
import java.util.List;

public class LibraryItemService {

    private Library library;

    public LibraryItemService(Library library) {
        this.library = library;
    }

    public void addItem(LibraryItems item) {
        library.getLibraryItems().add(item);
        System.out.println("Item added successfully: " + item.getTittle());
    }

    public boolean removeItem(String itemId) {
        LibraryItems found = findItemById(itemId);
        if (found != null) {
            library.getLibraryItems().remove(found);
            System.out.println("Item removed: " + found.getTittle());
            return true;
        }
        System.out.println("Item not found with ID: " + itemId);
        return false;
    }


    public LibraryItems findItemById(String itemId) {
        for (LibraryItems item : library.getLibraryItems()) {
            if (item.getID().equalsIgnoreCase(itemId)) {
                return item;
            }
        }
        return null;
    }


    public List<LibraryItems> findItemsByTitle(String title) {
        List<LibraryItems> results = new ArrayList<>();
        for (LibraryItems item : library.getLibraryItems()) {
            if (item.getTittle().toLowerCase().contains(title.toLowerCase())) {
                results.add(item);
            }
        }
        return results;
    }

    // ─── Display All Items ────────────────────────────────────────

    public void displayAllItems() {
        if (library.getLibraryItems().isEmpty()) {
            System.out.println("No items in the library.");
            return;
        }
        System.out.println("\n===== Library Items =====");
        for (LibraryItems item : library.getLibraryItems()) {
            System.out.println("ID      : " + item.getID());
            System.out.println("Title   : " + item.getTittle());
            System.out.println("Status  : " + (item.isStatus() ? "Available" : "Checked Out"));
        }
    }

    // ─── Display Available Items ──────────────────────────────────

    public void displayAvailableItems() {
        System.out.println("\n===== Available Items =====");
        boolean found = false;
        for (LibraryItems item : library.getLibraryItems()) {
            if (item.isStatus()) {
                System.out.println("ID: " + item.getID() + " | Title: " + item.getTittle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items are currently available.");
        }
    }

    // ─── Update Item Status ───────────────────────────────────────

    public void updateItemStatus(String itemId, boolean status) {
        LibraryItems item = findItemById(itemId);
        if (item != null) {
            item.setStatus(status);
            System.out.println("Status updated for: " + item.getTittle()
                    + " → " + (status ? "Available" : "Checked Out"));
        } else {
            System.out.println("Item not found with ID: " + itemId);
        }
    }

    // ─── Count ────────────────────────────────────────────────────

    public int getTotalItemCount() {
        return library.getLibraryItems().size();
    }
}
