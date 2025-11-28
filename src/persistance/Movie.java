package persistance;

public class Movie {
   private long idMovie;
   private String name;
   private int releaseYear;
   private int duration;
   private double rating;

    public Movie(long idMovie, String name, int releaseYear, int duration, double rating) {
        this.idMovie = idMovie;
        this.name = name;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.rating = rating;
    }

    public long getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(long idMovie) {
        this.idMovie = idMovie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
