
public class SeatRequest {
    SeatRequest next;
    SeatRequest prev;
    String name;
    String message;

    public SeatRequest(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public boolean hasNext(){
        if (this.next==null){
            return false;
        }else {
            return true; }
    }


    @Override
    public String toString() {
        return "SeatRequest{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
