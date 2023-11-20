package dosopt.server.eqlserver.api.item.dto.response;

import dosopt.server.eqlserver.domain.Item;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class ItemResponse {
    private final long itemId;
    private final String brandName;
    private final String itemName;
    private final int price;

    public static ItemResponse fromEntity(Item item) {
        return ItemResponse.builder()
                .itemId(item.getId())
                .itemName(item.getName())
                .brandName(item.getBrandName())
                .price(item.getPrice())
                .build();
    }
}
