package dosopt.server.eqlserver.service.item;

import dosopt.server.eqlserver.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ItemQueryService {
    private final ItemRepository itemRepository;
}
