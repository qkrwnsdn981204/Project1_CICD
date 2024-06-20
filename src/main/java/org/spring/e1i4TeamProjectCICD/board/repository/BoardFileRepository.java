package org.spring.e1i4TeamProjectCICD.board.repository;

import org.spring.e1i4TeamProjectCICD.board.entity.BoardFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BoardFileRepository extends JpaRepository<BoardFileEntity, Long> {
    Optional<BoardFileEntity> findByBoardEntityId(Long id);


}
