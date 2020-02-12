package com.cignex.mrbs.model.impl;

import java.io.Serializable;
import java.util.Set;

import com.cignex.mrbs.model.IRoom;

/**
 * The Class RoomImpl.
 *
 * @author rahul.panchal
 */
public class RoomImpl implements Serializable, IRoom {

    /**
     * Field roomId long.
     */
    private long roomId;

    /**
     * Field roomName String.
     */
    private String roomName;

    /**
     * Field roomLocation String.
     */
    private String roomLocation;

    /**
     * Field roomDescription String.
     */
    private String roomDescription;

    /**
     * Field list of bookings {@link Set}.
     */
    private Set<BookingImpl> bookings;

    /**
     * Field serialVersionUID. (value is -2584542984817301501L) Long
     */
    private static final long serialVersionUID = -2584542984817301501L;

    /**
     * @see com.cignex.mrbs.model.IRoom#getRoomId()
     **/
    @Override
    public long getRoomId() {
	return this.roomId;
    }

    /**
     * @see com.cignex.mrbs.model.IRoom#setRoomId(long)
     **/
    @Override
    public void setRoomId(long roomId) {
	this.roomId = roomId;
    }

    /**
     * @see com.cignex.mrbs.model.IRoom#getRoomName()
     **/
    @Override
    public String getRoomName() {
	return this.roomName;
    }

    /**
     * @see com.cignex.mrbs.model.IRoom#setRoomName(java.lang.String)
     **/
    @Override
    public void setRoomName(String roomName) {
	this.roomName = roomName;
    }

    /**
     * @see com.cignex.mrbs.model.IRoom#getRoomLocation()
     **/
    @Override
    public String getRoomLocation() {
	return this.roomLocation;
    }

    /**
     * @see com.cignex.mrbs.model.IRoom#setRoomLocation(java.lang.String)
     **/
    @Override
    public void setRoomLocation(String roomLocation) {
	this.roomLocation = roomLocation;
    }

    /**
     * @see com.cignex.mrbs.model.IRoom#getRoomDescription()
     **/
    @Override
    public String getRoomDescription() {
	return this.roomDescription;
    }

    /**
     * @see com.cignex.mrbs.model.IRoom#setRoomDescription(java.lang.String)
     **/
    @Override
    public void setRoomDescription(String roomDescription) {
	this.roomDescription = roomDescription;
    }

    /**
     * Gets the field list of bookings {@link Set}.
     *
     * @return the field list of bookings {@link Set}
     */
    public Set<BookingImpl> getBookings() {
	return this.bookings;
    }

    /**
     * Sets the field list of bookings {@link Set}.
     *
     * @param bookings the new field list of bookings {@link Set}
     */
    public void setBookings(Set<BookingImpl> bookings) {
	this.bookings = bookings;
    }

    /**
     * Method toString.
     *
     * @return string
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return String.format("RoomImpl [roomId=%s, roomName=%s, roomLocation=%s, roomDescription=%s]", this.roomId,
		this.roomName, this.roomLocation, this.roomDescription);
    }

}
