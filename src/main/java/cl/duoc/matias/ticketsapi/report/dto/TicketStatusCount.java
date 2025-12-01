package cl.duoc.matias.ticketsapi.report.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class TicketStatusCount {
    private String status;
    private Long count;
}