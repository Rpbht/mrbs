package com.cignex.mrbs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cignex.mrbs.entity.UserEntity;

/**
 * The Interface UserRepository.
 *
 * @author rahul.panchal
 */
@Repository
@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    /**
     * Method findByUserNameAndPassword.
     * 
     * @param userName string
     * @param password string
     * 
     * @return {@link UserEntity}
     */
    Optional<UserEntity> findByUserNameAndPassword(String userName, String password);

}
