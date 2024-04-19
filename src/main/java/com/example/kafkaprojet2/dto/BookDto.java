package com.example.kafkaprojet2.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDto {
    private String name;
    private String author;
    private int count;

    private LocalDate localDate;
}
