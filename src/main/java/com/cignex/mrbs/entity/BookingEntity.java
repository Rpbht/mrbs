package com.cignex.mrbs.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.cignex.mrbs.model.IBooking;
import com.cignex.mrbs.utils.MrbsConstants;

/**
 * The Class BookingEntity.
 *
 * @author rahul.panchal
 */
@Entity
@Table(name = MrbsConstants.BOOKING_TABLE)
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class BookingEntity implements IBooking {

    /**
     * Field bookingId long.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = MrbsConstants.ID_SEQUENCE)
    @Column(name = MrbsConstants.BOOKING_ID)
    private long bookingId;

    /**
     * Field user {@link UserEntity}.
     */
    @ManyToOne
    @JoinColumn(name = MrbsConstants.USER_ID, nullable = false)
    private UserEntity user;

    /**
     * Field room {@link RoomEntity}.
     */
    @ManyToOne
    @JoinColumn(name = MrbsConstants.ROOM_ID, nullable = false)
    private RoomEntity room;

    /**
     * Field startTime String.
     */
    @Column(name = MrbsConstants.START_TIME)
    private String startTime;

    /**
     * Field endTime String.
     */
    @Column(name = MrbsConstants.END_TIME)
    private String endTime;

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
    public UserEntity getUser() {
	return this.user;
    }

    /**
     * Sets the field user {@link UserEntity}.
     *
     * @param user the new field user {@link UserEntity}
     */
    public void setUser(UserEntity user) {
	this.user = user;
    }

    /**
     * @see com.cignex.mrbs.model.IBooking#getRoom()
     **/
    @Override
    public RoomEntity getRoom() {
	return this.room;
    }

    /**
     * Sets the field room {@link RoomEntity}.
     *
     * @param room the new field room {@link RoomEntity}
     */
    public void setRoom(RoomEntity room) {
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

}
