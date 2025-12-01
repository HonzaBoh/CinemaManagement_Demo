package persistance;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class CinemaService {

    private final List<Movie> movies = new ArrayList<>();
    private final List<Room> rooms = new ArrayList<>();
    private final List<Reservation> reservations = new ArrayList<>();
    private final List<Broadcast> broadcasts = new ArrayList<>();
    private long nextMovieID = 1;
    private long nextRoomID = 1;
    private long nextReservationID = 1;
    private long nextBroadcastID = 1;


    public List<Broadcast> getBroadcastsByName(Movie movie){
        return broadcasts.stream()
                .filter(bc -> bc.getMovie().getIdMovie() == movie.getIdMovie())
                .toList();
    }

    public Broadcast getBroadcastById(long id){
        return broadcasts.stream()
                .filter(bc -> bc.getIdBroadcast() == id)
                .toList()
                .get(0);
    }

    public Movie getMovieById(long id){
        return movies.stream()
                .filter(m -> m.getIdMovie() == id)
                .toList()
                .get(0);
    }

    public Room getRoomById(long id){
        return rooms.stream()
                .filter(r -> r.getIdRoom() == id)
                .toList()
                .get(0);
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

    //----CRUD--------
    //----Reservations--------
    public boolean createReservation(long idBroadcast, int amount, String customerName){
        if(broadcasts.stream().filter(bc -> bc.getIdBroadcast() == idBroadcast).count() > 0){
            if (getBroadcastById(idBroadcast).reserveSeats(amount)){
                reservations.add(new Reservation(nextReservationID, amount, idBroadcast, customerName));
                nextReservationID++;
                return true;
            }
        } return false;
    }

    public boolean createBroadcast(long movieID, long roomID, LocalDateTime start){
        if (getMovieById(movieID) == null) return false;
        if (getRoomById(roomID) == null) return false;

        //vse v roomce:
        List<Broadcast> candidates = getRoomSchedule(getRoomById(roomID));

        // TODO: 01.12.2025 vlastni metoda pro konflikt mezi 2 vysilanimi 
//        candidates.forEach(c -> {
//            if (start.isAfter(c.))
//        });
        return true;
    }

}
