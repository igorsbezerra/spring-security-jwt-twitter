package dev.igor.security.controller.dto;

import java.util.List;

public record FeedResponse(
        int page,
        int pageSize,
        int totalPage,
        long totalElements,
        List<FeedItems> items
) {
}
