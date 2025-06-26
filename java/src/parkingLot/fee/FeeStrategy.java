package parkingLot.fee;

import parkingLot.Ticket;

public interface FeeStrategy {
    double calculateFee(Ticket ticket);
}
