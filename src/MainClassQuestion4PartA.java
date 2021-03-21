import java.util.*;

public class MainClassQuestion4PartA {

    public static void remove(PlayList pl){

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        AudioFile temp = pl.root;

        for (int i = 0; i < pl.count; i++) {
            if(hm.containsKey(temp.filename)){
                hm.put(temp.filename, hm.get(temp.filename) + 1);
            }else {
                hm.put(temp.filename, 1);
            }
            temp = temp.next;
        }


        String minKey = null;
        int minValue = Integer.MAX_VALUE;
        for (String key : hm.keySet()) {
            int value = hm.get(key);
            if (value < minValue) {
                minValue = value;
                minKey = key;
            }
        }

        for (int i = 0; i < minValue; i++) {
            pl.delete(minKey);
        }

    }


    public static void main(String[] args) {

        AudioFile a = new AudioFile("Song " + 0, "Sheraz Zaheer", 3.13);

        PlayList pl = new PlayList("My Playlist 1",a);

        pl.insert(new AudioFile("Song " + 0, "Sheraz Zaheer", 3.13));
        pl.insert(new AudioFile("Song " + 5, "Sheraz Zaheer", 3.13));
        pl.insert(new AudioFile("Song " + 2, "Sheraz Zaheer", 3.13));
        pl.insert(new AudioFile("Song " + 3, "Sheraz Zaheer", 3.13));
        pl.insert(new AudioFile("Song " + 3, "Sheraz Zaheer", 3.13));
        pl.insert(new AudioFile("Song " + 5, "Sheraz Zaheer", 3.13));

        pl.display();
        MainClassQuestion4PartA.remove(pl);
        System.out.println("After Removing");
        pl.display();
    }
}
