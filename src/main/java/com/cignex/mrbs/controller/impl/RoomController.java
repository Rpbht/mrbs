package com.cignex.mrbs.controller.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.cignex.mrbs.controller.IRoomController;
import com.cignex.mrbs.model.impl.RoomImpl;
import com.cignex.mrbs.response.MrbsResponse;
import com.cignex.mrbs.response.impl.SuccessResponse;
import com.cignex.mrbs.service.RoomService;
import com.cignex.mrbs.utils.MrbsConstants;

/**
 * The Class RoomController.
 *
 * @author rahul.panchal
 */
@Component
public class RoomController implements IRoomController {

    /**
     * Field roomService RoomService.
     */
    @Autowired
    private RoomService roomService;

    /**
     * @see com.cignex.mrbs.controller.IRoomController#getAllRooms()
     **/
    @Override
    public MrbsResponse getAllRooms() {

	List<RoomImpl> rooms = this.roomService.getAllRooms();

	if (rooms.isEmpty()) {
	    throw new EntityNotFoundException();
	}

	return new SuccessResponse(true, HttpStatus.OK, MrbsConstants.ROOM_FOUND_MSG, rooms);
    }

}
