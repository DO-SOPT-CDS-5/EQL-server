package dosopt.server.eqlserver.api.item.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class ItemResponses {
    private final List<ItemResponse> itemInfos;
}
