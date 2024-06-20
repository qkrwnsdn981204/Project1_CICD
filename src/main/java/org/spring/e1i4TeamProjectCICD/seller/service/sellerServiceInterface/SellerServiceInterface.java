package org.spring.e1i4TeamProjectCICD.seller.service.sellerServiceInterface;

import org.spring.e1i4TeamProjectCICD.member.dto.MemberDto;
import org.spring.e1i4TeamProjectCICD.shop.dto.ShopDto;

import java.util.List;

public interface SellerServiceInterface {
    MemberDto sellerDetail(Long id);

    List<MemberDto> sellerRole();

    List<ShopDto> shopList(Long id);

    int sellerListDelete(Long id);
}
