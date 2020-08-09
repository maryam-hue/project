package com.iiui.project;




public class User {
    private String password;
    private String username;
    private int id;

    public User(){

    }

    public User(User user){
        this.username = user.getUsername();
        this.id = user.getId();
    }

    public User(String password, String username){
        this.password=password;
        this.username=username;
    }

    public boolean check(){
        //get the credentials from the DB
        return true;
    }

    public String getPassword(){
        return password;
    }

    public String getUsername(){
        return username;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "user: " + username + "password: " + password;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public void setUsername(String username){
        this.username = username;
    }
}
