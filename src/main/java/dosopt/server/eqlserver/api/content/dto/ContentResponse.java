package dosopt.server.eqlserver.api.content.dto;

import dosopt.server.eqlserver.domain.Content;
import java.util.Arrays;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class ContentResponse {
    private final long contentId;
    private final String title;
    private final String description;
    private final List<String> tags;

    public static ContentResponse fromEntity(final Content content) {
        return ContentResponse.builder()
                .contentId(content.getId())
                .title(content.getTitle())
                .description(content.getDescription())
                .tags(Arrays.stream(content.getTags().split(",")).toList())
                .build();
    }
}
