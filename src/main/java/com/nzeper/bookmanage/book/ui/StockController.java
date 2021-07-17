package com.nzeper.bookmanage.book.ui;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/stock")
@RestController(value = "/stock")
public class StockController {
    @GetMapping(path = "/books")
    public ResponseEntity<String> getBookStocks() {
        log.debug("getBookStocks");
        return new ResponseEntity<>("book Stock6",HttpStatus.OK);
    }
}
