package QueueingSystem;

public class QueueingSystem {
    private static QueueingSystem instance;
    private Integer queueNumber;

    private QueueingSystem() {
        queueNumber = 0;
    }
    public static QueueingSystem getInstance() {
        if (instance == null) {
            instance = new QueueingSystem();
        }
        return instance;
    }

    public void setQueueNumber() {
        queueNumber++;
    }

    public Integer getQueueNumber() {
        return queueNumber;
    }

    public void clearQueueNumber() {
        queueNumber = 0;
    }
}
