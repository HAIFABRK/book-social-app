package com.haifa.book.book;

import lombok.*;
import org.springframework.web.service.annotation.GetExchange;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponse {
    private Integer id;
    private String title;
    private String authorName;
    private String isbn;
    private String synopsis;
    private String owner;
    private  byte[] cover;
    private double rate;
    private boolean archived;
    private boolean shareable;
}
