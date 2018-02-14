package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import java.util.ArrayList;
import javax.servlet.ServletException;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@Service
public class UserServiceImpl
    implements UserService
{

    private List<User> users = new ArrayList<>();


    @Autowired
    public UserServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {
        users.add( new User( "xyz","test@mail.com", "password", "Andres", "Perez","http://www.elcolombiano.com/documents/10157/0/580x376/0c0/580d365/none/11101/YFHC/image_content_30409342_20180204161416.jpg" ) );
    }


    @Override
    public List<User> getUsers()
    {
        return users;
    }

    @Override
    public User getUser( String username )
    {
        User localUser = null;
        for (int i =0;i<users.size() ;i++){
            if(users.get(i).getUsername().equals(username)){
                localUser=users.get(i);
            }
        }
        return localUser;
    }

    @Override
    public User createUser( User user )throws ServletException
    {
        boolean res = false;
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUsername().equals(user.getUsername())){
                res = true;
                break;
            }
        }if(res){
            throw new ServletException("User name is no available");
        }else{
            users.add(user);
        }return user;
    }

    @Override
    public User findUserByEmail( String email )throws ServletException
    {
        User localUser=null;
        for (int i =0;i<users.size();i++){
            if(users.get(i).getEmail().equals(email)){
                localUser=users.get(i);
            }
        }
        if (localUser==null){
            throw new ServletException ("No user found with the email address");
        }
        return localUser;
    }

    @Override
    public User findUserByEmailAndPassword( String email, String password )
    {
        return users.get( 0 );
    }

    @Override
    public boolean registerUser(String username){
        boolean res = false;
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUsername().equals(username)){
                res = true;
                break;
            }
        }return res;
    }

}
