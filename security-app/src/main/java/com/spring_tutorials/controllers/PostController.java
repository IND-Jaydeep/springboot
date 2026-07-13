package com.spring_tutorials.production_ready_features.controllers;


import com.spring_tutorials.production_ready_features.dto.PostDTO;
import com.spring_tutorials.production_ready_features.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    public final PostService postService;

    @GetMapping
    public List<PostDTO> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public PostDTO getPostById(@PathVariable Long id){
        return postService.getPostById(id);
    }

    @PostMapping
    public PostDTO createNewPost(@RequestBody PostDTO postDTO){
        return postService.createNewPost(postDTO);
    }
}
