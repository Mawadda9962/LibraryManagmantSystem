package Utils;

import Entites.Address;
import Entites.Books;
import Entites.Library;
import Entites.Member;
import Services.BorrowingServices;
import Services.LibraryItemService;
import Services.MemberServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static Library library = new Library("LIB-001", "Al Muscat Central Library",
            new ArrayList<>(), new ArrayList<>());

    static LibraryItemService libraryItemService = new LibraryItemService(library);
    static MemberServices memberServices = new MemberServices(library);
    static BorrowingServices borrowingServices = new BorrowingServices(libraryItemService, memberServices);

    public static void main(String[] args) {

        // ── Sample Data ───────────────────────────────────────────
        libraryItemService.addItem(new Books("B001", "Clean Code",               true, scanner, "Robert C. Martin", "978-0132350884"));
        libraryItemService.addItem(new Books("B002", "The Pragmatic Programmer", true, scanner, "Andrew Hunt",       "978-0201616224"));
        libraryItemService.addItem(new Books("B003", "Design Patterns",          true, scanner, "Gang of Four",      "978-0201633610"));

        memberServices.addMember(new Member("M001", "Ahmed Al-Rashidi",
                new Address("12 Sultan Qaboos St", "Muscat", "100")));
        memberServices.addMember(new Member("M002", "Fatima Al-Balushi",
                new Address("45 Ruwi High St", "Ruwi", "112")));

        // ── Main Menu Loop ────────────────────────────────────────
        System.out.println(MenuMessages.MAIN_MENU_MESSAGE);
        boolean mainMenuContinue = true;

        while (mainMenuContinue) {
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1 -> {
                    boolean first = true;
                    while (first) {
                        System.out.println("Enter Book ID   : ");
                        String id = scanner.nextLine().trim();
                        System.out.println("Enter Title     : ");
                        String title = scanner.nextLine().trim();
                        System.out.println("Enter Author    : ");
                        String author = scanner.nextLine().trim();
                        System.out.println("Enter ISBN      : ");
                        String isbn = scanner.nextLine().trim();
                        libraryItemService.addItem(new Books(id, title, true, scanner, author, isbn));
                        System.out.println("Enter E to exit or any key to add another:");
                        if (scanner.nextLine().equalsIgnoreCase("e")) first = false;
                    }
                    System.out.println(MenuMessages.MAIN_MENU_MESSAGE);
                }

                case 2 -> {
                    boolean second = true;
                    while (second) {
                        System.out.println("Enter Magazine ID     : ");
                        String id = scanner.nextLine().trim();
                        System.out.println("Enter Title           : ");
                        String title = scanner.nextLine().trim();
                        System.out.println("Enter Issue Number    : ");
                        String issue = scanner.nextLine().trim();
                        System.out.println("Enter Publisher       : ");
                        String publisher = scanner.nextLine().trim();
                        // Magazine does not extend LibraryItems in your design.
                        // Printed as confirmation until Magazine extends LibraryItems.
                        System.out.println("Magazine added: " + title + " | Issue: " + issue + " | Publisher: " + publisher);
                        System.out.println("Enter E to exit or any key to add another:");
                        if (scanner.nextLine().equalsIgnoreCase("e")) second = false;
                    }
                    System.out.println(MenuMessages.MAIN_MENU_MESSAGE);
                }

                case 3 -> {
                    boolean third = true;
                    while (third) {
                        libraryItemService.displayAllItems();
                        System.out.println("Enter E to exit:");
                        if (scanner.nextLine().equalsIgnoreCase("e")) third = false;
                    }
                    System.out.println(MenuMessages.MAIN_MENU_MESSAGE);
                }

                case 4 -> {
                    boolean fourth = true;
                    while (fourth) {
                        System.out.println("Enter Title keyword to search:");
                        String keyword = scanner.nextLine().trim();
                        var results = libraryItemService.findItemsByTitle(keyword);
                        if (results.isEmpty()) {
                            System.out.println("No items found matching: " + keyword);
                        } else {
                            System.out.println("Found " + results.size() + " result(s):");
                            for (var item : results) {
                                System.out.println("  - [" + item.getID() + "] " + item.getTittle());
                            }
                        }
                        System.out.println("Enter E to exit or any key to search again:");
                        if (scanner.nextLine().equalsIgnoreCase("e")) fourth = false;
                    }
                    System.out.println(MenuMessages.MAIN_MENU_MESSAGE);
                }

                case 5 -> {
                    boolean fifth = true;
                    while (fifth) {
                        System.out.println("Enter Member ID   : ");
                        String id = scanner.nextLine().trim();
                        System.out.println("Enter Name        : ");
                        String name = scanner.nextLine().trim();
                        System.out.println("Enter Street      : ");
                        String street = scanner.nextLine().trim();
                        System.out.println("Enter City        : ");
                        String city = scanner.nextLine().trim();
                        System.out.println("Enter Postal Code : ");
                        String postal = scanner.nextLine().trim();
                        memberServices.addMember(new Member(id, name, new Address(street, city, postal)));
                        System.out.println("Enter E to exit or any key to add another:");
                        if (scanner.nextLine().equalsIgnoreCase("e")) fifth = false;
                    }
                    System.out.println(MenuMessages.MAIN_MENU_MESSAGE);
                }

                case 6 -> {
                    boolean six = true;
                    while (six) {
                        memberServices.displayAllMembers();
                        System.out.println("Enter E to exit:");
                        if (scanner.nextLine().equalsIgnoreCase("e")) six = false;
                    }
                    System.out.println(MenuMessages.MAIN_MENU_MESSAGE);
                }

                case 7 -> {
                    boolean seven = true;
                    while (seven) {
                        borrowingServices.borrowItem();
                        System.out.println("Enter E to exit or any key to borrow another:");
                        if (scanner.nextLine().equalsIgnoreCase("e")) seven = false;
                    }
                    System.out.println(MenuMessages.MAIN_MENU_MESSAGE);
                }

                case 8 -> {
                    boolean eight = true;
                    while (eight) {
                        borrowingServices.returnItem();
                        System.out.println("Enter E to exit or any key to return another:");
                        if (scanner.nextLine().equalsIgnoreCase("e")) eight = false;
                    }
                    System.out.println(MenuMessages.MAIN_MENU_MESSAGE);
                }

                case 9 -> {
                    System.out.println("Goodbye!");
                    mainMenuContinue = false;
                }

                default -> System.out.println("Select a choice from the list");
            }
        }
    }
}