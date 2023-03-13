import java.util.ArrayList;
import java.util.Locale;

public class Song {

    private String title;
    private String artist;
    ArrayList<String> otherArray = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public int howMany(ArrayList<String> arrayList) {
        String temp = "";
        int total = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            temp = arrayList.get(i).toLowerCase(Locale.ROOT);
            if (!otherArray.contains(temp)) {
                otherArray.add(temp);
                total = total + 1;
            }
        }
        return total;
    }
}
