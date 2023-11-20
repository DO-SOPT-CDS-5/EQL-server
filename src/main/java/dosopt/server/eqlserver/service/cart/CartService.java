package dosopt.server.eqlserver.service.cart;

import dosopt.server.eqlserver.api.cart.dto.request.CartAddRequest;
import dosopt.server.eqlserver.domain.Cart;
import dosopt.server.eqlserver.domain.Item;
import dosopt.server.eqlserver.domain.Member;
import dosopt.server.eqlserver.global.exception.IllegalArgumentException;
import dosopt.server.eqlserver.repository.CartRepository;
import dosopt.server.eqlserver.repository.ItemRepository;
import dosopt.server.eqlserver.repository.MemberRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CartService {
    private final CartRepository cartRepository;
    private final MemberRepository memberRepository;
    private final ItemRepository itemRepository;

    public boolean addItemToCart(CartAddRequest request) {
        Member member = memberRepository.findById(request.getMemberId())
                .orElseThrow(() -> new IllegalArgumentException(
                        String.format("존재하지 않는 회원ID(%d) 입니다.", request.getMemberId())));

        Item item = itemRepository.findById(request.getItemId())
                .orElseThrow(() -> new IllegalArgumentException(
                        String.format("존재하지 않는 상품ID(%d) 입니다.", request.getItemId())));

        Optional<Cart> optionalCart = cartRepository.findByMemberAndItem(member, item);
        if (optionalCart.isPresent()) {
            optionalCart.get().addOneAmount();
            return true;
        }
        cartRepository.save(Cart.newInstance(member, item));
        return false;
    }
}
