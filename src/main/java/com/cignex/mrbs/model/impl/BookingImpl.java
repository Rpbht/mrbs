package com.cignex.mrbs.model.impl;

import java.io.Serializable;

import com.cignex.mrbs.model.IBooking;

/**
 * The Class BookingImpl.
 *
 * @author rahul.panchal
 */
public class BookingImpl implements Serializable, IBooking {

    /**
     * Field bookingId long.
     */
    private long bookingId;

    /**
     * Field user {@link UserImpl}.
     */
    private UserImpl user;

    /**
     * Field room {@link RoomImpl}.
     */
    private RoomImpl room;

    /**
     * Field startTime String.
     */
    private String startTime;

    /**
     * Field endTime String.
     */
    private String endTime;

    /**
     * Field serialVersionUID. (value is -3351809600823108452L) Long
     */
    private static final long serialVersionUID = -3351809600823108452L;

    /**
     * @see com.cignex.mrbs.model.IBooking#getBookingId()
     **/
    @Override
    public long getBookingId() {
	return this.bookingId;
    }

    /**
     * @see com.cignex.mrbs.model.IBooking#setBookingId(long)
     **/
    @Override
    public void setBookingId(long bookingId) {
	this.bookingId = bookingId;
    }

    /**
     * @see com.cignex.mrbs.model.IBooking#getUser()
     **/
    @Override
    public UserImpl getUser() {
	return this.user;
    }

    /**
     * Sets the field user {@link UserImpl}.
     *
     * @param user the new field user {@link UserImpl}
     */
    public void setUser(UserImpl user) {
	this.user = user;
    }

    /**
     * @see com.cignex.mrbs.model.IBooking#getRoom()
     **/
    @Override
    public RoomImpl getRoom() {
	return this.room;
    }

    /**
     * Sets the field room {@link RoomImpl}.
     *
     * @param room the new field room {@link RoomImpl}
     */
    public void setRoom(RoomImpl room) {
	this.room = room;
    }

    /**
     * @see com.cignex.mrbs.model.IBooking#getStartTime()
     **/
    @Override
    public String getStartTime() {
	return this.startTime;
    }

    /**
     * @see com.cignex.mrbs.model.IBooking#setStartTime(java.lang.String)
     **/
    @Override
    public void setStartTime(String startTime) {
	this.startTime = startTime;
    }

    /**
     * @see com.cignex.mrbs.model.IBooking#getEndTime()
     **/
    @Override
    public String getEndTime() {
	return this.endTime;
    }

    /**
     * @see com.cignex.mrbs.model.IBooking#setEndTime(java.lang.String)
     **/
    @Override
    public void setEndTime(String endTime) {
	this.endTime = endTime;
    }

    /**
     * Method toString.
     *
     * @return string
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return String.format("BookingImpl [bookingId=%s, user=%s, room=%s, startTime=%s, endTime=%s]", this.bookingId,
		this.user, this.room, this.startTime, this.endTime);
    }

}
