package com.wesleybertipaglia.repositories;

import java.util.List;

import com.wesleybertipaglia.entities.Post;
import com.wesleybertipaglia.settings.Database;

import jakarta.persistence.*;

public class PostRepository {

    public void create(Post post) {
        EntityManager em = Database.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(post);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<Post> findAll() {
        EntityManager em = Database.getEntityManager();
        TypedQuery<Post> query = em.createQuery("FROM Post ORDER BY createdAt DESC", Post.class);
        List<Post> posts = query.getResultList();
        em.close();
        return posts;
    }

    public Post findById(Long id) {
        EntityManager em = Database.getEntityManager();
        Post post = em.find(Post.class, id);
        em.close();
        return post;
    }

    public void update(Post post) {
        EntityManager em = Database.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(post);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void delete(Long id) {
        EntityManager em = Database.getEntityManager();
        try {
            em.getTransaction().begin();
            Post post = em.find(Post.class, id);
            if (post != null) {
                em.remove(post);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
