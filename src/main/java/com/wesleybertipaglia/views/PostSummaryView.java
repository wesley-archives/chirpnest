package com.wesleybertipaglia.views;

import com.wesleybertipaglia.dtos.PostSummaryDTO;
import java.util.List;

public class PostSummaryView {

    public static void displayPosts(List<PostSummaryDTO> posts) {
        if (posts.isEmpty()) {
            System.out.println("\nNo posts available.");
        } else {
            System.out.println("\nPosts");
            posts.forEach(post -> System.out.printf("\n\n 📝 %d - %s\nPreview: %s...",
                    post.id(), post.author(), post.contentPreview()));
        }
    }
}
