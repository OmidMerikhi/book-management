package com.omid.bookservice.book;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String writer;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String address;

    private Integer quantity;


}
