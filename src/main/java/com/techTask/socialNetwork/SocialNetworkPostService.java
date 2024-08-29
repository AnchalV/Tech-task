package com.techTask.socialNetwork;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class SocialNetworkPostService {

    @Autowired
    private SocialNetworkPostRepository socialNetworkPostRepository;

    @Cacheable(value = "topPosts", key = "#category + '-' + #page + '-' + #size")
    public Page<SocialNetworkPost> getTopPostsByCategory(String category, int page, int size) {
        return socialNetworkPostRepository.findTopByCategoryOrderByViewCountDesc(category, PageRequest.of(page, size));
    }

    @Cacheable(value = "postsByAuthor", key = "#author + '-' + #page + '-' + #size")
    public Page<SocialNetworkPost> searchPostsByAuthor(String author, int page, int size) {
        return socialNetworkPostRepository.findByAuthor(author, PageRequest.of(page, size));
    }

    @Scheduled(fixedRate = 20 * 60 * 1000)
    @CacheEvict(value = {"topPosts", "postsByAuthor"}, allEntries = true)
    public void clearCache(){
        System.out.println("All caches Cleared!");
    }
}
