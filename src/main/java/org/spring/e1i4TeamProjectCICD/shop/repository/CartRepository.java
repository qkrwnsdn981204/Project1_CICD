package org.spring.e1i4TeamProjectCICD.shop.repository;

import org.spring.e1i4TeamProjectCICD.member.entity.MemberEntity;
import org.spring.e1i4TeamProjectCICD.shop.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<CartEntity,Long> {
  Optional<CartEntity> findByMemberEntityId(Long id);

  Optional<CartEntity>  findByMemberEntity(MemberEntity memberEntity);


}
