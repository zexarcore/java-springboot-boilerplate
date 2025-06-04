package com.app.transport.adapters;  

import java.util.List;  

import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.*;  

import com.app.transport.domain.ITransportService;  
import com.app.transport.domain.Transport;  

@RestController  
@RequestMapping("/api/transports")  
public class TransportController {  

    private final ITransportService transportService;  

    public TransportController(ITransportService transportService) {  
        this.transportService = transportService;  
    }  

    // Obtener todos los transportes  
    @GetMapping  
    public ResponseEntity<List<Transport>> getAllTransports() {  
        List<Transport> transports = transportService.findAll();  
        return ResponseEntity.ok(transports);  
    }  

    // Obtener transporte por ID  
    @GetMapping("/{id}")  
    public ResponseEntity<Transport> getTransportById(@PathVariable Long id) {  
        Transport transport = transportService.findById(id);  
        return ResponseEntity.ok(transport);  
    }  

    // Crear nuevo transporte  
    @PostMapping  
    public ResponseEntity<Transport> createTransport(@RequestBody Transport transport) {  
        Transport newTransport = transportService.save(transport);  
        return ResponseEntity.ok(newTransport);  
    }  

    // Actualizar transporte existente  
    @PutMapping("/{id}")  
    public ResponseEntity<Transport> updateTransport(@PathVariable Long id, @RequestBody Transport transport) {  
        Transport updatedTransport = transportService.update(transport, id);  
        return ResponseEntity.ok(updatedTransport);  
    }  

    // Eliminar transporte por ID  
    @DeleteMapping("/{id}")  
    public ResponseEntity<Void> deleteTransport(@PathVariable Long id) {  
        transportService.deleteById(id);  
        return ResponseEntity.noContent().build();  
    }  
}  