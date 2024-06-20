package org.spring.e1i4TeamProjectCICD.admin.repository;

import org.spring.e1i4TeamProjectCICD.member.entity.MemberEntity;
import org.spring.e1i4TeamProjectCICD.member.role.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AdminRepository extends JpaRepository<MemberEntity,Long> {

    Optional<MemberEntity> findByUserEmail(String userEmail);

    Page<MemberEntity> findByRole(Pageable pageable, Role role);

    Page<MemberEntity> findByRoleAndNameContains(Pageable pageable, @Param("role") Role role, @Param("search") String search);

    Page<MemberEntity> findByRoleAndPhoneNumberContains(Pageable pageable, @Param("role") Role role, @Param("search") String search);

    Page<MemberEntity> findByRoleAndUserEmailContains(Pageable pageable, @Param("role") Role role, @Param("search") String search);


    void deleteByIdIn(List<Long> id);
}




