-- Migration: add_posts
-- Created at: 20250508201108

-- UP
CREATE TABLE posts (
    id BIGSERIAL PRIMARY KEY,
    author VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL
);

-- DOWN
