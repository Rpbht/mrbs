package com.cignex.mrbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cignex.mrbs.entity.RoomEntity;

/**
 * The Interface RoomRepository.
 *
 * @author rahul.panchal
 */
@Repository
@Transactional(readOnly = true)
public interface RoomRepository extends JpaRepository<RoomEntity, Long> {

}
