package com.cignex.mrbs.model.impl;

import java.io.Serializable;
import java.util.Set;

import com.cignex.mrbs.enums.Role;
import com.cignex.mrbs.model.IUser;

/**
 * The Class UserImpl.
 *
 * @author rahul.panchal
 */
public class UserImpl implements IUser, Serializable {

    /**
     * Field userId long.
     */
    private long userId;

    /**
     * Field userName String.
     */
    private String userName;

    /**
     * Field password String.
     */
    private String password;

    /**
     * Field email String.
     */
    private String email;

    /**
     * Field contactNumber String.
     */
    private String contactNumber;

    /**
     * Field address String.
     */
    private String address;

    /**
     * Field department String.
     */
    private String department;

    /**
     * Field role {@link Role}.
     */
    private Role role;

    /**
     * Field list of bookings {@link Set}.
     */
    private Set<BookingImpl> bookings;

    /**
     * Field serialVersionUID. (value is 5288183690996866058L) Long
     */
    private static final long serialVersionUID = 5288183690996866058L;

    /**
     * @see com.cignex.mrbs.model.IUser#getUserId()
     **/
    @Override
    public long getUserId() {
	return this.userId;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#setUserId(long)
     **/
    @Override
    public void setUserId(long userId) {
	this.userId = userId;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#getUserName()
     **/
    @Override
    public String getUserName() {
	return this.userName;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#setUserName(java.lang.String)
     **/
    @Override
    public void setUserName(String userName) {
	this.userName = userName;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#getPassword()
     **/
    @Override
    public String getPassword() {
	return this.password;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#setPassword(java.lang.String)
     **/
    @Override
    public void setPassword(String password) {
	this.password = password;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#getEmail()
     **/
    @Override
    public String getEmail() {
	return this.email;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#setEmail(java.lang.String)
     **/
    @Override
    public void setEmail(String email) {
	this.email = email;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#getContactNumber()
     **/
    @Override
    public String getContactNumber() {
	return this.contactNumber;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#setContactNumber(java.lang.String)
     **/
    @Override
    public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#getAddress()
     **/
    @Override
    public String getAddress() {
	return this.address;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#setAddress(java.lang.String)
     **/
    @Override
    public void setAddress(String address) {
	this.address = address;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#getDepartment()
     **/
    @Override
    public String getDepartment() {
	return this.department;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#setDepartment(java.lang.String)
     **/
    @Override
    public void setDepartment(String department) {
	this.department = department;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#getRole()
     **/
    @Override
    public Role getRole() {
	return this.role;
    }

    /**
     * @see com.cignex.mrbs.model.IUser#setRole(com.cignex.mrbs.enums.Role)
     **/
    @Override
    public void setRole(Role role) {
	this.role = role;
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
     * 
     * @see java.lang.Object#toString()
     *
     */
    @Override
    public String toString() {
	return String.format(
		"UserImpl [userId=%s, userName=%s, password=%s, email=%s, contactNumber=%s, address=%s, department=%s, role=%s]",
		this.userId, this.userName, this.password, this.email, this.contactNumber, this.address,
		this.department, this.role);
    }

}
