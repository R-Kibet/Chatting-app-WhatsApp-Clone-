package com.example.clone.Models;

public class Users {
    String profilePic,
           username,
           Email,
           password,
           userId,
           lastMessage,
           Status;

    //create an empty constructor that will be used by the firebase database

    public Users(){

    }


    //create constructors


    public Users(String profilePic, String username, String email, String password, String userId, String lastMessage, String status) {
        this.profilePic = profilePic;
        this.username = username;
        Email = email;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;
        Status = status;
    }

    //create another constructor for the sign up page factoring the 3 field

//used in the sign up
    public Users(String username, String email, String password) {
        this.username = username;
        Email = email;
        this.password = password;
    }


    //generate a getter and setter to hel[p access all the variables

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
