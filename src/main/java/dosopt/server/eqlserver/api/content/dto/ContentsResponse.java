package dosopt.server.eqlserver.api.content.dto;

import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ContentsResponse {
    private final List<ContentResponse> contents;

}
