package com.example.kafkaprojet2.controler;

import com.example.kafkaprojet2.dto.BookDto;
import com.example.kafkaprojet2.model.Book;
import com.example.kafkaprojet2.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class KafkaControler {

    private final KafkaProducer kafkaProducer;

    @PostMapping("/sendBook")
    void bookDto(@RequestBody BookDto bookDto ) {

         kafkaProducer.sendBook(bookDto);

    }

    @PostMapping("/sendCitata")
    void sendCitata(@RequestParam String citata) {
         kafkaProducer.sendCitata(citata);
    }

    @PostMapping("/sendData")
    void sendData(@RequestBody LocalDate date) {
    
         kafkaProducer.sendData(date);
    }

    @PostMapping("/sendCount/{count}")
    void sendCount(@PathVariable int count) {
         kafkaProducer.sendCount(count);
    }
}
