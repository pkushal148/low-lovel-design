package parkingLotUpdated.strategies;

import parkingLotUpdated.entities.Ticket;

public interface Fee {
    double calculateFee(Ticket ticket);
}
