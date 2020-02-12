package com.cignex.mrbs.model;

/**
 * The Interface IRoom.
 *
 * @author rahul.panchal
 */
public interface IRoom {

    /**
     * Gets room id.
     *
     * @return room id
     */
    public long getRoomId();

    /**
     * Sets room id.
     *
     * @param roomId new room id
     */
    public void setRoomId(long roomId);

    /**
     * Gets room name.
     *
     * @return room name
     */
    public String getRoomName();

    /**
     * Sets room name.
     *
     * @param roomName new room name
     */
    public void setRoomName(String roomName);

    /**
     * Gets room location.
     *
     * @return room location
     */
    public String getRoomLocation();

    /**
     * Sets room location.
     *
     * @param roomLocation new room location
     */
    public void setRoomLocation(String roomLocation);

    /**
     * Gets room description.
     *
     * @return room description
     */
    public String getRoomDescription();

    /**
     * Sets room description.
     *
     * @param roomDescription new room description
     */
    public void setRoomDescription(String roomDescription);

}
