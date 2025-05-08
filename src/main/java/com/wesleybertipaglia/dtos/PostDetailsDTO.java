package com.wesleybertipaglia.dtos;

import java.time.LocalDateTime;

public record PostDetailsDTO(Long id, String author, String content, LocalDateTime createdAt) {
}
