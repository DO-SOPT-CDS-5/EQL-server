package dosopt.server.eqlserver.api.item;

import dosopt.server.eqlserver.service.item.ItemQueryService;
import dosopt.server.eqlserver.service.item.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {
    private final ItemService itemService;
    private final ItemQueryService itemQueryService;
}
