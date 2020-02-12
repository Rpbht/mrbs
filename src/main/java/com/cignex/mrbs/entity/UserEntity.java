package com.cignex.mrbs.entity;

import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.cignex.mrbs.enums.Role;
import com.cignex.mrbs.model.IUser;
import com.cignex.mrbs.utils.MrbsConstants;

/**
 * The Class UserEntity.
 *
 * @author rahul.panchal
 */
@Entity
@Table(name = MrbsConstants.USER_TABLE)
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserEntity implements IUser {

    /**
     * Field userId long.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = MrbsConstants.ID_SEQUENCE)
    @Column(name = MrbsConstants.USER_ID)
    private long userId;

    /**
     * Field userName String.
     */
    @Column(name = MrbsConstants.USERNAME)
    private String userName;

    /**
     * Field password String.
     */

    @Column(name = MrbsConstants.PASSWORD)
    private String password;

    /**
     * Field email String.
     */

    @Column(name = MrbsConstants.EMAIL)
    private String email;

    /**
     * Field contactNumber String.
     */

    @Column(name = MrbsConstants.CONTACT_NUMBER)
    private String contactNumber;

    /**
     * Field address String.
     */

    @Column(name = MrbsConstants.ADDRESS)
    private String address;

    /**
     * Field department String.
     */

    @Column(name = MrbsConstants.DEPARTMENT)
    private String department;

    /**
     * Field role {@link Role}.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = MrbsConstants.ROLE)
    private Role role;

    /**
     * Field list of bookings {@link Set}.
     */
    @OneToMany(mappedBy = MrbsConstants.USER_TABLE)
    private Set<BookingEntity> bookings;

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
