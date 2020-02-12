package com.cignex.mrbs.entity;

import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.cignex.mrbs.model.IRoom;
import com.cignex.mrbs.utils.MrbsConstants;

/**
 * The Class RoomEntity.
 *
 * @author rahul.panchal
 */
@Entity
@Table(name = MrbsConstants.ROOM_TABLE)
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RoomEntity implements IRoom {

    /**
     * Field roomId long.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = MrbsConstants.ID_SEQUENCE)
    @Column(name = MrbsConstants.ROOM_ID)
    private long roomId;

    /**
     * Field roomName String.
     */
    @Column(name = MrbsConstants.ROOM_NAME)
    private String roomName;

    /**
     * Field roomLocation String.
     */
    @Column(name = MrbsConstants.ROOM_LOCATION)
    private String roomLocation;

    /**
     * Field roomDescription String.
     */
    @Column(name = MrbsConstants.ROOM_DESCRIPTION)
    private String roomDescription;

    /**
     * Field list of bookings {@link Set}.
     */
    @OneToMany(mappedBy = MrbsConstants.ROOM_TABLE)
    private Set<BookingEntity> bookings;

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
    public Set<BookingEntity> getBookings() {
	return this.bookings;
    }

    /**
     * Sets the field list of bookings {@link Set}.
     *
     * @param bookings the new field list of bookings {@link Set}
     */
    public void setBookings(Set<BookingEntity> bookings) {
	this.bookings = bookings;
    }

}
