package org.spring.e1i4TeamProjectCICD.shop.service;

import lombok.RequiredArgsConstructor;
import org.spring.e1i4TeamProjectCICD.member.repository.MemberRepository;
import org.spring.e1i4TeamProjectCICD.member.service.serviceInterface.MemberServiceInterface;
import org.spring.e1i4TeamProjectCICD.shop.repository.ShopLikeRepository;
import org.spring.e1i4TeamProjectCICD.shop.repository.ShopRepository;
import org.spring.e1i4TeamProjectCICD.shop.service.serviceImpl.ShopLikeServiceImpl;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ShopLikeService implements ShopLikeServiceImpl {
  private final MemberRepository memberRepository;
  private final MemberServiceInterface memberServiceInterface;
  private final ShopLikeRepository shopLikeRepository;
  private final ShopRepository shopRepository;




}
