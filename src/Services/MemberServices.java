package Services;

import Entites.Address;
import Entites.Library;
import Entites.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberServices {

    private Library library;

    public MemberServices(Library library) {
        this.library = library;
    }


    public void addMember(Member member) {
        library.getMembers().add(member);
        System.out.println("Member registered: " + member.getName() + " (ID: " + member.getID() + ")");
    }

    public boolean removeMember(String memberId) {
        Member found = findMemberById(memberId);
        if (found != null) {
            library.getMembers().remove(found);
            System.out.println("Member removed: " + found.getName());
            return true;
        }
        System.out.println("Member not found with ID: " + memberId);
        return false;
    }

    public Member findMemberById(String memberId) {
        for (Member member : library.getMembers()) {
            if (member.getID().equalsIgnoreCase(memberId)) {
                return member;
            }
        }
        return null;
    }


    public List<Member> findMembersByName(String name) {
        List<Member> results = new ArrayList<>();
        for (Member member : library.getMembers()) {
            if (member.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(member);
            }
        }
        return results;
    }


    public void displayAllMembers() {
        if (library.getMembers().isEmpty()) {
            System.out.println("No members registered.");
            return;
        }
        System.out.println("\n===== Registered Members =====");
        for (Member member : library.getMembers()) {
            System.out.println("ID      : " + member.getID());
            System.out.println("Name    : " + member.getName());
            Address addr = member.getAddress();
            if (addr != null) {
                System.out.println("Address : " + addr.getStreet() + ", "
                        + addr.getCity() + ", " + addr.getPostalCode());
            }
        }
    }

    public void updateMemberName(String memberId, String newName) {
        Member member = findMemberById(memberId);
        if (member != null) {
            member.setName(newName);
            System.out.println("Name updated to: " + newName);
        } else {
            System.out.println("Member not found with ID: " + memberId);
        }
    }

    public void updateMemberAddress(String memberId, Address newAddress) {
        Member member = findMemberById(memberId);
        if (member != null) {
            member.setAddress(newAddress);
            System.out.println("Address updated for: " + member.getName());
        } else {
            System.out.println("Member not found with ID: " + memberId);
        }
    }


    public int getTotalMemberCount() {
        return library.getMembers().size();
    }
}