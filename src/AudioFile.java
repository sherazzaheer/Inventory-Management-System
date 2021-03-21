public class AudioFile {

    String filename;
    String artist;
    double duration;
    AudioFile next;
    AudioFile prev;


    public AudioFile(String filename, String artist, double duration) {
        this.filename = filename;
        this.artist = artist;
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "AudioFile{" +
                "filename='" + filename + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }

    public boolean hasNext(){
        if (this.next==null){
            return false;
        }else {
            return true; }
    }

    public boolean hasPrev(){
        if (this.prev==null){
            return false;
        }else {
            return true; }
    }



    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }


}
