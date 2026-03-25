import java.util.LinkedList;
import java.util.Queue;

// Reservation class
class Reservation {
    String guestName;
    String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return guestName + " requested " + roomType;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Book My Stay App ===");

        // Create booking request queue
        Queue<Reservation> bookingQueue = new LinkedList<>();

        // Guest submits booking requests
        bookingQueue.add(new Reservation("Alice", "Deluxe Room"));
        bookingQueue.add(new Reservation("Bob", "Suite"));
        bookingQueue.add(new Reservation("Charlie", "Standard Room"));

        // Display queued requests
        System.out.println("\nBooking Requests in Queue (FIFO Order):");
        for (Reservation r : bookingQueue) {
            System.out.println(r);
        }

        System.out.println("\nRequests are queued and waiting for processing...");
    }
}