package com.example.kafkaprojet2.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Book {

    private int id;
    private String name;
    private String author;
    private int count;
    private LocalDate localDate;

}
