package com.example.springandangular_group1_ams.service.serviceImpl;

import com.example.springandangular_group1_ams.model.entity.UserBookmark;
import com.example.springandangular_group1_ams.model.entity.User;
import com.example.springandangular_group1_ams.repository.BookmarkRepository;
import com.example.springandangular_group1_ams.repository.UserRepository;
import com.example.springandangular_group1_ams.service.BookmarkService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookmarkServiceImpl implements BookmarkService {
    private final BookmarkRepository bookmarkRepository;
    private final UserRepository userRepository;
    public BookmarkServiceImpl(BookmarkRepository bookmarkRepository, UserRepository userRepository) {
        this.bookmarkRepository = bookmarkRepository;
        this.userRepository = userRepository;
    }


    @Override
    public UserBookmark bookmarkArticle(UUID userId, UUID articleId) {
       List<User> users= userRepository.findAll();
//        User userTemp = new User();
       for(User userTemp: users){
           if (userTemp.getId()== userId  ){

               UserBookmark userBookmark= new UserBookmark(userId,articleId);

               bookmarkRepository.save(userBookmark);

           }
       }

        return null;
    }



}
