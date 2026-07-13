package com.spring_tutorials.production_ready_features.services;

import com.spring_tutorials.production_ready_features.Exceptions.ResourceNotFoundException;
import com.spring_tutorials.production_ready_features.dto.PostDTO;
import com.spring_tutorials.production_ready_features.entity.PostEntity;
import com.spring_tutorials.production_ready_features.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository ;
    private final ModelMapper modelMapper;

    @Override
    public List<PostDTO> getAllPosts() {
        return postRepository.findAll()
                .stream().map(postEntity ->modelMapper.map(postEntity,PostDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDTO createNewPost(PostDTO postDTO) {
        PostEntity postEntity = modelMapper.map(postDTO,PostEntity.class);
        return modelMapper.map(postRepository.save(postEntity),PostDTO.class);
    }

    @Override
    public PostDTO getPostById(Long Id) {
        PostEntity postEntity =postRepository
                                .findById(Id)
                                .orElseThrow(()-> new ResourceNotFoundException("there is no post with id"+Id));
        return modelMapper.map(postEntity,PostDTO.class);
    }
}
