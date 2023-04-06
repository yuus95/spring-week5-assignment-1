package com.codesoom.assignment.application.member;

import com.codesoom.assignment.domain.Member;
import com.codesoom.assignment.domain.MemberRepository;
import com.codesoom.assignment.web.shop.member.dto.MemberUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberUpdater {

    private final MemberRepository memberRepository;
    private final MemberReader memberReader;

    public Member update(MemberUpdateRequest memberUpdateRequest) {
        Member member = memberReader.findById(memberUpdateRequest.getId());
        member.update(memberUpdateRequest.getName(), memberUpdateRequest.getPhone());
        return member;
    }
}