package problems.parkingLotUpdated.strategies;

import problems.parkingLotUpdated.entities.Ticket;

public interface Fee {
    double calculateFee(Ticket ticket);
}
