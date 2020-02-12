package com.cignex.mrbs.model;

/**
 * The Interface IBooking.
 *
 * @author rahul.panchal
 */
public interface IBooking {

    /**
     * Gets booking id.
     *
     * @return booking id
     */
    public long getBookingId();

    /**
     * Sets booking id.
     *
     * @param bookingId new booking id
     */
    public void setBookingId(long bookingId);

    /**
     * Gets user.
     *
     * @return user
     */
    public IUser getUser();

    /**
     * Gets room.
     *
     * @return room
     */
    public IRoom getRoom();

    /**
     * Gets start time.
     *
     * @return start time
     */
    public String getStartTime();

    /**
     * Sets start time.
     *
     * @param startTime new start time
     */
    public void setStartTime(String startTime);

    /**
     * Gets end time.
     *
     * @return end time
     */
    public String getEndTime();

    /**
     * Sets end time.
     *
     * @param endTime new end time
     */
    public void setEndTime(String endTime);

}
