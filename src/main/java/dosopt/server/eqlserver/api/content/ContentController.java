package dosopt.server.eqlserver.api.content;

import dosopt.server.eqlserver.service.cart.CartQueryService;
import dosopt.server.eqlserver.service.cart.CartService;
import dosopt.server.eqlserver.service.content.ContentQueryService;
import dosopt.server.eqlserver.service.content.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ContentController {
    private final ContentService contentService;
    private final ContentQueryService contentQueryService;
}
