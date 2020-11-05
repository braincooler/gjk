package de.braincooler.gjk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface GjkController {
    @GetMapping
    ResponseEntity<String> getHello();
}
