package cl.duoc.matias.ticketsapi.ticket.dto;

import cl.duoc.matias.ticketsapi.ticket.model.TicketPriority;
import cl.duoc.matias.ticketsapi.ticket.model.TicketStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class TicketUpdateRequest {
    @NotBlank
    private String title;
    private String description;
    @NotNull
    private TicketStatus status;
    @NotNull
    private TicketPriority priority;
    @NotBlank
    private String category;
}
