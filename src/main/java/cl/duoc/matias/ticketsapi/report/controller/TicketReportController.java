package cl.duoc.matias.ticketsapi.report.controller;

import cl.duoc.matias.ticketsapi.report.dto.TicketStatusCount;
import cl.duoc.matias.ticketsapi.report.repository.TicketReportJdbcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/reports")
@RequiredArgsConstructor
public class TicketReportController {
    private final TicketReportJdbcRepository repository;
    @GetMapping("/tickets-by-status")
    public List<TicketStatusCount> getTicketsByStatus() {
        return repository.getCountByStatus();
    }
}
