package com.app.transport.application;

import com.app.transport.domain.Transport;
import com.app.transport.domain.TransportService;
import com.app.transport.domain.TransportRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transports")
public class TransportController {

    private final TransportService transportService;

    public TransportController(TransportService transportService) {
        this.transportService = transportService;
    }

    @GetMapping
    public ResponseEntity<List<Transport>> findAll() {
        return ResponseEntity.ok(transportService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transport> findById(@PathVariable Long id) {
        return ResponseEntity.ok(transportService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Transport> save(@RequestBody Transport transport) {
        Transport savedTransport = transportService.save(transport);
        return ResponseEntity.ok(savedTransport);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transport> update(@RequestBody Transport transport, @PathVariable Long id) {
        Transport updatedTransport = transportService.update(transport, id);
        return ResponseEntity.ok(updatedTransport);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        transportService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}


