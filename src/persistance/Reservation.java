package persistance;

public class Reservation {
  private final long idReservation;
  private int amount;
  private long idBroadcast;
  private String customerName;

    public Reservation(long idReservation, int amount, long idBroadcast, String name) {
        this.idReservation = idReservation;
        this.amount = amount;
        this.customerName = name;
        this.idBroadcast = idBroadcast;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
