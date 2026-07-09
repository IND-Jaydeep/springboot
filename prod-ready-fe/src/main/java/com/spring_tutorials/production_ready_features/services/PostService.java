package com.spring_tutorials.production_ready_features.services;
import com.spring_tutorials.production_ready_features.dto.PostDTO;

import java.util.List;


public interface PostService {

    List<PostDTO> getAllPosts() ;

    PostDTO createNewPost(PostDTO post);

    PostDTO getPostById(Long Id);

}
