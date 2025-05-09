package com.wesleybertipaglia.views;

import com.wesleybertipaglia.dtos.PostSummaryDTO;
import java.util.List;

public class PostSummaryView {

    public static void displayPosts(List<PostSummaryDTO> posts) {
        if (posts.isEmpty()) {
            System.out.println("\nNo posts available.");
        } else {
            System.out.println("\n--- Posts ---");
            posts.forEach(post -> System.out.printf("📝 %d - %s\nPreview: %s...\n",
                    post.id(), post.author(), post.contentPreview()));
        }
    }
}
