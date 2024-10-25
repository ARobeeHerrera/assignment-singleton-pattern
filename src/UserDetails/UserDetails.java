package UserDetails;

public class UserDetails {
    private String accountNumber;
    private Integer queueNumber;

    public UserDetails(String accountNumber, Integer queueNumber) {
        this.accountNumber = accountNumber;
        this.queueNumber = queueNumber;
    }

    public String toString(){
        return "Account number: " + accountNumber + "\nQueue number: " + queueNumber;
    }
}
