package problems.parkingLot.fee;

import problems.parkingLot.Ticket;

public interface FeeStrategy {
    double calculateFee(Ticket ticket);
}
