package persistance;

public class Reservation {
  private final long idReservation;
  private int amount;
  private long idBroadcast;

    public Reservation(long idReservation, int amount, long idBroadcast) {
        this.idReservation = idReservation;
        this.amount = amount;
        this.idBroadcast = idBroadcast;
    }

    public long getIdReservation() {
        return idReservation;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getIdBroadcast() {
        return idBroadcast;
    }

    public void setIdBroadcast(long idBroadcast) {
        this.idBroadcast = idBroadcast;
    }
}
