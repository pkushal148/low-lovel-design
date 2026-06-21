package parkingLotUpdated.strategies;

import parkingLotUpdated.entities.Ticket;

public class FlatFee implements Fee{
    @Override
    public double calculateFee(Ticket ticket) {
        long duration = ticket.getExit() - ticket.getEntry();
        long hours = (duration / (1000 * 60 * 60)) + 1;
        return hours*10;
    }
}
