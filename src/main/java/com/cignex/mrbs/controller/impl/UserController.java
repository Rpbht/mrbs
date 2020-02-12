package com.cignex.mrbs.controller.impl;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.cignex.mrbs.controller.IUserController;
import com.cignex.mrbs.model.impl.UserImpl;
import com.cignex.mrbs.response.MrbsResponse;
import com.cignex.mrbs.response.impl.SuccessResponse;
import com.cignex.mrbs.service.UserService;
import com.cignex.mrbs.utils.MrbsConstants;

/**
 * The Class UserController.
 *
 * @author rahul.panchal
 */
@Component
public class UserController implements IUserController {

    /**
     * Field userService UserService.
     */
    @Autowired
    private UserService userService;

    /**
     * Method getUserByUserNameAndPassword.
     *
     * @param userName string
     * @param password string
     * @return user by user name and password
     * @throws EntityNotFoundException throws an exception if there isn't any
     *                                 record.
     * @see com.cignex.mrbs.controller.IUserController#getUserByUserNameAndPassword(java.lang.String,java.lang.String)
     */
    @Override
    public MrbsResponse getUserByUserNameAndPassword(String userName, String password) {

	Optional<UserImpl> user = this.userService.findByUserNameAndPassword(userName, password);

	if (!user.isPresent()) {

	    throw new EntityNotFoundException();
	}
	return new SuccessResponse(true, HttpStatus.OK, MrbsConstants.USER_FOUND_MSG, user);
    }

}
