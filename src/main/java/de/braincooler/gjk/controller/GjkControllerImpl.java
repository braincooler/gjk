package de.braincooler.gjk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class GjkControllerImpl implements GjkController {
    @Override
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello gjk!");
    }
}
