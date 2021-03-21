public class PlayList {
    String name;
    PlayList next;
    AudioFile root;
    AudioFile tail;
    int count;


    public PlayList(String name, AudioFile root) {
        this.root = root;
        this.name = name;
        count = 1;
    }

    public void insert(AudioFile a){
        AudioFile temp = root;
        while (temp.hasNext()){
            temp = temp.next;
        }

        temp.next = a;
        a.prev = temp;
        this.tail = a;
        count++;
    }

    public void display(){
        AudioFile temp = root;
        while (temp.hasNext()){
            System.out.println(temp.toString());
            temp = temp.next;
        }
        System.out.println(temp.toString());
    }

    public void delete(String filename){
        AudioFile temp = root;
        while (temp.hasNext()){
            if (filename.equals(temp.filename)){
                AudioFile prev = temp.prev;
                AudioFile next = temp.next;
                prev.next = next;
                next.prev = prev;
                System.out.println(filename + " Has been deleted.!!");
                count--;
                return;
            }
            temp = temp.next;
        }
        if (filename.equals(temp.filename)){
            AudioFile prev = temp.prev;
            prev.next = null;
            this.tail = prev;
            System.out.println(filename + " Has been deleted.!!");
            count--;
            return;
        }

        System.out.println(filename + " Not found.!!");
    }

    public void getNext(String filename){
        AudioFile temp = root;
        while (temp.hasNext()){
            if (filename.equals(temp.filename)){
                try {
                    System.out.println(temp.next.filename + " is the next song after " + filename);
                    return;
                }
                catch (NullPointerException e){
                    System.out.println("No song after "+ filename);
                }
            }
            temp = temp.next;
        }
        System.out.println("No song after "+ filename);
    }

    public void getPrev(String filename){
        AudioFile temp = tail;
        while (temp.hasPrev()){
            if (filename.equals(temp.filename)){
                try {
                    System.out.println(temp.prev.filename + " is the previous song before " + filename);
                    return;
                }
                catch (NullPointerException e){
                    System.out.println("No song before "+ filename);
                }
            }
            temp = temp.prev;
        }
        System.out.println("No song before "+ filename);
    }

    public boolean hasNext(){
        if (this.next==null){
            return false;
        }else {
            return true; }
    }
}
