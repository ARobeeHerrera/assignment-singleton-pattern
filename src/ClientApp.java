import QueueingSystem.*;
import Teller.*;
import UserDetails.*;
import java.util.*;

public class ClientApp {
    public static void main(String[] args) {
        ArrayList<UserDetails> userList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        QueueingSystem qs = QueueingSystem.getInstance();
        Teller tl = new Teller();
        Boolean toRun = true;

        while (toRun) {
            System.out.println("Centralized Queueing System");
            System.out.println("[1] Get a queue number");
            System.out.println("[2] Teller current queue");
            System.out.println("[3] Reset queue");
            System.out.println("[4] Exit");
            System.out.print("Select an option: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\nEnter your account number: ");
                    String accountNumber = sc.next();
                    qs.setQueueNumber();
                    userList.add(new UserDetails(accountNumber, qs.getQueueNumber()));
                    break;
                case 2:
                    System.out.println("\nCurrent queue number: " + tl.getCurrentQueueNumber());
                    System.out.println("User in desk\n" + userList.get(0));
                    userList.remove(0);
                    break;
                case 3:
                    System.out.println("\nResetting queue\n");
                    userList.clear();
                    qs.clearQueueNumber();
                    break;
                case 4:
                    System.out.println("\nThank you for using Centralized Queueing System");
                    toRun = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            if (toRun && !userList.isEmpty()) {
                System.out.println("\nQueue Numbers");
                for (UserDetails user : userList) {
                    System.out.println(user);
                }
                System.out.println();
            }
        }

    }
}
