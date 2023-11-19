package dosopt.server.eqlserver.api.content;

import dosopt.server.eqlserver.service.content.ContentQueryService;
import dosopt.server.eqlserver.service.content.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/content")
public class ContentController {
    private final ContentService contentService;
    private final ContentQueryService contentQueryService;
}
