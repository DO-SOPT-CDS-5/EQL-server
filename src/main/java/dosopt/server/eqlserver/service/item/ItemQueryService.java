package dosopt.server.eqlserver.service.item;

import dosopt.server.eqlserver.api.item.dto.response.ItemResponse;
import dosopt.server.eqlserver.domain.Item;
import dosopt.server.eqlserver.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ItemQueryService {
    private final ItemRepository itemRepository;

    public ItemResponse findItemById(final Long id) {
        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(String.format("존재하지 않는 아이템ID(%d)입니다.", id)));

        return ItemResponse.fromEntity(item);
    }
}
