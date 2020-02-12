package com.cignex.mrbs.service;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cignex.mrbs.model.impl.RoomImpl;
import com.cignex.mrbs.repository.RoomRepository;

/**
 * The Class RoomService.
 *
 * @author rahul.panchal
 */
@Service
public class RoomService {

    /**
     * Field roomRepository {@link RoomRepository}.
     */
    @Autowired
    private RoomRepository roomRepository;

    /**
     * Gets all rooms.
     *
     * @return all rooms
     */
    public List<RoomImpl> getAllRooms() {

	ModelMapper mapper = new ModelMapper();

	Type roomType = new TypeToken<List<RoomImpl>>() {
	}.getType();

	return mapper.map(this.roomRepository.findAll(), roomType);

    }

}
