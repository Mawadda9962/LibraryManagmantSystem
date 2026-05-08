package Services;

import Entites.LibraryItems;
import Entites.Member;
import java.util.Scanner;

public class BorrowingServices {

    private LibraryItemService libraryItemService;
    private MemberServices memberServices;
    private Scanner scanner = new Scanner(System.in);

    public BorrowingServices(LibraryItemService libraryItemService, MemberServices memberServices) {
        this.libraryItemService = libraryItemService;
        this.memberServices = memberServices;
    }

    public void borrowItem() {
        System.out.println("Please enter your Member ID:");
        String borrowerID = scanner.nextLine().trim();

        Member member = memberServices.findMemberById(borrowerID);

        if (member != null) {
            System.out.println(member.getName() + " is a registered MEMBER.");
            System.out.println("Please enter the Item ID you want to borrow:");
            String itemID = scanner.nextLine().trim();

            LibraryItems item = libraryItemService.findItemById(itemID);

            if (item != null && item.isStatus()) {
                item.setStatus(false);
                System.out.println("Borrow successful: \"" + item.getTittle() + "\" is now checked out.");
            } else if (item != null && !item.isStatus()) {
                System.out.println("Sorry, \"" + item.getTittle() + "\" is already borrowed.");
            } else {
                System.out.println("Sorry, no item found with ID: " + itemID);
            }

        } else {
            System.out.println(borrowerID + " is NOT a registered member.");
        }
    }

    public void returnItem() {
        System.out.println("Please enter your Member ID:");
        String borrowerID = scanner.nextLine().trim();

        Member member = memberServices.findMemberById(borrowerID);

        if (member != null) {
            System.out.println(member.getName() + " is a registered MEMBER.");
            System.out.println("Please enter the Item ID you want to return:");
            String itemID = scanner.nextLine().trim();

            LibraryItems item = libraryItemService.findItemById(itemID);

            if (item != null && !item.isStatus()) {
                item.setStatus(true);
                System.out.println("Return successful: \"" + item.getTittle() + "\" is now available.");
            } else if (item != null && item.isStatus()) {
                System.out.println("This item was not checked out.");
            } else {
                System.out.println("Sorry, no item found with ID: " + itemID);
            }

        } else {
            System.out.println(borrowerID + " is NOT a registered member.");
        }
    }
}