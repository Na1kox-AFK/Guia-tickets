package cl.duoc.matias.ticketsapi.ticket.repository;


import cl.duoc.matias.ticketsapi.ticket.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
