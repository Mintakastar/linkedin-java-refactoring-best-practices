package com.raffenio.module4.challenge.four;

public class User {

    private int id;
    private String username;
    private String password;

    // getters and setters

    public void save() {
        Database.saveUser(this);
    }

    public static User getById(int id) {
        return Database.getUserById(id);
    }

    // other methods for managing user data
}



