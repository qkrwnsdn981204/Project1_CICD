package org.spring.e1i4TeamProjectCICD.member.service;

import lombok.RequiredArgsConstructor;
import org.spring.e1i4TeamProjectCICD.member.repository.MemberRepository;
import org.spring.e1i4TeamProjectCICD.member.service.serviceInterface.MemberFileServiceInterface;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberFileService implements MemberFileServiceInterface {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;


}
