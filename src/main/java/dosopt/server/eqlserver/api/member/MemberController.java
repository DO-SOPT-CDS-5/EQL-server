package dosopt.server.eqlserver.api.member;

import dosopt.server.eqlserver.service.item.ItemQueryService;
import dosopt.server.eqlserver.service.item.ItemService;
import dosopt.server.eqlserver.service.member.MemberQueryService;
import dosopt.server.eqlserver.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    private final MemberQueryService memberQueryService;
}
