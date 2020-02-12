package com.cignex.mrbs.service;

import java.lang.reflect.Type;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cignex.mrbs.model.impl.UserImpl;
import com.cignex.mrbs.repository.UserRepository;

/**
 * The Class UserService.
 *
 * @author rahul.panchal
 */
@Service
public class UserService {

    /**
     * Field userRepository {@link UserRepository}.
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * Method findByUserNameAndPassword.
     * 
     * @param userName string
     * @param password string
     * 
     * @return {@link UserImpl}
     */
    public Optional<UserImpl> findByUserNameAndPassword(String userName, String password) {
	ModelMapper mapper = new ModelMapper();
	Type userType = new TypeToken<Optional<UserImpl>>() {
	}.getType();
	return mapper.map(this.userRepository.findByUserNameAndPassword(userName, password), userType);
    }

}
