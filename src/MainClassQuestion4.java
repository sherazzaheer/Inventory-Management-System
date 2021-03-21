public class MainClassQuestion4 {
    public static void main(String[] args) {
        SeatRequest sq = new SeatRequest("Sheraz ", "Waiting for confirmation");

        WaitingQueue wq = new WaitingQueue(sq);

        for (int i = 0; i < 6; i++) {
            wq.addtoQueue(new SeatRequest("Sheraz "+ i, "Waiting for confirmation"));
        }
        wq.display();


        System.out.println();
        System.out.println("Confirming 2 Seats");
        System.out.println();

        wq.confirmSeat();
        wq.confirmSeat();

        System.out.println();
        System.out.println("NEW QUEUE");
        System.out.println();

        wq.display();
    }
}
