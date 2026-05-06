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

    public Magazine() {
        this.issueNumber = issueNumber;
        this.publisher = publisher;


    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber='" + issueNumber + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
