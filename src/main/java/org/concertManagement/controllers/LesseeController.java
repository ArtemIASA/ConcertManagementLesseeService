package org.concertManagement.controllers;


import org.concertManagement.entities.Lessee;
import org.concertManagement.services.LesseeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("services/lessees")
public class LesseeController {
    private final LesseeService lesseeService;

    @Autowired
    public LesseeController(LesseeService lesseeService){
        this.lesseeService = lesseeService;
    }

    @PostMapping
    public ResponseEntity<Void> addLessee(@RequestBody Lessee lessee){
        lesseeService.addLessee(lessee);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteLessee(@RequestBody Lessee lessee){
        lesseeService.deleteLessee(lessee);
        return ResponseEntity.ok().build();
    }
}
