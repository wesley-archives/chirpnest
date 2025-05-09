package com.wesleybertipaglia.views;

import com.wesleybertipaglia.dtos.PostDetailsDTO;

public class PostDetailsView {

    public static void displayPostDetails(PostDetailsDTO post) {
        if (post != null) {
            System.out.println("\n--- Post Details ---");
            System.out.printf("📝 ID: %d\n", post.id());
            System.out.printf("Author: %s\n", post.author());
            System.out.printf("Content: %s\n", post.content());
            System.out.printf("Created at: %s\n", post.createdAt());
        } else {
            System.out.println("\nPost not found.");
        }
    }
}
