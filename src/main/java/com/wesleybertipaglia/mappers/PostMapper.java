package com.wesleybertipaglia.mappers;

import com.wesleybertipaglia.dtos.PostDetailsDTO;
import com.wesleybertipaglia.dtos.PostSummaryDTO;
import com.wesleybertipaglia.entities.Post;

public class PostMapper {
    public static PostSummaryDTO toSummaryDTO(Post post) {
        return new PostSummaryDTO(post.getId(), post.getAuthor(), post.getContent());
    }

    public static PostDetailsDTO toDetailsDTO(Post post) {
        return new PostDetailsDTO(post.getId(), post.getAuthor(), post.getContent(), post.getCreatedAt());
    }

    public static Post toPostEntity(PostDetailsDTO dto) {
        return new Post(dto.id(), dto.author(), dto.content(), dto.createdAt());
    }
}
