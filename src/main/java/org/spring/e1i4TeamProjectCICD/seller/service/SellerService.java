package org.spring.e1i4TeamProjectCICD.seller.service;

import lombok.RequiredArgsConstructor;
import org.spring.e1i4TeamProjectCICD.member.dto.MemberDto;
import org.spring.e1i4TeamProjectCICD.member.entity.MemberEntity;
import org.spring.e1i4TeamProjectCICD.member.role.Role;
import org.spring.e1i4TeamProjectCICD.seller.repository.SellerRepository;
import org.spring.e1i4TeamProjectCICD.seller.service.sellerServiceInterface.SellerServiceInterface;
import org.spring.e1i4TeamProjectCICD.shop.dto.ShopDto;
import org.spring.e1i4TeamProjectCICD.shop.entity.ShopEntity;
import org.spring.e1i4TeamProjectCICD.shop.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SellerService implements SellerServiceInterface {

private final SellerRepository sellerRepository;
private final ShopRepository shopRepository;


    public List<MemberDto> sellerRole() {
        List<MemberEntity> memberDtoList=new ArrayList<>();
        Role role = Role.MANAGER;
        memberDtoList=sellerRepository.findByRole(role);
        return memberDtoList.stream().map(MemberDto::toMemberDto).collect(Collectors.toList());

    }



@Override
public List<ShopDto> shopList(Long id) {
    // 판매자 ID로 판매자 엔티티를 찾습니다.
    MemberEntity memberEntity = sellerRepository.findById(id).orElseThrow(() ->
        new IllegalArgumentException("해당 판매자를 찾을 수 없습니다. ID: " + id));

    // 판매자 엔티티의 ID로 상점 엔티티를 찾습니다.
    List<ShopEntity> shopEntityList = shopRepository.findByMemberEntityId(memberEntity.getId());

    // 상점 엔티티를 DTO로 변환합니다.
    List<ShopDto> shopDtos = shopEntityList.stream().map(ShopDto::toselectShopDto)
        .collect(Collectors.toList());

    return shopDtos;
}

    @Override
    public MemberDto sellerDetail(Long id) {
        MemberEntity memberEntity=sellerRepository.findById(id).orElseThrow(()->{
            throw new IllegalArgumentException("해당 아이디가 없습니다");
        });
        MemberDto memberDto=MemberDto.toMemberDto(memberEntity);
        return memberDto;
    }

    @Override
    public int sellerListDelete(Long id) {
        sellerRepository.deleteById(id);
        return 0;
    }
}
