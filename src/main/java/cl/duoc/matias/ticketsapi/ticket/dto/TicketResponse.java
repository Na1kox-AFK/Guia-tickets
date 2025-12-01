package cl.duoc.matias.ticketsapi.ticket.dto;

import cl.duoc.matias.ticketsapi.ticket.model.TicketPriority;
import cl.duoc.matias.ticketsapi.ticket.model.TicketStatus;
import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
@Data
@Builder
public class TicketResponse {
    private Long id;
    private String title;
    private String description;
    private TicketStatus status;
    private TicketPriority priority;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
}
