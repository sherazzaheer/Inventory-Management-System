public class WaitingQueue {
    SeatRequest head;
    SeatRequest tail;
    int count = 0;


    public WaitingQueue(SeatRequest sr) {
        this.head = sr;
        this.tail = sr;
        this.head.prev = tail;
        this.tail.next = head;
        count = 1;
    }

    public void addtoQueue(SeatRequest sr){
        SeatRequest temp = tail;
        this.tail = sr;
        temp.prev = sr;
        tail.next = temp;
        count++;
    }

    public void confirmSeat(){
        SeatRequest temp = head;
        this.head=head.prev;
        temp.message = "Seat Confirmed";
        System.out.println(temp.toString());
        count--;
    }





    public void display(){
        SeatRequest temp = head;
        for (int i = 0; i < count; i++){
            System.out.println(temp.toString());
            temp = temp.prev;
        }

    }
}
