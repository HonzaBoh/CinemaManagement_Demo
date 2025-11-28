package persistance;

import java.util.*;

public class CinemaService {

    private final List<Movie> movies = new ArrayList<>();
    private final List<Room> rooms = new ArrayList<>();
    private final List<Reservation> reservations = new ArrayList<>();
    private final List<Broadcast> broadcasts = new ArrayList<>();
    //private long nextMovieID


    public List<Broadcast> getBroadcastsByName(Movie movie){
        return broadcasts.stream()
                .filter(bc -> bc.getMovie().getIdMovie() == movie.getIdMovie())
                .toList();
    }

    public List<Broadcast> getRoomSchedule(Room room){
        return broadcasts.stream()
                .filter(bc -> bc.getRoom().getIdRoom() == room.getIdRoom())
                .toList();
    }

    public List<Reservation> getReservationsForBroadcast(Broadcast broadcast){
        return reservations.stream()
                .filter(res -> res.getIdBroadcast() == broadcast.getIdBroadcast())
                .toList();
    }

}
