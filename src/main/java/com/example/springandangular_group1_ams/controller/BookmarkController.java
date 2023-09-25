package com.example.springandangular_group1_ams.controller;

import com.example.springandangular_group1_ams.model.request.BookmarkRequest;
import com.example.springandangular_group1_ams.service.BookmarkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/bookmark")
public class BookmarkController {

    private final BookmarkService bookmarkService;
    public BookmarkController(BookmarkService bookmarkService) {

        this.bookmarkService = bookmarkService;
    }


    @PostMapping("/bookmark an article/{userId}")
    public ResponseEntity<?> bookmark(@PathVariable UUID userId, @RequestBody BookmarkRequest bookmarkRequest){
       return ResponseEntity.ok(
               bookmarkService.bookmarkArticle(userId,bookmarkRequest.getArticleId())
               );

    }

}
