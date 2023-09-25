package com.example.springandangular_group1_ams.service;

import com.example.springandangular_group1_ams.model.entity.UserBookmark;

import java.util.UUID;

public interface BookmarkService {

    public UserBookmark bookmarkArticle(UUID id, UUID articleId);


}
