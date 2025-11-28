package persistance;

import java.time.LocalDateTime;
import java.util.Locale;

public class Broadcast {
    private long idBroadcast;
    private Movie movie;
    private Room room;
    private LocalDateTime startTime;

    public Broadcast(long idBroadcast, Movie movie, Room room, LocalDateTime startTime) {
        this.idBroadcast = idBroadcast;
        this.movie = movie;
        this.room = room;
        this.startTime = startTime;
    }

    public long getIdBroadcast() {
        return idBroadcast;
    }

    public void setIdBroadcast(long idBroadcast) {
        this.idBroadcast = idBroadcast;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
    public LocalDateTime getEndTime() {
        return startTime.plusSeconds(movie.getDuration());
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
}
