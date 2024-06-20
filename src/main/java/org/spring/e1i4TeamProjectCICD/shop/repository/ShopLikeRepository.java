package org.spring.e1i4TeamProjectCICD.shop.repository;

import org.spring.e1i4TeamProjectCICD.member.entity.MemberEntity;
import org.spring.e1i4TeamProjectCICD.shop.entity.ShopEntity;
import org.spring.e1i4TeamProjectCICD.shop.entity.ShopLikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShopLikeRepository extends JpaRepository<ShopLikeEntity, Long> {

  Optional<ShopLikeEntity> findByShopEntityAndMemberEntity(ShopEntity shopEntity, MemberEntity memberEntity);


}
