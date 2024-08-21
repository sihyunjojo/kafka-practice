package com.d108.project.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaSampleProducerController {
    private final KafkaSampleProducerService kafkaSampleProducerService;

    @PostMapping(value = "/sendMessage")
    public void sendMessage(@RequestParam String message) {
        kafkaSampleProducerService.sendMessage(message);
    }

}
