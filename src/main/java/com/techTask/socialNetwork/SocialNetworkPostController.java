package com.techTask.socialNetwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class SocialNetworkPostController {

    @Autowired
    private SocialNetworkPostService service;

    @GetMapping("/top/{category}")
    public Page<SocialNetworkPost> getTopPostsByCategory(
            @PathVariable String category,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return service.getTopPostsByCategory(category, page, size);
    }

    @GetMapping("/search")
    public Page<SocialNetworkPost> searchPostsByAuthor(
            @RequestParam String author,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return service.searchPostsByAuthor(author, page, size);
    }
}
