package dosopt.server.eqlserver.service.order;

import dosopt.server.eqlserver.api.cart.dto.response.CartItemResponse;
import dosopt.server.eqlserver.api.member.dto.response.MemberResponse;
import dosopt.server.eqlserver.api.order.dto.response.OrderInfoResponse;
import dosopt.server.eqlserver.api.order.dto.response.OrderItemResponse;
import dosopt.server.eqlserver.domain.Cart;
import dosopt.server.eqlserver.domain.Member;
import dosopt.server.eqlserver.global.exception.IllegalArgumentException;
import dosopt.server.eqlserver.repository.CartRepository;
import dosopt.server.eqlserver.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderQueryService {
    private final MemberRepository memberRepository;
    private final CartRepository cartRepository;

    public OrderInfoResponse findMemberOrderInfo(Long memberId){
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException(
                        String.format("존재하지 않는 회원ID(%d) 입니다.", memberId)));

        List<Cart> cartItemInfos = cartRepository.findByMember(member);

        MemberResponse consumerInfo = MemberResponse.fromEntity(member);

        List<CartItemResponse> itemSummaries = cartItemInfos.stream()
                .map(CartItemResponse::fromEntity)
                .toList();

        int totalItemAmount=0;
        int totalItemPrice=0;
        for (CartItemResponse itemSummary : itemSummaries) {
            totalItemAmount+=itemSummary.getAmount();
            totalItemPrice += itemSummary.getGetTotalItemPrice();
        }

        OrderItemResponse orderItemInfo = OrderItemResponse.of(totalItemAmount, totalItemPrice, itemSummaries);

        return new OrderInfoResponse(consumerInfo,orderItemInfo);
    }
}
