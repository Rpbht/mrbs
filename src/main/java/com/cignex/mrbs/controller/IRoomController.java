package com.cignex.mrbs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cignex.mrbs.response.MrbsResponse;
import com.cignex.mrbs.utils.MrbsConstants;

/**
 * The Interface IRoomController.
 *
 * @author rahul.panchal
 */
@RestController
@RequestMapping(value = { MrbsConstants.API_VERSION })
public interface IRoomController {

    /**
     * Gets all rooms.
     *
     * @return all rooms
     */
    @GetMapping(value = MrbsConstants.GET_ROOMS)
    @ResponseBody
    MrbsResponse getAllRooms();

}
