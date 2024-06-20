package org.spring.e1i4TeamProjectCICD.shop.repository;

import org.spring.e1i4TeamProjectCICD.shop.entity.ShopEntity;
import org.spring.e1i4TeamProjectCICD.shop.entity.ShopReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShopReplyRepository extends JpaRepository<ShopReplyEntity,Long> {
  List<ShopReplyEntity> findAllByShopEntity(ShopEntity shopEntity);
}
