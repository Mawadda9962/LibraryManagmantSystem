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

    public Magazine(String issueNumber, String publisher) {
        this.issueNumber = issueNumber;
        this.publisher = publisher;


    }
}
