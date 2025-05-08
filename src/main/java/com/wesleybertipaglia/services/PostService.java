package com.wesleybertipaglia.services;

import com.wesleybertipaglia.entities.Post;
import com.wesleybertipaglia.repositories.PostRepository;

import java.util.List;

public class PostService {

    private PostRepository repository = new PostRepository();

    public void createPost(String author, String content) {
        Post post = new Post(author, content);
        repository.create(post);
    }

    public List<Post> listPosts() {
        return repository.findAll();
    }

    public Post findPostById(Long id) {
        return repository.findById(id);
    }

    public void updatePost(Long id, String newContent) {
        Post post = repository.findById(id);
        if (post != null) {
            post.setContent(newContent);
            repository.update(post);
        }
    }

    public void deletePost(Long id) {
        repository.delete(id);
    }
}
