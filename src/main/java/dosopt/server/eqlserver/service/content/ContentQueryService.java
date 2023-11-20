package dosopt.server.eqlserver.service.content;

import dosopt.server.eqlserver.api.content.dto.ContentResponse;
import dosopt.server.eqlserver.api.content.dto.ContentsResponse;
import dosopt.server.eqlserver.repository.ContentRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ContentQueryService {
    private final ContentRepository contentRepository;

    public ContentsResponse findAllContents() {
        List<ContentResponse> contents = contentRepository.findAll().stream()
                .map(ContentResponse::fromEntity)
                .toList();

        return new ContentsResponse(contents);
    }
}
