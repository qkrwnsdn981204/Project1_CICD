package org.spring.e1i4TeamProjectCICD.shop.dto;

import lombok.*;
import org.spring.e1i4TeamProjectCICD.member.entity.MemberEntity;
import org.spring.e1i4TeamProjectCICD.shop.entity.CartShopListEntity;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CartDto {
    private Long id;

    private MemberEntity memberEntity;

    private List<CartShopListEntity> cartShopListEntityList;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
