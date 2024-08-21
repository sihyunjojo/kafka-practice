package com.d108.project.domain;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaSampleConsumerService {

    public void consume(String message) throws IOException {
        System.out.println("receive message : " + message);
    }
}