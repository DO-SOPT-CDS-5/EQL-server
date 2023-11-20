package dosopt.server.eqlserver.api.member.dto.response;

import dosopt.server.eqlserver.domain.Member;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class MemberResponse {
    private final String memberName;
    private final String phoneNumber;
    private final String address;
    private final int postalCode;

    public static MemberResponse fromEntity(final Member member) {
        return MemberResponse.builder()
                .memberName(member.getName())
                .phoneNumber(member.getPhoneNumber())
                .address(member.getAddress())
                .postalCode(member.getPostalCode())
                .build();
    }
}
