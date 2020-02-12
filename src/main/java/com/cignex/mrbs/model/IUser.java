package com.cignex.mrbs.model;

import com.cignex.mrbs.enums.Role;

/**
 * The Interface IUser.
 *
 * @author rahul.panchal
 */
public interface IUser {

    /**
     * Gets user id.
     *
     * @return user id
     */
    public long getUserId();

    /**
     * Sets user id.
     *
     * @param userId new user id
     */
    public void setUserId(long userId);

    /**
     * Gets user name.
     *
     * @return user name
     */
    public String getUserName();

    /**
     * Sets user name.
     *
     * @param userName new user name
     */
    public void setUserName(String userName);

    /**
     * Gets password.
     *
     * @return password
     */
    public String getPassword();

    /**
     * Sets password.
     *
     * @param password new password
     */
    public void setPassword(String password);

    /**
     * Gets email.
     *
     * @return email
     */
    public String getEmail();

    /**
     * Sets email.
     *
     * @param email new email
     */
    public void setEmail(String email);

    /**
     * Gets contact number.
     *
     * @return contact number
     */
    public String getContactNumber();

    /**
     * Sets contact number.
     *
     * @param contactNumber new contact number
     */
    public void setContactNumber(String contactNumber);

    /**
     * Gets address.
     *
     * @return address
     */
    public String getAddress();

    /**
     * Sets address.
     *
     * @param address new address
     */
    public void setAddress(String address);

    /**
     * Gets department.
     *
     * @return department
     */
    public String getDepartment();

    /**
     * Sets department.
     *
     * @param department new department
     */
    public void setDepartment(String department);

    /**
     * Gets role.
     *
     * @return role
     */
    public Role getRole();

    /**
     * Sets role.
     *
     * @param role new role
     */
    public void setRole(Role role);

}
