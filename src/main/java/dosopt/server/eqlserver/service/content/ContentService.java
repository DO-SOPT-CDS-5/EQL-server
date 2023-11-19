package dosopt.server.eqlserver.service.content;

import dosopt.server.eqlserver.repository.ContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ContentService {
    private final ContentRepository contentRepository;
}
