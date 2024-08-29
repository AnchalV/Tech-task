package com.techTask.socialNetwork;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialNetworkPostRepository extends JpaRepository<SocialNetworkPost, Long> {

    Page<SocialNetworkPost> findByAuthor(String author, Pageable pageable);

    @Query("SELECT p FROM SocialNetworkPost p WHERE p.postCategory = :category ORDER BY p.viewCount DESC")
    Page<SocialNetworkPost> findTopByCategoryOrderByViewCountDesc(String category, Pageable pageable);
}
