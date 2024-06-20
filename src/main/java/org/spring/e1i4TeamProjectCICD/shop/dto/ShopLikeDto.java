package org.spring.e1i4TeamProjectCICD.shop.dto;

import org.spring.e1i4TeamProjectCICD.member.entity.MemberEntity;
import org.spring.e1i4TeamProjectCICD.shop.entity.ShopEntity;

public class ShopLikeDto {

  private Long id;
  private ShopEntity shopEntity;


  private MemberEntity memberEntity;

  private boolean liked;


}
