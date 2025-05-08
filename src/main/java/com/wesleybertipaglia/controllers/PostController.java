package com.wesleybertipaglia.controllers;

import com.wesleybertipaglia.dtos.PostDetailsDTO;
import com.wesleybertipaglia.dtos.PostSummaryDTO;
import com.wesleybertipaglia.entities.Post;
import com.wesleybertipaglia.mappers.PostMapper;
import com.wesleybertipaglia.services.PostService;
import com.wesleybertipaglia.views.PostDetailsView;
import com.wesleybertipaglia.views.PostSummaryView;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PostController {

    private final PostService service = new PostService();
    private final Scanner scanner = new Scanner(System.in);

    public void list() {
        List<PostSummaryDTO> posts = service.listPosts().stream()
                .map(PostMapper::toSummaryDTO)
                .collect(Collectors.toList());
        PostSummaryView.displayPosts(posts);
    }

    public void getDetails() {
        System.out.print("Enter the post ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        Post post = service.findPostById(id);
        PostDetailsDTO dto = PostMapper.toDetailsDTO(post);
        PostDetailsView.displayPostDetails(dto);
    }

    public void createPost() {
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Content: ");
        String content = scanner.nextLine();
        service.createPost(author, content);
    }

    public void updatePost() {
        System.out.print("Enter the ID of the chirp to edit: ");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.print("New content: ");
        String newContent = scanner.nextLine();
        service.updatePost(id, newContent);
    }

    public void deletePost() {
        System.out.print("Enter the ID of the chirp to delete: ");
        Long id = Long.parseLong(scanner.nextLine());
        service.deletePost(id);
    }
}
