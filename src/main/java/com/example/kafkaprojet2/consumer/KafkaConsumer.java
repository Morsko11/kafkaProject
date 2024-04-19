package com.example.kafkaprojet2.consumer;

import com.example.kafkaprojet2.dto.BookDto;
import com.example.kafkaprojet2.model.Book;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "topicBook",groupId = "consumerGroup")
    public void resiveMessage(BookDto bookDto){
        System.out.println(bookDto);
    }
    @KafkaListener(topics = "topicBook",groupId = "consumerGroup")
    public void resiveCitata(String citata){
        System.out.println(citata);
    }
    @KafkaListener(topics = "topicBook",groupId = "consumerGroup")
    public void resiveCount(int count){
        System.out.println(count);
    }
    @KafkaListener(topics = "topicDate",groupId = "dateGroup")
    public void resiveData(LocalDate date){
        System.out.println(date);
    }

}
