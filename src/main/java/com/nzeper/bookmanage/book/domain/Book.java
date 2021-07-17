package com.nzeper.bookmanage.book.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "book_name")
    private String bookName;

    @OneToOne
    private BookAuthor bookAuthor;
}
