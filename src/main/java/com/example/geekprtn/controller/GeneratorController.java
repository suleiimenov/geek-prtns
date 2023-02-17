package com.example.geekprtn.controller;

import com.example.geekprtn.service.GeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneratorController {

    private final GeneratorService generatorService;

    public GeneratorController(GeneratorService generatorService) {
        this.generatorService = generatorService;
    }

    @GetMapping("/generate")
    public ResponseEntity<String> generate() {
        return ResponseEntity.ok(generatorService.generate());
    }
}
