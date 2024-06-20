package org.spring.e1i4TeamProjectCICD.shop.repository;

import org.spring.e1i4TeamProjectCICD.shop.entity.CartEntity;
import org.spring.e1i4TeamProjectCICD.shop.entity.CartShopListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartShopListRepository extends JpaRepository<CartShopListEntity,Long> {
  List<CartShopListEntity> findByCartEntityIdAndShopEntityId(Long id, Long shopId);

  List<CartShopListEntity> findAllByCartEntityId(Long id);

  List<CartShopListEntity> findByCartEntity(CartEntity cartEntity);

  void deleteByIdIn(List<Long> ids);

//  List<CartShopListEntity> findByMemberEntityId(Long memberId);
}
