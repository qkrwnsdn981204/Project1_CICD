package org.spring.e1i4TeamProjectCICD.seller.repository;

import org.spring.e1i4TeamProjectCICD.member.entity.MemberEntity;
import org.spring.e1i4TeamProjectCICD.member.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SellerRepository extends JpaRepository<MemberEntity,Long> {


    @Query(value = "select m from MemberEntity m where m.role=:role")
    List<MemberEntity> findByRole(@Param("role") Role role);


}
