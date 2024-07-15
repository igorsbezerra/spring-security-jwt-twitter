package dev.igor.security.controller.dto;

public record FeedItems(
        Long tweetId,
        String content,
        String username
) {
}
