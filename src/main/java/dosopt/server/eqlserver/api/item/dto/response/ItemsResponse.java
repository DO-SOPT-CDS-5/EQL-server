package dosopt.server.eqlserver.api.item.dto.response;

import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ItemsResponse {
    private final List<ItemResponse> itemInfos;
}
