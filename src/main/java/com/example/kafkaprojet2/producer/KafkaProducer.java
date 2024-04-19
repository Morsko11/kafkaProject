package com.example.kafkaprojet2.producer;

import com.example.kafkaprojet2.dto.BookDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class KafkaProducer {

    private final KafkaTemplate<String,Object> kafkaTemplate;

    private static final String topicBook="topicBook";
    private static final String topicDate="topicDate";
    public void sendBook(BookDto bookDto) {
         kafkaTemplate.send(topicBook,bookDto);
    }

    public void sendCitata(String citata) {
        kafkaTemplate.send(topicBook,citata);
    }

    public void sendData(LocalDate date) {
        kafkaTemplate.send(topicDate,date);
    }

    public void sendCount(int count) {
        kafkaTemplate.send(topicBook,count);
    }
}

