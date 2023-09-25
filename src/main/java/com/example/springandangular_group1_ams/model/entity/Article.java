package com.example.springandangular_group1_ams.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Article {
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private UUID id;
        private String name;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        @ManyToMany(mappedBy = "bookmarks")
        private List<User> bookmarkedBy;


        public Article(UUID articleId) {

        }
}
