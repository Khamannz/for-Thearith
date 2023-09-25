package com.example.springandangular_group1_ams.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserBookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    public UserBookmark(UUID userId, UUID articleId) {

        this.user= new User(userId);
        this.article= new Article(articleId);
    }

//    private Date bookmarkDate; // Additional attribute for the bookmark action

//    private boolean isBookmark;
}
