package com.cignex.mrbs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cignex.mrbs.response.MrbsResponse;
import com.cignex.mrbs.utils.MrbsConstants;

/**
 * The Interface IUserController.
 *
 * @author rahul.panchal
 */
@RestController
@RequestMapping(value = { MrbsConstants.API_VERSION })
public interface IUserController {

    /**
     * Method getUserByUserNameAndPassword.
     * 
     * @param userName string
     * @param password string
     * 
     * @return {@link MrbsResponse}
     */
    @GetMapping(value = MrbsConstants.LOGIN)
    @ResponseBody
    MrbsResponse getUserByUserNameAndPassword(
	    @RequestParam(value = MrbsConstants.USERNAME, required = true) String userName,
	    @RequestParam(value = MrbsConstants.PASSWORD, required = true) String password);

}
