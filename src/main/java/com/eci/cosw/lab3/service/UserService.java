package com.eci.cosw.lab3.service;

import com.eci.cosw.lab3.model.User;

import java.util.List;
import javax.servlet.ServletException;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
public interface UserService
{
    List<User> getUsers();

    User getUser( String username );

    User createUser( User user ) throws ServletException;

    User findUserByEmail( String email ) throws ServletException;

    User findUserByEmailAndPassword( String email, String password );

    boolean registerUser(String username);
}
