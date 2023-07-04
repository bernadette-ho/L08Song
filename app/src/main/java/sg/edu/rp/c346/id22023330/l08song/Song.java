package sg.edu.rp.c346.id22023330.l08song;

public class Song {
    private int id;
    private String title;
    private String singers;
    private int year;
    private int stars;

    public Song(String title, String singers, int year, int stars) {
        this.title = title;
        this.singers = singers;
        this.year = year;
        this.stars = stars;
    }

    public int get_id() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSingers() {
        return singers;
    }

    public int getYear() {
        return year;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        String text = String.format("Song Title: %s\nSinger: %s\nYear: %4d\n%1d %5s",title,singers,year,stars);
        return text;
    }
}
