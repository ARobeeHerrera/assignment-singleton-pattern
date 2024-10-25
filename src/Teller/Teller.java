package Teller;

public class Teller {
    private Integer currentQueueNumber = 0;

    public Integer getCurrentQueueNumber() {
        return ++currentQueueNumber;
    }
}
