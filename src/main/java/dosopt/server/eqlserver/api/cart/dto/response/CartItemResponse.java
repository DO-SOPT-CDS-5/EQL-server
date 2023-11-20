package dosopt.server.eqlserver.api.cart.dto.response;

import dosopt.server.eqlserver.domain.Cart;
import dosopt.server.eqlserver.domain.Item;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class CartItemResponse {
    private final Long itemId;
    private final int amount;
    private final String itemName;
    private final String brandName;
    private final int getTotalItemPrice;

    public static CartItemResponse fromEntity(final Cart cart) {
        Item item = cart.getItem();
        return CartItemResponse.builder()
                .itemId(item.getId())
                .amount(cart.getAmount())
                .itemName(item.getName())
                .brandName(item.getBrandName())
                .getTotalItemPrice(cart.getAmount() * item.getPrice())
                .build();
    }
}
