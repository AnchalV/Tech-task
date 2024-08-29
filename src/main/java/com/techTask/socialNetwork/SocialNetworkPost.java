package com.techTask.socialNetwork;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "social_network_post")
@NoArgsConstructor
public class SocialNetworkPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "post_date")
    private LocalDate postDate;

    @Column(name = "post_category")
    private String postCategory;

    @Column(name = "author")
    private String author;

    @Column(name = "content")
    private String content;

    @Column(name = "view_count")
    private Long viewCount;

    public SocialNetworkPost(Long id, LocalDate postDate, String postCategory, String author, String content, Long viewCount) {
        this.id = id;
        this.postDate = postDate;
        this.postCategory = postCategory;
        this.author = author;
        this.content = content;
        this.viewCount = viewCount;
    }
}
