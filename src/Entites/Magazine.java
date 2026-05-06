package Entites;

public class Magazine {
    private String issueNumber;
    private String publisher;

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Magazine(String newItemId, String itemTitle, String issueNumber, String publisher) {
        this.issueNumber = this.issueNumber;
        this.publisher = this.publisher;


    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber='" + issueNumber + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
