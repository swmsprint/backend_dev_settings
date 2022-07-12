package sprint.test.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import sprint.test.domain.Member;
import sprint.test.service.MemberService;

import java.io.IOException;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/api/user")
    public String getJson(@RequestBody Member member) throws IOException {
        System.out.println("user_id: "+member.getId()+" user_password"+member.getPassword());
        Member tmpMember = new Member(member.getId(), member.getPassword());

        memberService.join(member);
        return "ok";
    }
}
