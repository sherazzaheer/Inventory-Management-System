import java.util.ArrayList;

public class MusicPlayer {
    PlayList root;

    public MusicPlayer(PlayList pl){
        this.root = pl;
    }

    public void insertPlaylist(PlayList a){
        PlayList temp = root;
        while (temp.hasNext()){
            temp = temp.next;
        }temp.next = a;
    }

    public void addASongInAPlaylist(String name, AudioFile a){
        PlayList temp = root;
        while (temp.hasNext()){
            if(name.equals(temp.name)){
                temp.insert(a);
                System.out.println(a.filename + " inserted in " + temp.name);
                return;
            }
            temp = temp.next;
        }
        if(name.equals(temp.name)){
            temp.insert(a);
            System.out.println(a.filename + " inserted in " + temp.name);
            return;
        }
        System.out.println(name + " Not found in the player");
    }

    public void displayPlaylists(){
        PlayList temp = root;
        if(root.next==null){
            System.out.println(root.name);
            return;
        }
        while (temp.hasNext()){
            System.out.println(temp.name);
            temp = temp.next;
        }System.out.println(temp.name);;
    }

}


