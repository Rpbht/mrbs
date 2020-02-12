package com.cignex.mrbs.utils;

/**
 * The Interface MrbsConstants.
 *
 * @author rahul.panchal
 */
public interface MrbsConstants {

    // User table constants

    /**
     * Field USER_TABLE String.
     */
    String USER_TABLE = "user";
    /**
     * Field USER_ID String.
     */
    String USER_ID = "userId";
    /**
     * Field USERNAME String.
     */
    String USERNAME = "userName";
    /**
     * Field PASSWORD String.
     */
    String PASSWORD = "password";
    /**
     * Field EMAIL String.
     */
    String EMAIL = "email";
    /**
     * Field CONTACT_NUMBER String.
     */
    String CONTACT_NUMBER = "contactNumber";
    /**
     * Field ADDRESS String.
     */
    String ADDRESS = "address";
    /**
     * Field DEPARTMENT String.
     */
    String DEPARTMENT = "department";
    /**
     * Field ROLE String.
     */
    String ROLE = "role";

    // Room table

    /**
     * Field ROOM_TABLE String.
     */
    String ROOM_TABLE = "room";
    /**
     * Field ROOM_ID String.
     */
    String ROOM_ID = "roomId";
    /**
     * Field ROOM_NAME String.
     */
    String ROOM_NAME = "roomName";
    /**
     * Field ROOM_LOCATION String.
     */
    String ROOM_LOCATION = "roomLocation";
    /**
     * Field ROOM_DESCRIPTION String.
     */
    String ROOM_DESCRIPTION = "roomDescription";

    // Booking table

    /**
     * Field BOOKING_TABLE String.
     */
    String BOOKING_TABLE = "booking";
    /**
     * Field BOOKING_ID String.
     */
    String BOOKING_ID = "bookingId";
    /**
     * Field START_TIME String.
     */
    String START_TIME = "startTime";
    /**
     * Field END_TIME String.
     */
    String END_TIME = "endTime";

    // Common Constants

    /**
     * Field USER_NOT_FOUND_MSG String.
     */
    String ENTITY_NOT_FOUND_MSG = "Entity not found";

    /**
     * Field ID_SEQUENCE String.
     */
    String ID_SEQUENCE = "id_Sequence";

    // UserController Constants

    /**
     * Field LOGIN String.
     */
    String LOGIN = "/login";
    /**
     * Field USER_FOUND_MSG String.
     */
    String USER_FOUND_MSG = "User found successfully";

    /**
     * Field API_VERSION String.
     */
    String API_VERSION = "/api/v1";

    // RoomController Constants

    /**
     * Field GET_ROOMS String.
     */
    String GET_ROOMS = "/rooms";

    /**
     * Field NOT_FOUND_MSG String.
     */
    String NOT_FOUND_MSG = "Request not found";
    /**
     * Field INTERNAL_SERVER_ERROR String.
     */
    String INTERNAL_SERVER_ERROR = "Something went wrong";
    /**
     * Field ROOM_FOUND_MSG String.
     */
    String ROOM_FOUND_MSG = "Room found successfully";
}
