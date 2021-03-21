public class MainClassQuestion1 {
    public static void main(String[] args) {

        AudioFile a = new AudioFile("Song 0", "Sheraz Zaheer", 3.13);

        PlayList pl = new PlayList("My Playlist 1",a);

        PlayList pl2 = new PlayList("My Playlist 2",new AudioFile("Song 0", "Ayesha Khan", 3.13));


//      PART 1 Solution - Adding A Song

        for (int i = 1; i < 8; i++) {
            pl.insert(new AudioFile("Song " + i, "Sheraz Zaheer", 3.13));
        }
        pl.display();

//      PART 2 - Deleting a Song

        pl.delete("Song 6");
        pl.display();

//      Part 3 - Get Previous

        pl.getPrev("Song 3");
        pl.getPrev("Song 0");

//      Part 4 - Get Next

        pl.getNext("Song 4");
        pl.getNext("Song 5");
        pl.getNext("Song 7");

//      Part 5 - Adding a Playlist

        MusicPlayer mp = new MusicPlayer(pl);
        mp.insertPlaylist(pl2);
        mp.displayPlaylists();


//     Part 6 - Adding song in specific playlist

        pl2.display();
        mp.addASongInAPlaylist("My Playlist 2", new AudioFile("Inserted through player", "Ayesha Khan", 2.3));

        pl2.display();





    }
}

